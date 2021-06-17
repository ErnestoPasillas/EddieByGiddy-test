package EddieByGiddy.EddieByGiddyMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	
	
	WebDriver driver;
	
	
	//By TakeQuiz = By.cssSelector("#homepage-slide-one > div > button > a");
	
	
	By TakeQuiz = By.cssSelector("#homepage-slide-one > div > button > a");
	
	By MySelft = By.cssSelector("#QID27 > div.Inner.BorderColor.SAVR > div > fieldset > div > ul > li.Selection.reg");
	
	By MyPartner = By.cssSelector("#QID27-4-label");
	By Age18_34 = By.xpath("(//div[@class='QuestionBody'])/ul/li[1]");
	
	By Overlay = By.id("Overlay");
	
	By Product = By.xpath("//*[text()='Product']");
	
	By HowEddieWorks = By.xpath("//*[text()='How Eddie Works']");
	
	By Reviews = By.xpath("Reviews");
	
	By FAQs = By.xpath("//*[text()='FAQS']");
	
	
	By NetxbtnQuiz = By.id("NextButton");
	
	By EmailQuiz = By.xpath("//div[@class='QuestionBody']/div/input");
	
	By BuyNowQuiz = By.className("ctabutton");
	
	By ActiveCuponCode = By.className(".activeCouponCode");
	


	public HomePage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
	}

	public WebElement TakeQuizM() 
	{
		return driver.findElement(TakeQuiz);
	}
	
	public WebElement MySelftM()
	{
		return driver.findElement(MySelft);
	}

	
	public WebElement getMyPartner()
	{
		return driver.findElement(MyPartner);
	}
	public WebElement getAge18_34M()
	{
		return driver.findElement(Age18_34);
	}
	
	public WebElement getOverlayM()
	{
		return driver.findElement(Overlay);
	}
	
	public WebElement getNetxbtnQuiz()
	{
		return driver.findElement(NetxbtnQuiz);
	}
	
	
	public WebElement getEmailQuiz()
	{
		return driver.findElement(EmailQuiz);	
	}
	
	public WebElement getBuyNowQuiz()
	{
		return driver.findElement(BuyNowQuiz);
	}
	
	public WebElement getActiveCuponCode()
	{
		return driver.findElement(ActiveCuponCode);
	}

}
