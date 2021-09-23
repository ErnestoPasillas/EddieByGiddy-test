package Actions;

import Pages.MenuPage;
import Utilities.WaitManager;

public class MenuActions {


    MenuPage menuPage = new MenuPage();


    public void clickOnGiddyLogoBtn()
    {
        WaitManager.waitAndClick(menuPage.getGiddyLogo());
    }



    public void clickOnExerciseBtn()
    {



        menuPage.getExercise().click();
    }


    public void clickOnMenuOption(String menu) {

        WaitManager.waitForElementToBePresent(menuPage.getMenuOption(menu));
        menuPage.getMenuOption(menu).click();
    }


    public void clickOnSubMenuOption(String subMenu) {

        WaitManager.waitForElementToBePresent(menuPage.getSubMenuOption(subMenu));
        menuPage.getSubMenuOption(subMenu).click();
    }


    public void clickOnFooterOption(String footer) {

        WaitManager.waitForElementToBePresent(menuPage.getFooterOption(footer));
        menuPage.getFooterOption(footer).click();
    }
}
