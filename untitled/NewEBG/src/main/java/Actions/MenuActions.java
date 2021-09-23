package Actions;

import Pages.MenuPage;
import Utilities.WaitManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class MenuActions {

    MenuPage menuPage = new MenuPage();

    SoftAssert softAssert = new SoftAssert();

    WebDriverWait wait = null;


    public void clickOnAccountLogin(){
        WaitManager.waitAndClick(menuPage.getAccountLogin());
    }

    public void clickOnEddieLogo(){
        WaitManager.waitAndClick(menuPage.getEddieLogo());
    }

    public void clickOnProduct(){
        WaitManager.waitAndClick(menuPage.getProduct());
    }

    public void clickOnHowE() {
        WaitManager.waitAndClick(menuPage.getHowEddieWorks());
    }

    public void clickOnReviews(){
        WaitManager.waitAndClick(menuPage.getReviews());
    }

    public void clickOnFAQS(){
        WaitManager.waitAndClick(menuPage.getFAQS());
    }

    public void clickOnCartBtn(){
        WaitManager.waitAndClick(menuPage.getCart());
    }

    public void clickOnBuyNowBtn(){
        WaitManager.waitAndClick(menuPage.getBuyNowBtn());
    }

}
