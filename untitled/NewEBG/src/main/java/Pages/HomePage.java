package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {


    WebDriver driver = PadreClassEBG.getDriver() ;

    By TakeQuiz = By.id("button-hero-swiper");

    By ShopEddie = By.className("redbtn");

    By WatchEdGuide = By.className("clearbtn");

    By SeeMore = By.className("blue-outline-btn");

    public WebElement getTakeQuiz(){
        return driver.findElement(TakeQuiz);
    }

    public WebElement getShopEddie(){
        return driver.findElement(ShopEddie);
    }

    public WebElement getWatchEdGuide(){
        return driver.findElement(WatchEdGuide);
    }

    public WebElement getSeeMore(){
        return driver.findElement(SeeMore);
    }

}
