package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.print.DocFlavor;

public class MenuPage {

    WebDriver driver = PadreClassEBG.getDriver() ;

    By EddieLogo = By.className("giddy-logo");

    By Product = By.partialLinkText("/eddie/");

    By HowEddieWorks = By.xpath("//a[@href='/#HowEddieWorks']");

    By Reviews = By.xpath( "//a[@href='/reviews/']");

    By FAQS = By.xpath("//a[@href='/eddie/#faqs/']");

    By AccountLogin = By.className("noMobile navUser-action");

    By Cart = By.className("countPill cart-quantity");

    By BuyNowBtn = By.id("navBarBuyNow");



    public WebElement getEddieLogo(){
        return driver.findElement(EddieLogo);
    }

    public WebElement getProduct(){
        return driver.findElement(Product);
    }

    public WebElement getHowEddieWorks(){
        return driver.findElement(HowEddieWorks);
    }

    public WebElement getReviews(){
        return driver.findElement(Reviews);
    }

    public WebElement getFAQS(){
        return driver.findElement(FAQS);
    }

    public WebElement getAccountLogin(){
        return driver.findElement(AccountLogin);
    }

    public WebElement getCart(){
        return driver.findElement(Cart);
    }

    public WebElement getBuyNowBtn(){
        return driver.findElement(BuyNowBtn);
    }


}
