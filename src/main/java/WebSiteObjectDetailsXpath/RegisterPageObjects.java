package WebSiteObjectDetailsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObjects {
	public WebDriver driver;

	By click = By.xpath("//a[@title='My Account']");
	By RegisterPage = By.xpath("//a[contains (text(),'Register')]");
	By Firstname = By.xpath("//input[@name='firstname']");
	By lastname = By.xpath("//input[@name='lastname']");
	By EmailId = By.xpath("//input[@name='email']");
	By Telephone = By.xpath("//input[@name='telephone']");
	By Password = By.xpath("//input[@name='password']");
	By confirmPassword = By.xpath("//input[@name='confirm']");
	By RadioBox = By.xpath("(//label[@class='radio-inline'])[1]");
	By CheckedBox = By.xpath("//input[@name='agree']");
	By continueclick = By.xpath("//input[@value='Continue']");
	By screenshot1 = By.xpath("//form[@class='form-horizontal']");

	
	public RegisterPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement ClickOnMyAccount() {
		return driver.findElement(click);

	}

	public WebElement RegisterPageObject() {
		return driver.findElement(RegisterPage);

	}

	public WebElement EnterNaFirstName() {
		return driver.findElement(Firstname);
	}

	public WebElement EnterNaLastName() {
		return driver.findElement(lastname);
	}

	public WebElement EnterValidMailId() {
		return driver.findElement(EmailId);
	}

	public WebElement EnterValidTelepone() {
		return driver.findElement(Telephone);
	}

	public WebElement EnterPassword() {
		return driver.findElement(Password);

	}

	public WebElement EnterConfirmAllReadyExistingPassword() {
		return driver.findElement(confirmPassword);
	}

	public WebElement RadioBoxClick() {
		return driver.findElement(RadioBox);
	}

	public WebElement CheckedBox() {
		return driver.findElement(CheckedBox);
	}

	public WebElement ClickContinue() {
		return driver.findElement(continueclick);
	}

	public WebElement TakeScreenShot() {

		return driver.findElement(screenshot1);
	}
}
