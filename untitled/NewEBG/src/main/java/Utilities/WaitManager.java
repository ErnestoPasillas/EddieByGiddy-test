package Utilities;

import Pages.PadreClassEBG;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class WaitManager {



    static WebDriverWait wait = new WebDriverWait(PadreClassEBG.getDriver(), 10);

    static SoftAssert softAssert = new SoftAssert();

    public static  void waitForElementToBePresent( WebElement element )
    {


        try {

            wait = new  WebDriverWait(PadreClassEBG.getDriver(), 10);
            wait.until(ExpectedConditions.visibilityOf(element));

        }catch(NoSuchElementException | TimeoutException e) {
            e.printStackTrace();
        }

    }


    public static void waitAndClick( WebElement element )
    {

        try
        {
            wait = new  WebDriverWait(PadreClassEBG.getDriver(), 10);

            wait.until(ExpectedConditions.elementToBeClickable(element));

            softAssert.assertTrue(element.isDisplayed());
            element.click();
        }catch(NoSuchElementException | TimeoutException e)
        {
            e.printStackTrace();
        }

    }
}
