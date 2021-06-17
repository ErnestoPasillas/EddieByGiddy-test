package EddieByGiddy.EddieByGiddyMaven;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class LinksWorkin extends PadreClassNo   {

	
	
	@Test
	public void linksWorking() throws IOException {
		
		
	

		driver.get("https://getmegiddy.com/");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.xpath("//*[@href]"));

		for (WebElement link : links) {
			// String url = driver.findElement(By.cssSelector("#block-menutest > div > div >
			// p.mens-health > a")).getAttribute("href");

			String url = link.getAttribute("href");
			if (!url.contains("mailto")) {//// para validar que no se tome en cuenta el link de "URL"

				this.driver = driver;
				
				HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

				conn.setRequestMethod("HEAD");
				conn.connect();

				int responseCode = conn.getResponseCode();

				System.out.println(responseCode);
				if (responseCode > 400) {

					System.out.println(
							"The link with text: " + link.getText() + " is broken with code " + responseCode + " \n");

					System.out.println(link.getText());
				//	Assert.assertTrue(false);

				}

			}

		}

	}

}
