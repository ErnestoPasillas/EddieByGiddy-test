package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TakeQuizPage {
    WebDriver driver = PadreClassEBG.getDriver() ;


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
