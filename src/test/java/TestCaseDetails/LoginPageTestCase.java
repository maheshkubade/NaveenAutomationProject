package TestCaseDetails;

import java.io.IOException;

import org.testng.annotations.Test;

import ProjectDetailsResources.BaseClassForAnyBrowserLaunch;
import ProjectDetailsResources.TestCaseData;
import WebSiteObjectDetailsXpath.LoginPageObject;

public class LoginPageTestCase extends BaseClassForAnyBrowserLaunch {

	@Test
	public void Loginpage() throws IOException, InterruptedException {
		AnybrowsernewLunch();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		LoginPageObject lpo = new LoginPageObject(driver);

		lpo.ClickOnMyAccount().click();
		lpo.ClickOnLogin().click();
		Thread.sleep(5000);
		lpo.EnterLoginEmailId().sendKeys(TestCaseData.ValidMail);
		Thread.sleep(7000);
		lpo.EnterLoginPassword().sendKeys(TestCaseData.ConfirmPassword);
		lpo.ClickOnLoginButton().click();
	}
}
