package TestCaseDetails;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import ProjectDetailsResources.BaseClassForAnyBrowserLaunch;
import ProjectDetailsResources.TestCaseData;
import WebSiteObjectDetailsXpath.RegisterPageObjects;

public class RegisterPageTestCase extends BaseClassForAnyBrowserLaunch {
	@Test
	public void RegisterPage() throws IOException, InterruptedException {
		AnybrowsernewLunch();
		driver.get("https://naveenautomationlabs.com/opencart/");

		RegisterPageObjects rpo = new RegisterPageObjects(driver);
		Thread.sleep(2000);
		rpo.ClickOnMyAccount().click();
		Thread.sleep(2000);
		rpo.RegisterPageObject().click();
		Thread.sleep(2000);
		rpo.EnterNaFirstName().sendKeys(TestCaseData.FirstName);
		rpo.EnterNaLastName().sendKeys(TestCaseData.LastName);
		rpo.EnterValidMailId().sendKeys(TestCaseData.ValidMail);
		rpo.EnterValidTelepone().sendKeys(TestCaseData.ValidTelephone);
		rpo.EnterPassword().sendKeys(TestCaseData.EnterPassword);
		rpo.EnterConfirmAllReadyExistingPassword().sendKeys(TestCaseData.ConfirmPassword);

		
		boolean flag=false;
		if(TestCaseData.EnterPassword.equals(TestCaseData.ConfirmPassword)) {
			flag=true;
		}
		System.out.println(flag);
		
		Thread.sleep(5000);
		rpo.RadioBoxClick().click();
		Thread.sleep(2000);
		rpo.CheckedBox().click();
		rpo.ClickContinue().click();
		Thread.sleep(5000);

		// File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(src,new
		// File("C:\\Users\\mahes\\eclipse-workspace\\NaveenAutomationProject\\Screenshot\\image261.png"));

	}

}
