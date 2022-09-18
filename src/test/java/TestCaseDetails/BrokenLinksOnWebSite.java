package TestCaseDetails;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ProjectDetailsResources.BaseClassForAnyBrowserLaunch;

public class BrokenLinksOnWebSite extends BaseClassForAnyBrowserLaunch {
	@Test
	public void BrokenLinksHandlle() throws IOException {
		AnybrowsernewLunch();
		driver.get("https://naveenautomationlabs.com/opencart/");
		List<WebElement> links = driver.findElements(By.linkText("a"));
		System.out.println(links.size());

		for (int i = 0; i > links.size(); i++) {
			WebElement Element = links.get(i);
			String Url = Element.getAttribute("href");
			URL link = new URL(Url);
			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
			httpconn.connect();

			int rescode = httpconn.getResponseCode();
			if (rescode >= 400) {
				System.out.print(Url + ":" + "This is a BrokeLink");
			} else {
				System.out.print(Url + ":" + "This is a valid link");
			}
		}

	}

}
