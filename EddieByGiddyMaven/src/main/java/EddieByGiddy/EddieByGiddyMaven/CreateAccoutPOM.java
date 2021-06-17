package EddieByGiddy.EddieByGiddyMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccoutPOM {
	
	WebDriver driver;
	

	CreateAccoutPOM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver = driver;
	}
		 
		 By NextBtn = By.id("na-next-btn");
		 By SubmitBtn = By.name("submit");
		 
		 
		public WebElement NextBtnM() 
		 {
			 return driver.findElement(NextBtn);
		 }

		
		public WebElement SubmitBtnM()
		{
			return driver.findElement(SubmitBtn);
		}
		
	
}
