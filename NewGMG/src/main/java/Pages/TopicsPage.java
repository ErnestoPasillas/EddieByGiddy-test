package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopicsPage {
    WebDriver driver = PadreClassGMG.getDriver();



    By FollowUnfollow = By.xpath("//*[contains(@id,'buttonSave-coretopic-button-')]");
            //By.xpath("//input[@value='Follow Topic' or @value='Unfollow Topic']");



    By SaveUnsave = By.xpath("//*[contains(@id,'buttonSave-article-button-')]");
            //By.xpath("//div[@class='view-footer']");

    //By.xpath("//input[@class='saved button js-form-submit form-submit' or @class='unsaved button js-form-submit form-submit']");
    //By.xpath("//input[@value='Save Article' or @value='Unsave Article']");
    //By.xpath("//input[@class='saved button js-form-submit form-submit' or @class='unsaved button js-form-submit form-submit']");

    // By.xpath("//*[@id=\"block-themag-st-content\"]/div/article/div/div[2]/div/div/div[2]/div/div[4]/div/div/div/div[2]");
    // By.xpath("/html/body/div[2]/div/div[6]/div[2]/div/article/div/div[4]/div/div/div[2]/div/div[4]/div/div/div/div[2]/div[1]/div/div/form/input[2]");


    By FirstTopic = By.className("core-topic-pillar-title");


    By AutorArticle = By.className("author-details");


    public WebElement getFollowUnfollow()
    {
        return driver.findElement(FollowUnfollow);
    }


    public WebElement getSaveUnsaveArticle()

    {
        return driver.findElement(SaveUnsave);
    }

    public WebElement getFirstTopic()

    {
        return driver.findElement(FirstTopic);
    }

    public WebElement getAutorArticle()

    {
        return driver.findElement(AutorArticle);
    }


}
