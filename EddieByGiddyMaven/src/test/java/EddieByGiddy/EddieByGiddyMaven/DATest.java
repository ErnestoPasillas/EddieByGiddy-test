package EddieByGiddy.EddieByGiddyMaven;


import org.testng.annotations.Test;

public class DATest extends PadreClassNo {

	@Test
	public void DeliveryAddress() throws InterruptedException {

		OrderStatus orderStatus = new OrderStatus(driver);
		ObjectRepository login = new ObjectRepository(driver);

		login.getAccountLogin().click();
		loadPageComplete();

		login.EmailId().sendKeys("netoluevano4@gmail.com");
		login.PasswordId().sendKeys("1234");
		login.getLogin().click();
		;

		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		// *********************[Add New Address]***************

		// driver.get("/account.php?action=address_book");
		orderStatus.getAccountInfo().click();
		esperarClickBotones("//a[text()='Delivery Addresses']");
		//
		orderStatus.DeliveryAddresses1().click();

		Thread.sleep(1000);
		orderStatus.NewAddress1().click();

		/// Ingreesar datos al formulario
		accountInfo("First Name").sendKeys("QA TEST");
		accountInfo("Last Name").sendKeys("Automated");
		accountInfo("Address Line 1").sendKeys("376 Dogwood Ave.");
		// accountInfo("Address Line 2").sendKeys("");
		accountInfo("Suburb/City").sendKeys("Bethany, OK");
		stateProvince("FormField_12_select", "Oklahoma", "id");
		accountInfo("Zip/Postcode").sendKeys("73008");
		orderStatus.SaveAddress1().click();

		// *********************[Edit Address]***************
		orderStatus.EditAddress1().click();

		accountInfo("Address Line 2").sendKeys("UPDATED TEST");
		orderStatus.SaveAddress1().click();
		Thread.sleep(4000);
		/******************** [Delete Address] ********************/
		orderStatus.DeleteAddress1().click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		orderStatus.getLogout().click();

	}

}
