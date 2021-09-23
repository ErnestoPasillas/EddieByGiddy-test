package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    WebDriver driver = PadreClassEBG.getDriver() ;

    By Product = By.xpath("//a[text()='Product']");
    By  Carousel2Pack = By.xpath("//*[@id='two-pack-slide-one']");
    By Carousel1pack = By.id("one-pack-slide-one");
    By Pack2 = By.name("two-pack-size-selection");
    By Pack1 = By.xpath("//*[@id='one-pack-size-selection']/option[2]");
    By Size = By.xpath("//*[@id='two-eddie-size-selection']/option[3]");
    By Size1 = By.xpath("//*[@id='one-eddie-size-selection']/option[3]");
    By AddToCartBtn = By.id("sgpBtn");
    By AddToCart2 =  By.id("otpBtn");
    By EddieOneTime = By.id("one-pack-options-header");
    By  EddieStayGiddyPlan  = By.id("two-pack-options-header");

    /*Check Out Page Objects*/
    By CheckOut = By.xpath("//*[text()='Check out']");  //	driver.findElement(By.xpath("//*[text()='Check out']")).click();
    By ModalT = By.cssSelector("#upSellModal > div > div");
    By ModalHeader = By.cssSelector("#upSellModal > div > div.modal-header");
    By CloseNodal = By.cssSelector("#closeCta");


    public WebElement getProduct(){
        return driver.findElement(Product);
    }
    public WebElement getCarousel2Pack(){
        return driver.findElement(Carousel2Pack);
    }
    public WebElement getCarousel1pack(){
        return driver.findElement(Carousel1pack);
    }
    public WebElement getPack2(){
        return driver.findElement(Pack2);
    }
    public WebElement getPack1(){
        return driver.findElement(Pack1);
    }
    public WebElement getSize(){
        return driver.findElement(Size);
    }
    public WebElement getSize1(){
        return driver.findElement(Size1);
    }
    public WebElement getAddToCartBtn(){
        return driver.findElement(AddToCartBtn);
    }
    public WebElement getAddToCart2(){
        return driver.findElement(AddToCart2);
    }
    public WebElement getEddieOneTime(){
        return driver.findElement(EddieOneTime);
    }
    public WebElement getEddieStayGiddyPlan(){
        return driver.findElement(EddieStayGiddyPlan);
    }
    public WebElement getCheckOut(){
        return driver.findElement(CheckOut);
    }
    public WebElement getModalT(){
        return driver.findElement(ModalT);
    }

}
