package EddieByGiddy.EddieByGiddyMaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EdGuide extends PadreClassNo {

	@Test
	public void GoToEdGuide() {

		OrderStatus profile = new OrderStatus(driver);
		ObjectRepository login = new ObjectRepository(driver);
		EDGuidePage videos = new EDGuidePage(driver);

		login.getAccountLogin().click();
		loadPageComplete();
		login.EmailId().sendKeys("netoluevano4@gmail.com");
		login.PasswordId().sendKeys("1234");
		login.getLogin().click();

		profile.getEDGuide().click();
		System.out.println(driver.getTitle());

		profile.getUserIcon().click();
		profile.getLogout().click();

	}

	
	public void EdGuideReproduceVideo() throws InterruptedException {

		OrderStatus profile = new OrderStatus(driver);
		ObjectRepository login = new ObjectRepository(driver);
		EDGuidePage videos = new EDGuidePage(driver);

		login.getAccountLogin().click();
		loadPageComplete();
		login.EmailId().sendKeys("netoluevano4@gmail.com");
		login.PasswordId().sendKeys("1234");
		login.getLogin().click();

		profile.getEDGuide().click();
		System.out.println(driver.getTitle());

		// js.executeScript("arguments[0].scrollIntoView();",videos.getAboutGiddyTitle());
		videos.getAboutGiddyTitle().click();

		/*
		 * System.out.println(driver.getCurrentUrl());
		 * 
		 * 
		 * driver.findElement(By.id("wistia_100.big_play_button_graphic")).click();
		 * Thread.sleep(1000);
		 * 
		 * driver.findElement(By.
		 * xpath("#wistia-ryqc63660w-1_popover_popover_close_button > img")).clear();
		 * 
		 * 
		 * profile.getUserIcon().click(); profile.getLogout().click();
		 */
	}

	@Test
	public void FilterByTopic() {
		OrderStatus profile = new OrderStatus(driver);
		ObjectRepository login = new ObjectRepository(driver);
		EDGuidePage videos = new EDGuidePage(driver);

		login.getAccountLogin().click();
		loadPageComplete();
		login.EmailId().sendKeys("netoluevano4@gmail.com");
		login.PasswordId().sendKeys("1234");
		login.getLogin().click();

		profile.getEDGuide().click();
		// System.out.println(driver.getTitle());

		loadPageComplete();
		/* para filtar por About Giddy and Eddie */
		byTopic("edit-field-playlist-target-id-1", "49");

		videos.getSearch().click();

		System.out.println(videos.getResult().isDisplayed());

		Assert.assertEquals(videos.getResult().getText(), "About Giddy and Eddie");

		profile.getUserIcon().click();
		profile.getLogout().click();
	}

	@Test
	public void FilterByExpert() {
		OrderStatus profile = new OrderStatus(driver);
		ObjectRepository login = new ObjectRepository(driver);
		EDGuidePage videos = new EDGuidePage(driver);

		login.getAccountLogin().click();
		loadPageComplete();
		login.EmailId().sendKeys("netoluevano4@gmail.com");
		login.PasswordId().sendKeys("1234");
		login.getLogin().click();

		profile.getEDGuide().click();
		System.out.println(driver.getTitle());

		loadPageComplete();
		/* para filtar por About Giddy and Eddie */
		byTopic("edit-field-wellness-expert-target-id", "88");

		videos.getSearch().click();

		System.out.println(videos.getResult().isDisplayed());

		profile.getUserIcon().click();
		profile.getLogout().click();
	}

	@Test
	public void FilterBytopicAndExpert() {
		OrderStatus profile = new OrderStatus(driver);
		ObjectRepository login = new ObjectRepository(driver);
		EDGuidePage videos = new EDGuidePage(driver);

		login.getAccountLogin().click();
		loadPageComplete();
		login.EmailId().sendKeys("netoluevano4@gmail.com");
		login.PasswordId().sendKeys("1234");
		login.getLogin().click();

		profile.getEDGuide().click();
		System.out.println(driver.getTitle());

		loadPageComplete();
		/* para filtar por About Giddy and Eddie */

		byTopic("edit-field-playlist-target-id-1", "81");

		/* para filtrar por especialista */
		byTopic("edit-field-wellness-expert-target-id", "90");

		videos.getSearch().click();
		System.out.println(videos.getResult().isDisplayed());

		profile.getUserIcon().click();
		profile.getLogout().click();

		// Assert.assertEquals(profile.getLogoutMgs().getText(), "You've been logged out
		// of your account successfully.");

	}

}
