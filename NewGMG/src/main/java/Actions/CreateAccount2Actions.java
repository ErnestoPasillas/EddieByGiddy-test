package Actions;

import Pages.CreateAccountPage;
import Pages.Methods;
import Utilities.WaitManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CreateAccount2Actions {


    CreateAccountPage createAccountPage = new CreateAccountPage();

    SoftAssert softAssert = new SoftAssert();

    WebDriverWait wait = null;



    public void firstNameSetText()
    {
        try {
            WaitManager.waitForElementToBePresent(createAccountPage.getFirstName());


            createAccountPage.getFirstName().sendKeys("QA");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }


    public void lastNameSetText()
    {
        try {
            WaitManager.waitForElementToBePresent(createAccountPage.getLastName());

            // homeCreateAccountPage.getLastName().clear();
            createAccountPage.getLastName().sendKeys("TEST");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }

    public void emailSetText()
    {
        try {
            WaitManager.waitForElementToBePresent(createAccountPage.getEmail());

            createAccountPage.getEmail().clear();
            createAccountPage.getEmail().sendKeys("netoluevano4@gmail.com");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }

    public void passwordSetText()
    {
        try {
            WaitManager.waitForElementToBePresent(createAccountPage.getPassword());

            createAccountPage.getPassword().clear();
            createAccountPage.getPassword().sendKeys("1234");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }


    public void confirmPasswordSetText()
    {
        try {
            WaitManager.waitForElementToBePresent(createAccountPage.getConfirmPass());

            createAccountPage.getConfirmPass().clear();
            createAccountPage.getConfirmPass().sendKeys("1234");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }

    public void chooseGender()
    {
        try {
            Methods.dropdown("edit-gender", "Male");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }

    public void chooseAge()
    {
        try {
            Methods.dropdown("edit-age", "36-45");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }

    public void chooseRace()
    {
        try {
            Methods.dropdown("edit-race", "Latino or Hispanic");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }

    public void clickOnTCPPCheckbox()
    {
        WaitManager.waitAndClick(createAccountPage.getCheckPP());
        createAccountPage.getCheckPP().isSelected();
    }

    public void clickOnAdultCheckbox()
    {
        WaitManager.waitAndClick(createAccountPage.getCheckAdult());
        createAccountPage.getCheckPP().isSelected();
    }

    public void clickOnContinue()
    {
        WaitManager.waitAndClick(createAccountPage.getContinue());
    }
}
