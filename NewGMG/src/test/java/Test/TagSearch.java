package Test;

import Actions.HomeActions;
import Actions.MenuActions;
import Actions.TagSearchActions;
import Pages.PadreClassGMG;
import org.testng.annotations.Test;

public class TagSearch extends PadreClassGMG {

    HomeActions homeActions = new HomeActions();
    TagSearchActions tagSearchActions = new TagSearchActions();

    MenuActions menuActions = new MenuActions();



    @Test
    public void tagSearchG() throws InterruptedException
    {
        homeActions.clickOnTagSearchBtn();
        tagSearchActions.tagSearchFieldSetText();
        tagSearchActions.clickOnSearchBtn();
        Thread.sleep(4000);
        menuActions.clickOnGiddyLogoBtn();
    }

    @Test
    public void tagSearchReset() throws InterruptedException
    {
        homeActions.clickOnTagSearchBtn();
        tagSearchActions.tagSearchFieldSetText();
        tagSearchActions.clickOnSearchBtn();
        Thread.sleep(4000);
        tagSearchActions.clickOnResetBtn();
        Thread.sleep(4000);
        menuActions.clickOnGiddyLogoBtn();
    }
}
