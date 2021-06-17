package EddieByGiddy.EddieByGiddyMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EDGuidePage {

	
	WebDriver driver;
	
	
	public EDGuidePage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
	}
	
	
	
	By Search = By.id("edit-submit-video-guide-all-videos-");
	By Resualt = By.className("view-grouping-header");
	
	By filter = By.id("edit-field-playlist-target-id-1--cQrXwxPYWrw");	
	
	By AboutGiddyTitle = By.xpath("//a[@href='/taxonomy/term/49']");
	
	
	
	
	public WebElement getSearch()
	{
		return driver.findElement(Search);
	}
	public WebElement getResult()
	{
		return driver.findElement(Resualt);
	}
	
	public WebElement getAboutGiddyTitle()
	{
		return driver.findElement(AboutGiddyTitle);
	}
	
}
