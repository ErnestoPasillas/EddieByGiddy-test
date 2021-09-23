package Actions;

import Pages.AuthorsPage;
import Pages.Methods;
import Pages.PadreClassGMG;
import Utilities.WaitManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class AuthorsActions {

    AuthorsPage authorsPage = new AuthorsPage();

    SoftAssert softAssert = new SoftAssert();

    WebDriverWait wait = null;

    Methods methods = new Methods();

    public static JavascriptExecutor js = PadreClassGMG.js;

    public void clickOnFirstAuthorBtn()
    {

        WaitManager.waitAndClick(authorsPage.getFirstAuthor());


			/*
			 PadreClassGMG.js.executeScript("document.querySelector(\"#block-themag-st-content > div > article > div > div:nth-child(3) > div > div > div > div > div > "
			 		+ "div > div > div > div > div > div:nth-child(1) > div:nth-child(1) > div > span > div > div.right > "
				+ "div.views-field.views-field-name > span > a\").click();");

	 */

    }

    public void clickOnFollowUnfolloAuthorsBtn()
    {
        WaitManager.waitAndClick(authorsPage.getFollowUnFollowAuthors());
    }


    public void clickOnExampleBtn()
    {
        // WaitManager.waitAndClick(authorsPage.getFirtsAuthor());

        Methods.chooseAuthor("Sarah Morris").click();

    }

    public void clickOnTest()
    {
        WaitManager.waitAndClick(authorsPage.getAuthorTest());
    }


    public void clickOnFollowAuthorBtn()
    {
        WaitManager.waitAndClick(authorsPage.getFollowAuthor());

    }

}
