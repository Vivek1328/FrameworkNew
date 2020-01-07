package testpackage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pom.Pom_AfterLogin;

public class CPM_Test_AfterLogin extends Utility_Baseclass {

	@Test
	public void dashboard() {
		
		Pom_AfterLogin page = PageFactory.initElements(driver, Pom_AfterLogin.class);
		page.dashboard.click();
		
	}
	
}
