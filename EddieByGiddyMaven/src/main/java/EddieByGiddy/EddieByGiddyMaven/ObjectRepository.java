package EddieByGiddy.EddieByGiddyMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectRepository {
	
	WebDriver driver;
	
	public ObjectRepository(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
	}

	By AccountLogin = By.xpath("//a[@href='/login.php']");
	//By Email = By.xpath("//input[@name='name']");
	
	By Email = By.cssSelector("#account-signup-form > fieldset > input[type=text]:nth-child(4)");
	By Password = By.xpath("//input[@name='pass']");
	By Login = By.xpath("//input[@value='Login']");
	
	By CreateAccount = By.xpath("//button[text()='Create Account']");
	

	
	public WebElement getAccountLogin()
	{
		return driver.findElement(AccountLogin);
	}
	
	
	public WebElement EmailId() 
	{	
		return driver.findElement(Email);
	}
	
	
	public WebElement PasswordId() 
	{
		return driver.findElement(Password);
	}
	
	
	public WebElement getLogin()
	{
		return driver.findElement(Login);
	}
	
	public WebElement CreateAccountMT()
	{
		return driver.findElement(CreateAccount);
	}
	//Get the title of Login Page

 
}
