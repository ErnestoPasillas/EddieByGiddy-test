package EddieByGiddy.EddieByGiddyMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;





@Test
public class TakeeQuisSelftTest  extends PadreClassNo{
	
	WebDriver driver = null ;

	/*
	 * @Test public void TakeQuizMySelftT() throws InterruptedException {
	 * 
	 * HomePage home = new HomePage(driver); TakeQuizPage takeOption = new
	 * TakeQuizPage(driver);
	 * 
	 * loadPageComplete(); home.TakeQuizM().click(); loadPageComplete();
	 * 
	 * driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
	 * takeOption.getQuizOption("1").click(); // Thread.sleep(1000); //
	 * home.Age18_34M().click();
	 * 
	 * driver.switchTo().defaultContent();
	 * driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
	 * 
	 * Thread.sleep(4000);
	 * 
	 * // wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(home.
	 * getAge18_34M()))); //
	 * wait.until(ExpectedConditions.elementToBeClickable(takeOption.getQuizOption(
	 * "1")));
	 * 
	 * // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 * 
	 * // System.out.println(takeOption.getQuizOption("1").isDisplayed());
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * takeOption.getQuizOption("1").click();
	 * 
	 * driver.switchTo().defaultContent();
	 * driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
	 * 
	 * Thread.sleep(4000); takeOption.getQuizOption("1").click(); //
	 * System.out.println(takeOption.getQuizOption("1").isDisplayed());
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * 
	 * driver.switchTo().defaultContent();
	 * driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
	 * 
	 * Thread.sleep(4000); takeOption.getQuizOption("1").click(); //
	 * System.out.println(takeOption.getQuizOption("1").isDisplayed());
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * 
	 * driver.switchTo().defaultContent();
	 * driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
	 * 
	 * Thread.sleep(4000); takeOption.getQuizOption("1").click(); //
	 * System.out.println(takeOption.getQuizOption("1").isDisplayed());
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * 
	 * Thread.sleep(4000); takeOption.getQuizOption("1").click(); //
	 * System.out.println(takeOption.getQuizOption("1").isDisplayed());
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * 
	 * Thread.sleep(4000); takeOption.getQuizOption("1").click(); //
	 * System.out.println(takeOption.getQuizOption("1").isDisplayed());
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * 
	 * Thread.sleep(4000); takeOption.getQuizOption("1").click(); //
	 * System.out.println(takeOption.getQuizOption("1").isDisplayed());
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * 
	 * Thread.sleep(4000); takeOption.getQuizOption("1").click();
	 * 
	 * System.out.println(takeOption.getQuizOption("1").getText()); //
	 * driver.findElement(By.id("NextButton")).click();
	 * home.getNetxbtnQuiz().click();
	 * 
	 * Thread.sleep(4000); takeOption.getQuizOption("1").click();
	 * 
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * home.getNetxbtnQuiz().click(); //
	 * driver.findElement(By.id("NextButton")).click();
	 * 
	 * Thread.sleep(4000); home.getEmailQuiz().sendKeys("qagiddy1@gmail.com"); //
	 * driver.findElement(By.xpath("//div[@class='QuestionBody']/div/input")).
	 * sendKeys("qagiddy1@gmail.com");
	 * 
	 * // driver.findElement(By.id("NextButton")).click();
	 * home.getNetxbtnQuiz().click(); Thread.sleep(4000);
	 * System.out.println(driver.findElement(By.id("Questions")).getText());
	 * 
	 * // driver.findElement(By.className("ctabutton")).click();
	 * home.getBuyNowQuiz().click();
	 * 
	 * System.out.println(driver.getCurrentUrl());
	 * 
	 * }
	 * 
	 * @Test public void TakeQuizMyPartner() throws InterruptedException {
	 * 
	 * HomePage home = new HomePage(driver); TakeQuizPage takeOption = new
	 * TakeQuizPage(driver);
	 * 
	 * loadPageComplete(); home.TakeQuizM().click(); loadPageComplete();
	 * 
	 * driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
	 * takeOption.getQuizOptionPartner("1").click(); // Thread.sleep(1000); //
	 * home.Age18_34M().click();
	 * 
	 * driver.switchTo().defaultContent();
	 * driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
	 * 
	 * Thread.sleep(4000);
	 * 
	 * // wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(home.
	 * getAge18_34M()))); //
	 * wait.until(ExpectedConditions.elementToBeClickable(takeOption.getQuizOption(
	 * "1")));
	 * 
	 * // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 * 
	 * // System.out.println(takeOption.getQuizOption("1").isDisplayed());
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * takeOption.getQuizOptionPartner("1").click();
	 * 
	 * driver.switchTo().defaultContent();
	 * driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
	 * 
	 * Thread.sleep(4000); takeOption.getQuizOption("1").click(); //
	 * System.out.println(takeOption.getQuizOption("1").isDisplayed());
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * 
	 * driver.switchTo().defaultContent();
	 * driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
	 * 
	 * Thread.sleep(4000); takeOption.getQuizOption("1").click(); //
	 * System.out.println(takeOption.getQuizOption("1").isDisplayed());
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * 
	 * driver.switchTo().defaultContent();
	 * driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
	 * 
	 * Thread.sleep(4000); takeOption.getQuizOption("1").click(); //
	 * System.out.println(takeOption.getQuizOption("1").isDisplayed());
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * 
	 * Thread.sleep(4000); takeOption.getQuizOption("1").click(); //
	 * System.out.println(takeOption.getQuizOption("1").isDisplayed());
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * 
	 * Thread.sleep(4000); takeOption.getQuizOption("1").click(); //
	 * System.out.println(takeOption.getQuizOption("1").isDisplayed());
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * 
	 * Thread.sleep(4000); takeOption.getQuizOption("1").click(); //
	 * System.out.println(takeOption.getQuizOption("1").isDisplayed());
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * 
	 * Thread.sleep(4000); takeOption.getQuizOption("1").click();
	 * 
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * driver.findElement(By.id("NextButton")).click();
	 * 
	 * Thread.sleep(4000); takeOption.getQuizOption("1").click();
	 * 
	 * System.out.println(takeOption.getQuizOption("1").getText());
	 * home.getNetxbtnQuiz().click(); //
	 * driver.findElement(By.id("NextButton")).click();
	 * 
	 * Thread.sleep(4000); home.getEmailQuiz().sendKeys("qagiddy1@gmail.com"); //
	 * driver.findElement(By.xpath("//div[@class='QuestionBody']/div/input")).
	 * sendKeys("qagiddy1@gmail.com");
	 * 
	 * // driver.findElement(By.id("NextButton")).click();
	 * home.getNetxbtnQuiz().click(); Thread.sleep(4000);
	 * System.out.println(driver.findElement(By.id("Questions")).getText());
	 * 
	 * // driver.findElement(By.className("ctabutton")).click();
	 * home.getBuyNowQuiz().click();
	 * 
	 * System.out.println(driver.getCurrentUrl());
	 * 
	 * }
	 * 
	 * 
	 */
	@Test
	public void TakeQuizMPFor() throws InterruptedException {

		HomePage home = new HomePage(driver);
		TakeeQuizPage takeOption = new TakeeQuizPage(driver);

		loadPageComplete();
		home.TakeQuizM().click();
		loadPageComplete();

		driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
		System.out.println(takeOption.getQuizOptionPartner("1").getText());
		takeOption.getQuizOptionPartner("1").click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));

		Thread.sleep(4000);
		System.out.println(takeOption.getQuizOptionPartner("1").getText());
		takeOption.getQuizOptionPartner("1").click();

		for (int i = 1; i <= 2; i++) {

			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
			Thread.sleep(4000);
			takeOption.getQuizOption("1").click();
			System.out.println(takeOption.getQuizOption("1").getText());

		}

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));

		for (int i = 1; i <= 4; i++) {
			Thread.sleep(4000);
			takeOption.getQuizOption("1").click();
			System.out.println(takeOption.getQuizOption("1").getText());

		}

		Thread.sleep(4000);
		takeOption.getQuizOption("1").click();
		System.out.println(takeOption.getQuizOption("1").getText());
		home.getNetxbtnQuiz().click();

		Thread.sleep(4000);
		takeOption.getQuizOption("1").click();
		System.out.println(takeOption.getQuizOption("1").getText());
		home.getNetxbtnQuiz().click();

		Thread.sleep(4000);
		home.getEmailQuiz().sendKeys("qagiddy1@gmail.com");
		home.getNetxbtnQuiz().click();

		Thread.sleep(4000);
		System.out.println(driver.findElement(By.id("Questions")).getText());
		home.getBuyNowQuiz().click();

		System.out.println(driver.getCurrentUrl());

	}

	@Test
	public void TakeQuizMSFor() throws InterruptedException {

		HomePage home = new HomePage(driver);
		TakeeQuizPage takeOption = new TakeeQuizPage(driver);

		loadPageComplete();
		home.TakeQuizM().click();
		loadPageComplete();

		driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
		System.out.println(takeOption.getQuizOption("1").getText());
		takeOption.getQuizOption("1").click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));

		Thread.sleep(4000);
		System.out.println(takeOption.getQuizOption("1").getText());
		takeOption.getQuizOption("1").click();

		for (int i = 1; i <= 2; i++) {

			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
			Thread.sleep(4000);
			takeOption.getQuizOption("1").click();
			System.out.println(takeOption.getQuizOption("1").getText());

		}

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));

		for (int i = 1; i <= 4; i++) {
			Thread.sleep(4000);
			takeOption.getQuizOption("1").click();
			System.out.println(takeOption.getQuizOption("1").getText());

		}

		for (int i = 1; i <= 2; i++) {
			Thread.sleep(4000);
			takeOption.getQuizOption("1").click();
			System.out.println(takeOption.getQuizOption("1").getText());
			home.getNetxbtnQuiz().click();

		}

		Thread.sleep(4000);
		home.getEmailQuiz().sendKeys("qagiddy1@gmail.com");
		home.getNetxbtnQuiz().click();

		Thread.sleep(4000);
		System.out.println(driver.findElement(By.id("Questions")).getText());
		home.getBuyNowQuiz().click();

		System.out.println(driver.getCurrentUrl());

		// home.getActiveCuponCode().isDisplayed();

	}
}
