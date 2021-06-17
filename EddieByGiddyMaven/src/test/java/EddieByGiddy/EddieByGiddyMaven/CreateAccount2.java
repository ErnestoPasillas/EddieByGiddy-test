package EddieByGiddy.EddieByGiddyMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccount2 extends PadreClassNo {

	@Test
	public void CreateAccountFlow() {
		ObjectRepository login = new ObjectRepository(driver);

		CreateAccoutPOM form = new CreateAccoutPOM(driver);

		loadPageComplete();
		login.getAccountLogin().click();
		login.CreateAccountMT().click();

		loadPageComplete();

		dropDownPackProducts("na-step-one", "Eddie");
		accountInfo("Last 4 Digits of Barcode:").sendKeys("1234");

		form.NextBtnM().click();

		accountInfo("First Name").sendKeys("QA ");
		accountInfo("Last Name").sendKeys("AUTOMATED 1");
		accountInfo("Email address").sendKeys("netluevano4@gmail.com");/// need to create a gmail account and change
		accountInfo("Password").sendKeys("1234");
		accountInfo("Confirm Password").sendKeys("1234");
		accountInfo("Address 1").sendKeys("7427 Evergreen Rd."); // need to creatre a random Addresss
		accountInfo("City").sendKeys("Oklahoma city");
		stateProvince("field_state", "Oklahoma");
		accountInfo("Zip/Postcode").sendKeys("73109");

		form.SubmitBtnM().click();

		WebElement message = driver.findElement(By.className("errorMessageArea"));
		message.getText();
		System.out.println(message.getText());

		String actualText = ("The email address netluevano4@gmail.com is already taken.");

		// Assert.assertEquals(message.getText(),actualText);

	}

	
	
	@Test
	public void CreateAccountAmazon() {
		ObjectRepository login = new ObjectRepository(driver);

		CreateAccoutPOM form = new CreateAccoutPOM(driver);

		loadPageComplete();
		login.getAccountLogin().click();
		login.CreateAccountMT().click();

		loadPageComplete();

		dropDownPackProducts("na-step-one", "Amazon");
		accountInfo("Amazon Order Number:").sendKeys("123456789");
		accountInfo("Last 4 Digits of Barcode:").sendKeys("1234");

		form.NextBtnM().click();

		accountInfo("First Name").sendKeys("QA ");
		accountInfo("Last Name").sendKeys("AUTOMATED 1");
		accountInfo("Email address").sendKeys("netluevano4@gmail.com");/// need to create a gmail account and change
		accountInfo("Password").sendKeys("1234");
		accountInfo("Confirm Password").sendKeys("1234");
		accountInfo("Address 1").sendKeys("7427 Evergreen Rd."); // need to creatre a random Addresss
		accountInfo("City").sendKeys("Oklahoma city");
		stateProvince("field_state", "Oklahoma");
		accountInfo("Zip/Postcode").sendKeys("73109");

		form.SubmitBtnM().click();

		WebElement message = driver.findElement(By.className("errorMessageArea"));
		message.getText();
		System.out.println(message.getText());

		String actualText = ("The email address netluevano4@gmail.com is already taken.");

		 Assert.assertEquals(message.getText(),actualText);

	}


	@Test
	public void CreateAccountClinic() {
		ObjectRepository login = new ObjectRepository(driver);

		CreateAccoutPOM form = new CreateAccoutPOM(driver);

		loadPageComplete();
		login.getAccountLogin().click();
		login.CreateAccountMT().click();

		loadPageComplete();

		dropDownPackProducts("na-step-one", "Clinic");
		
		driver.findElement(By.id("clinicName")).sendKeys("Mercy");
		driver.findElement(By.id("docName")).sendKeys("Willson");
		accountInfo("Last 4 Digits of Barcode:").sendKeys("1234");

		
		form.NextBtnM().click();
		
		

		accountInfo("First Name").sendKeys("QA ");
		accountInfo("Last Name").sendKeys("AUTOMATED 1");
		accountInfo("Email address").sendKeys("netluevano4@gmail.com");/// need to create a gmail account and change
		accountInfo("Password").sendKeys("1234");
		accountInfo("Confirm Password").sendKeys("1234");
		accountInfo("Address 1").sendKeys("7427 Evergreen Rd."); // need to creatre a random Addresss
		accountInfo("City").sendKeys("Oklahoma city");
		stateProvince("field_state", "Oklahoma");
		accountInfo("Zip/Postcode").sendKeys("73109");

		form.SubmitBtnM().click();

		WebElement message = driver.findElement(By.className("errorMessageArea"));
		message.getText();
		System.out.println(message.getText());

		String actualText = ("The email address netluevano4@gmail.com is already taken.");

		 Assert.assertEquals(message.getText(),actualText);

	}



}
