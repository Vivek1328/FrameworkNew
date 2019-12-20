package Commonhelper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Factory {

	// public WebDriver driver;

	public static WebDriver webstarted(WebDriver driver, String Browser, String Url) {

		if (Browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
			driver = new ChromeDriver();
		} else if (Browser.equals("mozilla")) {

		} else {
			System.out.println("Browser name invalid");
		}

		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	public static void quitbrowser(WebDriver driver) {
		driver.quit();

	}
}
