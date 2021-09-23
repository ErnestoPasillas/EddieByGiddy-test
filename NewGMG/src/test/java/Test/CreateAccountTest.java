package Test;

import Actions.CreateAccount2Actions;
import Actions.HomeActions;
import Actions.LoginActions;
import Pages.PadreClassGMG;
import org.testng.annotations.Test;

public class CreateAccountTest extends PadreClassGMG {



    HomeActions homeActions = new HomeActions();
    LoginActions loginActions = new LoginActions();

    CreateAccount2Actions createAccountActions = new CreateAccount2Actions();

    @Test
    public void createAccountSuccessfully() throws InterruptedException
    {
        /*Create actions fir this test*/
        homeActions.clickOnLoginBtn();
        loginActions.clickOnCreateAccount();
        Thread.sleep(3000);
        createAccountActions.firstNameSetText();
        createAccountActions.lastNameSetText();
        createAccountActions.emailSetText();
        createAccountActions.passwordSetText();
        createAccountActions.confirmPasswordSetText();
        createAccountActions.chooseGender();
        createAccountActions.chooseAge();
        createAccountActions.chooseRace();
        createAccountActions.clickOnTCPPCheckbox();
        createAccountActions.clickOnAdultCheckbox();
        createAccountActions.clickOnContinue();
    }

    @Test
    public void createAccountMissingCheckBox() throws InterruptedException
    {
        homeActions.clickOnLoginBtn();

        loginActions.clickOnCreateAccount();
        Thread.sleep(4000);
        createAccountActions.firstNameSetText();
        createAccountActions.lastNameSetText();
        createAccountActions.emailSetText();
        createAccountActions.passwordSetText();
        createAccountActions.confirmPasswordSetText();
        createAccountActions.chooseGender();
        createAccountActions.chooseAge();
        createAccountActions.chooseRace();
        createAccountActions.clickOnContinue();

    }

    @Test
    public void createAccountBannerWay() throws InterruptedException
    {
        homeActions.clickOnCreateAccountBanner();
        Thread.sleep(4000);
        createAccountActions.firstNameSetText();
        createAccountActions.lastNameSetText();
        createAccountActions.emailSetText();
        createAccountActions.passwordSetText();
        createAccountActions.confirmPasswordSetText();
        createAccountActions.chooseGender();
        createAccountActions.chooseAge();
        createAccountActions.chooseRace();
        createAccountActions.clickOnTCPPCheckbox();
        createAccountActions.clickOnAdultCheckbox();
        createAccountActions.clickOnContinue();

    }

}
