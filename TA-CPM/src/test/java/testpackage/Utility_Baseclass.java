package testpackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Commonhelper.Browser_Factory;
import Commonhelper.CommonExcel;
import Commonhelper.Configure_file;
import Commonhelper.Utility_helper;

public class Utility_Baseclass {

	public WebDriver driver;
	public CommonExcel excel;

	public Configure_file c;
	public ExtentReports report;
	public ExtentTest Logger;

	@BeforeSuite
	public void loadfile() {
		c = new Configure_file();
		 excel = new CommonExcel();
		 
		 ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/"+Utility_helper.getcurrentdate()+"/Cpm.html"));
		 report = new ExtentReports();
		 report.attachReporter(extent);
	}

	@BeforeClass
	public void setup() {

		driver = Browser_Factory.webstarted(driver, c.get_browser(), c.get_url());
		System.out.println("test");

	}
	
	@BeforeMethod
	public void SetExtent() {
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("Tested By", "Vivek Choudhary");
	}
	
	@AfterMethod
	public void screenshoton_failure(ITestResult result) throws IOException {
	
		
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			Logger.fail("Test Fail", MediaEntityBuilder.createScreenCaptureFromPath(Utility_helper.getscreeshot(driver)).build());
			Logger.log(Status.FAIL, "Testcase failed is " +result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			Logger.log(Status.PASS, "Testcase pass is " +result.getName());
		}
		else if (result.getStatus()==ITestResult.SKIP) {
			Logger.log(Status.SKIP,"Testcase skip is "+result.getName());
		}
		
		report.flush();
	}

	@AfterClass
	public void terminate() {
		Browser_Factory.quitbrowser(driver);
	}
}
