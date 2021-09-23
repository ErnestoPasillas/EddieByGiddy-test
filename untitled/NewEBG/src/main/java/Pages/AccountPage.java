package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

    WebDriver driver = PadreClassEBG.getDriver() ;

    By AccountInfo = By.className("toggle-dropdown");

    By OrderHistory = By.cssSelector("#pageBody > div.body > div.container > main > nav > div.mobile-nav-wrapper > ul > li.navBar-item.is-active.navBar-action");

    By Subscriptions = By.cssSelector("#pageBody > div.body > div.container > main > nav > div.mobile-nav-wrapper > ul > li:nth-child(3) > span");

    By EddieResize = By.cssSelector("#resize-btn > a");

    By EDGuide = By.cssSelector("#pageBody > div.body > div.container > main > nav > div.mobile-nav-wrapper > ul > li:nth-child(5) > a");

    By Logout = By.cssSelector("#pageBody > div.body > div.container > main > nav > div.mobile-nav-wrapper > ul > li:nth-child(6) > a");

    By PersonalInfo = By.cssSelector("#accountSettings > ul > li:nth-child(1) > a");

    By DeliveryAddresses = By.cssSelector("#accountSettings > ul > li:nth-child(2) > a");


    By SaveAddress = By.xpath("//input[@value='Save Address']");

    By CancelBtn    = By.cssSelector("#pageBody > div.body > div.container > div > div > form > div > a");

    By NewAddress = By.xpath("//span[@class='address-addNew']");

    By EditAddress = By.xpath("//a[text()='Edit Address']");

    By DeleteAddress = By.xpath("(//button[text()='Delete Address'])[1]");

    public WebElement getAccountInfo(){
        return driver.findElement(AccountInfo);
    }

    public WebElement getOrderHistory(){
        return driver.findElement(OrderHistory);
    }

    public WebElement getSubscriptions(){
        return driver.findElement(Subscriptions);
    }

    public WebElement getEddieResize(){
        return driver.findElement(EddieResize);
    }

    public WebElement getEDGuide(){
        return driver.findElement(EDGuide);
    }

    public WebElement getLogout(){
        return driver.findElement(Logout);
    }

    public WebElement getPersonalInfo(){
        return driver.findElement(PersonalInfo);
    }

    public WebElement getDeliveryAddresses(){
        return driver.findElement(DeliveryAddresses);
    }

    public  WebElement getSaveAddress(){
        return  driver.findElement(SaveAddress);
    }

    public WebElement getCancelBtn(){
        return driver.findElement(CancelBtn);
    }

    public WebElement getNewAddress(){
        return driver.findElement(NewAddress);
    }

    public WebElement getEditAddress(){
        return driver.findElement(EditAddress);
    }

    public WebElement getDeleteAddress(){
        return driver.findElement(DeleteAddress);
    }



}
