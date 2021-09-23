package Actions;

import Pages.Methods;
import Pages.TopicsOfInterestPage;
import Utilities.WaitManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class TopicsOfInteresActions {


    TopicsOfInterestPage topicsOfInteresPage = new TopicsOfInterestPage();

    SoftAssert softAssert = new SoftAssert();

    WebDriverWait wait = null;



    public void clickOnUpdateMyInterestsBtn()
    {
        WaitManager.waitAndClick(topicsOfInteresPage.getUpdateMyInterests());
    }



    public void clickOnCancelBtn()
    {
        WaitManager.waitAndClick(topicsOfInteresPage.getCancelButton());
    }
    public void clickOnSaveButton()
    {
        WaitManager.waitAndClick(topicsOfInteresPage.getSaveButton());
    }


    public void clickOngetFollowUnfollowAccount()
    {
        WaitManager.waitAndClick(topicsOfInteresPage.getFollowUnfollowAccount());
    }


    public void clickOnUnderstandingSTDsSTIs()
    {
        WaitManager.waitAndClick(topicsOfInteresPage.getUnderstandingSTDsSTIs());
    }

    public void clickOnRemoveTag()
    {
        WaitManager.waitAndClick(topicsOfInteresPage.getRemovedTag());
    }


    public void chooseTopic()
    {
        try {
            Methods.dropdown("edit-topics-and-interests", "6815");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }


    public void chooseSecondSelectTopics()
    {
        try {
            Methods.dropdown("second_select_topics", "6828");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }
}
