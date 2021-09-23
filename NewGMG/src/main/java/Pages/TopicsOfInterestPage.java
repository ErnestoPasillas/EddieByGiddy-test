package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopicsOfInterestPage {
    WebDriver driver = PadreClassGMG.getDriver();

    By UpdateMyInterests = By.id("hideable_container_title");

    By CancelButton = By.id("cancel_button");

    By SaveButton = By.id("submission_button");

    By UnderstandingSTDsSTIs = // By.name("Understanding STDs/STIs");

            By.xpath("//div[@id='to_select_area']//following-sibling::div");

    By FollowUnfollowAccount = By.xpath("//div[text()='Follow Topic' or @value='Unfollow Topic']");

    By RemovedTag = By.xpath("//div[@id='selected_area']//following-sibling::div");

    public WebElement getUpdateMyInterests() {
        return driver.findElement(UpdateMyInterests);
    }

    public WebElement getCancelButton() {
        return driver.findElement(CancelButton);
    }

    public WebElement getSaveButton() {
        return driver.findElement(SaveButton);
    }

    public WebElement getUnderstandingSTDsSTIs() {
        return driver.findElement(UnderstandingSTDsSTIs);
    }

    public WebElement getFollowUnfollowAccount()
    {
        return driver.findElement(FollowUnfollowAccount);
    }

    public WebElement getRemovedTag() {
        return driver.findElement(RemovedTag);
    }

}
