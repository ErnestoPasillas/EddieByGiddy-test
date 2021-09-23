package Test;

import Actions.HomeActions;
import Actions.LoginActions;
import Actions.MenuActions;
import Pages.PadreClassGMG;
import org.testng.annotations.Test;

public class HomeTest extends PadreClassGMG {

    HomeActions homeActions = new HomeActions();

    LoginActions loginActions = new LoginActions();

    MenuActions menuActions = new MenuActions();

    @Test
    public void madeSearch()
    {
        homeActions.searchSetText();
        homeActions.clickOnSearchBtn();
    }


    @Test
    public void clickOnTagSearch()
    {
        menuActions.clickOnGiddyLogoBtn();
        homeActions.clickOnTagSearchBtn();
    }

    @Test
    public void clickOnLogin()
    {
        homeActions.clickOnLoginBtn();
    }


}
