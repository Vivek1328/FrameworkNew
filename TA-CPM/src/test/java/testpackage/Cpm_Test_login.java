package testpackage;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import Commonhelper.CommonExcel;
import Commonhelper.Utility_helper;

public class Cpm_Test_login extends Utility_Baseclass {

	
	
	
	CommonExcel excel= new CommonExcel();
	@Test
	public void getLigin_details() throws Exception {
		
		Logger=report.createTest("Login Validation");

		System.out.println(driver.getTitle());
		
		pom.Cpm_Login_pom page = PageFactory.initElements(driver, pom.Cpm_Login_pom.class);
		Logger.info("Browser started");
		page.Fetailsenter();
		
		
		//page.EnterLoginDetails(excel.getStringdata("Login", 0, 0), excel.getStringdata("Login", 0, 1), excel.getStringdata("Login", 0, 2));
		page.EnterLoginDetails(excel.getStringdata("Login", 0, 0),excel.getStringdata("Login", 0, 1), excel.getStringdata("Login", 0, 2));
		page.click_on_login();
		
	}

}
