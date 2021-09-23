package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class PadreClassGMG {

    public static WebDriver driver;

    public static WebDriverWait wait = null;

    public static JavascriptExecutor js = null;

    public static SoftAssert a = null;


    public PadreClassGMG()
    {
        System.setProperty("webdriver.chrome.driver", "//Users//ernestopasillasluevano//Downloads//chromedriver 4");
        driver = new ChromeDriver();


    }



    @BeforeMethod
    public  void setup() throws IOException {


        js = (JavascriptExecutor) driver;
        a = new SoftAssert();
        wait = new WebDriverWait(driver, 20);

        //driver.get("https://dev-giddy.pantheonsite.io/");
       // driver.get("https://getmegiddy.com/");
         //driver.get("https://spu-210721-giddy.pantheonsite.io");
      //  driver.get("https://mu-core-giddy.pantheonsite.io/");
        driver.get("https://ntc-giddy.pantheonsite.io/");
        //driver.get(" http://upd-giddy.pantheonsite.io/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
    }



    @AfterTest
    public void backHome()
    {
        // driver.get("https://dev-giddy.pantheonsite.io/");
        //driver.get("https://getmegiddy.com/");
        //driver.get("https://spu-210721-giddy.pantheonsite.io");
       // driver.get("https://mu-core-giddy.pantheonsite.io/");
       driver.get("https://ntc-giddy.pantheonsite.io/") ;
       //driver.get(" http://upd-giddy.pantheonsite.io/");


    }




    public static  WebDriver getDriver() {
        return driver;
    }



    @AfterTest
	public void closeWindows() {
		driver.quit();

	}

}
