package EddieByGiddy.EddieByGiddyMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderStatus {
	
	
	WebDriver driver;
	
	
	public OrderStatus(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		 this.driver = driver2;
	}
	
	By AccountInfo = By.cssSelector("#accountSettings > span");  //driver.findElement(By.xpath("//span[text()='Account Info']")).click();
	//By DeliveryAddresses = By.xpath("//a[text()='Delivery Addresses']");	
	By DeliveryAddresses = By.cssSelector("#accountSettings > ul > li:nth-child(2) > a");
	
	By NewAddress = By.xpath("//span[@class='address-addNew']"); //driver.findElement(By.xpath("//span[@class='address-addNew']")).click();
	By SaveAddress = By.xpath("//input[@value='Save Address']"); //driver.findElement(By.xpath("//input[@value='Save Address']")).click();
	By EditAddress = By.xpath("//a[text()='Edit Address']");//driver.findElement(By.xpath("//a[text()='Edit Address']")).click();

	By DeleteAddress = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/button[1]"); ////driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();

	By LogOut = By.xpath("//*[text()='Logout']");
	
	By EDGuide = By.cssSelector("#pageBody > div.body > div.container > main > nav > div.mobile-nav-wrapper > ul > li:nth-child(4) > a");

	By UserIcon = By.id("user-icon");
	
	By LogoutMsg = By.cssSelector("#pageBody > div.body > div.container > div > div.alertBox.alertBox--success > p > span");

	public WebElement getAccountInfo()
	{
		return  driver.findElement(AccountInfo);
	}
	
	
	public WebElement DeliveryAddresses1()
	{
		return driver.findElement(DeliveryAddresses);
	}
	
	public WebElement NewAddress1() 
	{
		return driver.findElement(NewAddress);
	}
	
	
	public WebElement SaveAddress1() 
	{
		return driver.findElement(SaveAddress);
	}
	
	public WebElement EditAddress1() 
	{
		return driver.findElement(EditAddress);
	}
	
	public WebElement getEDGuide()
	{
		return	driver.findElement(EDGuide);
	}
	public WebElement DeleteAddress1()
	{
		return driver.findElement(DeleteAddress);
	}
	
	public WebElement getLogout() 
	{
		return driver.findElement(LogOut);
	}


	public WebElement getUserIcon()
	{
	
		return	driver.findElement(UserIcon);
		
	}
	public WebElement getLogoutMgs() {
		return driver.findElement(LogoutMsg);
	}

}
