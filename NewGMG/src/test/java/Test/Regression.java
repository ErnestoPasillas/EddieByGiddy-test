package Test;

import Actions.*;
import Models.FooterMenu;
import Models.HeaderMenuEnum;
import Models.SubHeaderOptions;
import Pages.PadreClassGMG;
import org.testng.annotations.Test;



public class Regression  extends PadreClassGMG {


    HomeActions homeActions = new HomeActions();
    TagSearchActions tagSearchActions = new TagSearchActions();
    MenuActions menuActions = new MenuActions();
    LoginActions loginActions = new LoginActions();
    TopicActions topicActions = new TopicActions();
    AuthorsActions authorsActions = new AuthorsActions();
    AccountActions accountActions = new AccountActions();
    TopicsOfInteresActions topicsOfInteresActions = new TopicsOfInteresActions();

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
    public void searchEducation(){
        homeActions.searchSetText();
        homeActions.clickOnSearchBtn();
        homeActions.searchResultValidation();
    }


    @Test
    public void searchWrongText(){
        homeActions.searchSetWrongText();
        homeActions.clickOnSearchBtn();

    }

    @Test
    public void searchEmptyField(){

        homeActions.clickOnSearchBtn();

    }


@Test
    public void playVideo() throws InterruptedException {
    Thread.sleep(4000);
        homeActions.clickOnWatchVideo();

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


    @Test()
    public void followAuthors() throws InterruptedException
    {
        Thread.sleep(2000);
        homeActions.clickOnLoginBtn();
        //	Thread.sleep(2000);
        loginActions.emailSetText();
        loginActions.passwordSetText();
        loginActions.clickOnLoginBtn();
        //	Thread.sleep(2000);
        menuActions.clickOnFooterOption(FooterMenu.OUR_AUTHORS.getFooterOption());
        //	Thread.sleep(4000);
        authorsActions.clickOnFirstAuthorBtn();
        Thread.sleep(4000);
        authorsActions.clickOnFollowUnfolloAuthorsBtn();

        homeActions.clickOnMyAccount();
        accountActions.clickOnSingOut();

    }

    @Test()
    public void followAuthorsArticle() throws InterruptedException
    {
        Thread.sleep(2000);
        homeActions.clickOnLoginBtn();
        Thread.sleep(2000);
        loginActions.emailSetText();
        loginActions.passwordSetText();
        loginActions.clickOnLoginBtn();
        menuActions.clickOnGiddyLogoBtn();
        homeActions.clickOnCarouselBtn();
        topicActions.clickOnAuthorBtn();
        Thread.sleep(3000);
        authorsActions.clickOnFollowUnfolloAuthorsBtn();
        homeActions.clickOnMyAccount();
        accountActions.clickOnSingOut();


    }


    @Test()
    public void followTopicMensHealth() throws InterruptedException
    {
        homeActions.clickOnLoginBtn();
        Thread.sleep(2000);
        loginActions.emailSetText();
        loginActions.passwordSetText();
        loginActions.clickOnLoginBtn();
        Thread.sleep(2000);
        menuActions.clickOnMenuOption(HeaderMenuEnum.MENS_HEALTH.getMenuOption());
        Thread.sleep(2000);
        menuActions.clickOnSubMenuOption(SubHeaderOptions.PROSTATE_HEALTH.getSubMenuOption());
        topicActions.clickOnFirstTopicBtn();

        Thread.sleep(4000);
        topicActions.clickOnFollowUnfollowBtn();
        homeActions.clickOnMyAccount();
        accountActions.clickOnSingOut();

    }


    @Test()
    public void saveUnsaveArticleMenu() throws InterruptedException
    {

        /*Save Unsave article by Menu*/
        homeActions.clickOnLoginBtn();
        Thread.sleep(2000);
        loginActions.emailSetText();
        loginActions.passwordSetText();
        loginActions.clickOnLoginBtn();
        Thread.sleep(2000);
        //menuActions.clickOnGiddyLogoBtn();
        menuActions.clickOnMenuOption(HeaderMenuEnum.MENS_HEALTH.getMenuOption());
        Thread.sleep(2000);
        menuActions.clickOnSubMenuOption(SubHeaderOptions.ERECTILE_DYSFUNCTION.getSubMenuOption());
        Thread.sleep(2000);
        topicActions.clickOnFirstTopicBtn();
        topicActions.clickOnSaveUnsaveBtn();

        homeActions.clickOnMyAccount();
        accountActions.clickOnSingOut();

    }

    @Test
    public void saveUnsaveArticleHomePage() throws InterruptedException
    {

        /*Save Unsave article by HomePage*/
        homeActions.clickOnLoginBtn();
        Thread.sleep(2000);
        loginActions.emailSetText();
        loginActions.passwordSetText();
        loginActions.clickOnLoginBtn();
        Thread.sleep(2000);
        homeActions.clickOnCarouselBtn();
        topicActions.clickOnSaveUnsaveBtn();
        homeActions.clickOnMyAccount();
        accountActions.clickOnSingOut();
    }

    @Test
    public void addTopicsOfInterestSaveButton() throws InterruptedException
    {
        homeActions.clickOnLoginBtn();
        Thread.sleep(2000);
        loginActions.emailSetText();
        loginActions.passwordSetText();
        loginActions.clickOnLoginBtn();
        homeActions.clickOnMyAccount();
        accountActions.clickOnTopicsOfInterestBtn();
        topicsOfInteresActions.clickOnUpdateMyInterestsBtn();
        topicsOfInteresActions.chooseTopic();
        Thread.sleep(2000);
        topicsOfInteresActions.chooseSecondSelectTopics();
        Thread.sleep(2000);
        topicsOfInteresActions.clickOnUnderstandingSTDsSTIs();
        topicsOfInteresActions.clickOnSaveButton();
        homeActions.clickOnMyAccount();
        accountActions.clickOnSingOut();


    }


    @Test
    public void removedTopicsOfInterestSaveButton() throws InterruptedException
    {
        homeActions.clickOnLoginBtn();
        Thread.sleep(2000);
        loginActions.emailSetText();
        loginActions.passwordSetText();
        loginActions.clickOnLoginBtn();
        homeActions.clickOnMyAccount();
        accountActions.clickOnTopicsOfInterestBtn();
        topicsOfInteresActions.clickOnUpdateMyInterestsBtn();
        topicsOfInteresActions.chooseTopic();
        Thread.sleep(2000);
        topicsOfInteresActions.chooseSecondSelectTopics();
        Thread.sleep(2000);
        topicsOfInteresActions.clickOnRemoveTag();
        topicsOfInteresActions.clickOnSaveButton();
        homeActions.clickOnMyAccount();
        accountActions.clickOnSingOut();
    }

    @Test
    public void removedTopicsOfInterestCancelButton() throws InterruptedException
    {
        homeActions.clickOnLoginBtn();
        Thread.sleep(2000);
        loginActions.emailSetText();
        loginActions.passwordSetText();
        loginActions.clickOnLoginBtn();
        homeActions.clickOnMyAccount();
        accountActions.clickOnTopicsOfInterestBtn();
        topicsOfInteresActions.clickOnUpdateMyInterestsBtn();
        topicsOfInteresActions.chooseTopic();
        Thread.sleep(2000);
        topicsOfInteresActions.chooseSecondSelectTopics();
        Thread.sleep(2000);
        topicsOfInteresActions.clickOnRemoveTag();
        topicsOfInteresActions.clickOnCancelBtn();
        homeActions.clickOnMyAccount();
        accountActions.clickOnSingOut();
    }

    @Test
    public void addTopicsOfInterestCancelButton() throws InterruptedException
    {
        homeActions.clickOnLoginBtn();
        Thread.sleep(2000);
        loginActions.emailSetText();
        loginActions.passwordSetText();
        loginActions.clickOnLoginBtn();
        homeActions.clickOnMyAccount();
        Thread.sleep(2000);
        accountActions.clickOnTopicsOfInterestBtn();
        topicsOfInteresActions.clickOnUpdateMyInterestsBtn();
        topicsOfInteresActions.chooseTopic();
        Thread.sleep(2000);
        topicsOfInteresActions.chooseSecondSelectTopics();
        topicsOfInteresActions.clickOnCancelBtn();
        homeActions.clickOnMyAccount();
        accountActions.clickOnSingOut();
    }

/*

    @Test
    public void followTopicAccount() throws InterruptedException
    {
        homeActions.clickOnLoginBtn();
        Thread.sleep(2000);
        loginActions.emailSetText();
        loginActions.passwordSetText();
        loginActions.clickOnLoginBtn();
        homeActions.clickOnMyAccount();
        Thread.sleep(2000);
        accountActions.clickOnTopicsOfInterestBtn();
        Thread.sleep(2000);
        topicsOfInteresActions.clickOngetFollowUnfollowAccount();
        homeActions.clickOnMyAccount();
        accountActions.clickOnSingOut();
    }
*/

    CreateAccount2Actions  createAccountActions = new CreateAccount2Actions();

    @Test
    public void createAccountSuccesfull() throws InterruptedException
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
    public void createAccountMissinngCheckBox() throws InterruptedException
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
    public void createAccounBannerWay() throws InterruptedException
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
