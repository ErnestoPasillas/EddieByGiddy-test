package Actions;

import Pages.HomePage;
import Utilities.WaitManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class HomeActions {

    HomePage homePage = new HomePage();

    SoftAssert softAssert = new SoftAssert();

    WebDriverWait wait = null;


    public void clickOnTakeQuiz(){
        WaitManager.waitAndClick(homePage.getTakeQuiz());
    }

    public void  clickOnShopeEddie(){
        WaitManager.waitAndClick(homePage.getShopEddie());
    }

    public void clickOnWathED(){
        WaitManager.waitAndClick(homePage.getWatchEdGuide());
    }

    public void clickOnSeeMore(){
        WaitManager.waitAndClick(homePage.getSeeMore());
    }
}
