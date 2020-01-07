package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pom_AfterLogin {

	
	public WebDriver driver;
	
	
	public Pom_AfterLogin(WebDriver driver) {
	this.driver=driver;	
	}
	
	@FindBy(how=How.XPATH ,using="//a[contains(text(),'Go to Dashboard')]")
	public WebElement dashboard;
}
