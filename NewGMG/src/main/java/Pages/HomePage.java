package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver = PadreClassGMG.getDriver();

    By GiddyLogo = By.id("logo");

    By Login = By.id("login-text");

    By SearchField =By.xpath("//input[@name='search']");

    By SearchBtn = By.id("edit-submit-solr-search");

    By TagSearch = By.xpath("//*[text()='Tag search']");

    By CreateAccountBanner = By.cssSelector("#welcomeBanner > div > p > a");


    By Carousel = By.className("justify-content-right");

    By FooterAuthors = By.cssSelector("#aboutFooterBody > p:nth-child(4) > a");

    By MyAccount = By.id("login-text");


    By VideoBanner = By.cssSelector("#welcomeBanner > div > a");

    By SearchResult = By.cssSelector("#block-themag-st-content > div > div > div > div > div > div:nth-child(1) > div.views-field.views-field-field-perspective-hero > span > div");

    public WebElement getGiddyLogo()
    {
        return driver.findElement(GiddyLogo);
    }

    public WebElement getLogin()
    {
        return driver.findElement(Login);
    }

    public WebElement getSearchField()
    {
        return driver.findElement(SearchField);
    }

    public WebElement getSearchBtn()
    {
        return driver.findElement(SearchBtn);
    }

    public WebElement getCreateAccountBanner(){
        return driver.findElement(CreateAccountBanner);
    }

    public WebElement getTagSearch()
    {
        return driver.findElement(TagSearch);
    }

    public WebElement getCarousel()
    {
        return driver.findElement(Carousel);
    }


    public WebElement getFooterAuthors()
    {
        return driver.findElement(FooterAuthors);
    }

    public WebElement getMyAccount()
    {
        return driver.findElement(MyAccount);
    }

    public WebElement getVideoBanner(){
        return driver.findElement(VideoBanner);
    }

    public WebElement getSearchResult(){
        return driver.findElement(SearchResult);
    }

}
