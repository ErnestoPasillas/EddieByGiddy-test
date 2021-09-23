package EddieByGiddy.EddieByGiddyMaven;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Quiz extends PadreClassNo{
	
	@Test
	public void TakeQuizMPFor() throws InterruptedException {

		HomePage home = new HomePage(driver);
		TakeeQuizPage takeOption = new TakeeQuizPage(driver);

		loadPageComplete();
		home.TakeQuizM().click();
		loadPageComplete();

		
		//1
		driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
		System.out.println(takeOption.getQuizOptionPartner("1").getText());
		takeOption.getQuizOptionPartner("1").click();
		driver.switchTo().defaultContent();
		
		//2
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
		//3
		
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
	
	@Test
	public void TakeQuizMSForall() throws InterruptedException {

		HomePage home = new HomePage(driver);
		TakeeQuizPage takeOption = new TakeeQuizPage(driver);

		loadPageComplete();
		home.TakeQuizM().click();
		loadPageComplete();

		for (int i = 1; i <= 9; i++) {

			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
			Thread.sleep(4000);
			takeOption.getQuizOption("1").click();
			System.out.println(takeOption.getQuizOption("1").getText());

		}
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("qualtricsIframe")));
		Thread.sleep(4000);
		takeOption.getQuizOption("5").click();
		System.out.println(takeOption.getQuizOption("5").getText());


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
