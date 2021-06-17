package EddieByGiddy.EddieByGiddyMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
	
	WebDriver driver;
	
	
	ProductsPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		 this.driver = driver2;
	}

	
	By Product = By.xpath("//a[text()='Product']");
	By Carouseel2Pack = By.xpath("//*[@id='two-pack-slide-one']");
	By Carousel1Pack = By.id("one-pack-slide-one");
	By Pack2 = By.name("two-pack-size-selection");
	By Pack1S = By.xpath("//*[@id='one-pack-size-selection']/option[2]");
	By Size = By.xpath("//*[@id='two-eddie-size-selection']/option[3]"); //driver.findElement(By.xpath("//*[@id='two-eddie-size-selection\']/option[3]")).click();
	By Size1 = By.xpath("//*[@id='one-eddie-size-selection']/option[3]");
	By AddToCartButton = By.id("sgpBtn");
	By AddToCart2 = By.id("otpBtn");
	
	By EddieOneTime = By.id("one-pack-options-header");
	By EddieStayGiddyPlan = By.id("two-pack-options-header");
	
	
	
	/*Check Out Page Objects*/
	By CheckOut = By.xpath("//*[text()='Check out']");  //	driver.findElement(By.xpath("//*[text()='Check out']")).click();

	By ModalT = By.cssSelector("#upSellModal > div > div");
	
	By ModalHeader = By.cssSelector("#upSellModal > div > div.modal-header");
	
	By CloseNodal = By.cssSelector("#closeCta");
	
	
	
	
	 
	public WebElement ProductOP() 
	{
		return driver.findElement(Product);
	}
	public WebElement Carouseel2PackUI()
	{
		return driver.findElement(Carouseel2Pack);
		
	}
	
	public WebElement Pack2U() 
	{
		return driver.findElement(Pack2);
	}
	
	public WebElement Pack1S()
	{
		return driver.findElement(Pack1S);
	}
	
	public WebElement Size2() 
	{
		return driver.findElement(Size);
	}
	
	public WebElement Size1()
	{
		return driver.findElement(Size1);
	}
	
	public WebElement AddToCart()
	{
		return driver.findElement(AddToCartButton);
		
	}
	
	public WebElement AddToCartBtn2()
	{
		return driver.findElement(AddToCart2);
	}
	
	public WebElement EddieOneTimeOP()
	{
		return driver.findElement(EddieOneTime);
	}
	
	public WebElement EddieStayGiddyPlanOP() 
	{
		return driver.findElement(EddieStayGiddyPlan);
	}
	
	
	public WebElement CheckOutBtn() 
	{
		return driver.findElement(CheckOut);
	}
	
	public WebElement CloseNodalC() 
	{
		return driver.findElement(CloseNodal);
	}
	
	public WebElement ModalTM() 
	{
		return driver.findElement(ModalT);
	}
	
	public WebElement ModalHeaderMD() {
		return driver.findElement(ModalHeader);
	}
}
