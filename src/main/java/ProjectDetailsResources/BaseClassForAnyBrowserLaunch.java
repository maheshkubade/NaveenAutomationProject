package ProjectDetailsResources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassForAnyBrowserLaunch {
	public WebDriver driver;
	public Properties proty;

	public WebDriver AnybrowsernewLunch() throws IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\mahes\\eclipse-workspace\\NaveenAutomationProject\\src\\main\\java\\ProjectDetailsResources\\DataNew.properties");

		proty = new Properties();

		proty.load(file);

		String browserName = proty.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			// Firefox

		} else if (browserName.equalsIgnoreCase("Edge")) {

			// edge

		} else {

			System.out.print("not browser found");
		}
		return driver;
	}

//	@AfterMethod
//	public void CloseTheAllBrowser() {
//
//		driver.close();
//	}
}
