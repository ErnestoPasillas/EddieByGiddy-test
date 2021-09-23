package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {


    WebDriver driver;


    By SingOut = By.xpath("//a[@href='/user/logout']");

    public WebElement getSingOut()
    {
        return driver.findElement(SingOut);
    }
}
