package Actions;

import Pages.TagSearchPage;
import Utilities.WaitManager;
import org.openqa.selenium.NoSuchElementException;

public class TagSearchActions {


    TagSearchPage tagSearchActions = new TagSearchPage();

    public void tagSearchFieldSetText()
    {
        try {
            WaitManager.waitForElementToBePresent(tagSearchActions.getTagSeachField());

            tagSearchActions.getTagSeachField().clear();
            tagSearchActions.getTagSeachField().sendKeys("sex");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }


    public void clickOnSearchBtn()
    {
        WaitManager.waitAndClick(tagSearchActions.getSearchTagBtn());

    }



    public void clickOnResetBtn()
    {
        WaitManager.waitAndClick(tagSearchActions.getReset());

    }
}
