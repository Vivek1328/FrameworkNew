package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Cpm_Login_pom {

	public WebDriver driver;
	public WebDriverWait wait;
	
	public Cpm_Login_pom(WebDriver driver) {
		this.driver=driver;
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Login")
	public WebElement login_button;
	
	@FindBy(how=How.XPATH,using="//input[@type=\"email\"]")
	WebElement Email_input;
	
	@FindBy(how=How.XPATH,using="//input[@type=\"password\"]")
	WebElement Password_input;
	
	@FindBy(how=How.XPATH,using="//div[@class='col-md-12']//input[@class='form-control ng-untouched ng-pristine ng-invalid']")
	WebElement OrganizationName_Input;
	
	@FindBy(how=How.XPATH,using="//input[@value='Login']")
	WebElement Loginbutton;
	
	//@FindBy(how=How.XPATH,using="//input[@value='Login']")
	//WebElement Loginbutton;
	
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'OK')]")
	public
	WebElement ok_button;
	
	public void Fetailsenter() throws Exception {
		
		login_button.click();
		Thread.sleep(5000L);
		//Email_input.sendKeys("tatech@yopmail.com");
		//Password_input.sendKeys("wd69gi8m");
		//OrganizationName_Input.sendKeys("ta-tech");
	}
	
	public void EnterLoginDetails(String Email,String password,String Org_name) {
		Email_input.sendKeys(Email);
		Password_input.sendKeys(password);
		OrganizationName_Input.sendKeys(Org_name);
	}
	public void click_on_login() throws Exception {
		Loginbutton.click();
		Thread.sleep(5000);
		//WebElement ok=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='OK']")));
		//ok.click();
	}
}
