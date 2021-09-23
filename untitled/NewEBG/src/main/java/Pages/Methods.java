package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Methods {


    public static WebElement accountInfo(String field) {
        WebDriver driver = PadreClassEBG.getDriver() ;

        WebElement createAccount = driver.findElement(By.xpath("//label[contains (text(),\"" + field + "\")]/following-sibling::input "));
        ///// label[contains (text(),'Last N')]/following-sibling::input

        return createAccount;
    }


    public static void stateProvince(String drop2, String state) {

        WebDriver driver = PadreClassEBG.getDriver() ;
        WebElement selectState = driver.findElement(By.name(drop2));

        Select dropdown2 = new Select(selectState);
        dropdown2.selectByValue(state);
    }




}
