package Commonhelper;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


public class Utility_helper {

	
	public static String getscreeshot(WebDriver driver) {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Screenshot = System.getProperty("user.dir")+"/Screenshot/"+getcurrentdate()+".png";
		try {
			FileHandler.copy(src, new File ("./Screenshot/"+getcurrentdate()+".png"));
			
			System.out.println("Screenshot captured successfully");
		} catch (IOException e) {
			System.out.println("ScreenShot not captured"+e.getMessage());
			
		}
		return Screenshot;
	}
	
	public static String getcurrentdate() {
		
		DateFormat Customformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date currentdate= new Date();
		
		return Customformat.format(currentdate);
		
		
	}
	
	public static void actionclass(WebDriver driver,WebElement Element) {
		
		Actions a= new Actions(driver);
		a.clickAndHold(Element);
		
	}
}
