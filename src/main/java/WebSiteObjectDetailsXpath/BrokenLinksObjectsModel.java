package WebSiteObjectDetailsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinksObjectsModel {
	public WebDriver driver;
	By BrokenLink = By.xpath("(//div[@class='container'])[5]");

public WebElement BrokenLinksOnWebsite() {
	return driver.findElement(BrokenLink);
}}
