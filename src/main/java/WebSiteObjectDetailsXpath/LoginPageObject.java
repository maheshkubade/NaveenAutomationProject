package WebSiteObjectDetailsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	public WebDriver driver;
	By click = By.xpath("//a[@title='My Account']");
	By LoginPage = By.xpath("//a[contains (text(),'Login')]");
	By EnterValidEmailId = By.xpath("//input[@name='email']");
	By EnterValidPassword = By.xpath("//input[@id='input-password']");
	By LoginClickButton = By.xpath("//input[@type='submit']");

	public LoginPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement ClickOnMyAccount() {
		return driver.findElement(click);

	}

	public WebElement ClickOnLogin() {
		return driver.findElement(LoginPage);

	}

	public WebElement EnterLoginEmailId() {
		return driver.findElement(EnterValidEmailId);
	}

	public WebElement EnterLoginPassword() {
		return driver.findElement(EnterValidPassword);
	}

	public WebElement ClickOnLoginButton() {
		return driver.findElement(LoginClickButton);
	}
}