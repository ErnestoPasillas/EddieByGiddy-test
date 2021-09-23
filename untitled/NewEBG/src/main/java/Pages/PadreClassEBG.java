package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class PadreClassEBG {

    public static WebDriver driver;

    public static WebDriverWait wait = null;

    public static JavascriptExecutor js = null;

    public static SoftAssert a = null;


    public PadreClassEBG()
    {
        System.setProperty("webdriver.chrome.driver", "//Users//ernestopasillasluevano//Downloads//chromedriver 3");
        driver = new ChromeDriver();
    }



    @BeforeMethod
    public  void setup() throws IOException {


        js = (JavascriptExecutor) driver;
        a = new SoftAssert();
        wait = new WebDriverWait(driver, 20);

        driver.get("https://eddiebygiddy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
    }



    @AfterTest
    public void backHome()
    {
        driver.get("https://eddiebygiddy.com/");
    }




    public static  WebDriver getDriver() {
        return driver;
    }

/*

    @AfterTest
	public void closeWindows() {
		driver.quit();

	}
*/
}
