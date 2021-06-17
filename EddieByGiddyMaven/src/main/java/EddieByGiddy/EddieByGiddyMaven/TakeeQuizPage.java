package EddieByGiddy.EddieByGiddyMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;





public class TakeeQuizPage {
	
	WebDriver driver;
	
	public TakeeQuizPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public void TakeQuizPage(WebDriver  driver)
	{
		this.driver = driver;
	}

	public WebElement getQuizOption (String option) 
	{
		
		By Locator = By.xpath("(//div[@class='QuestionBody'])/ul/li[1]["+ option + "]");
		
		return driver.findElement(Locator);
	}
	
	public WebElement getQuizOptionPartner (String option) 
	{
		
		
		By Locator2 = By.xpath("(//div[@class='QuestionBody'])/ul/li[2]["+ option + "]");
		
		return driver.findElement(Locator2);
	}

}
