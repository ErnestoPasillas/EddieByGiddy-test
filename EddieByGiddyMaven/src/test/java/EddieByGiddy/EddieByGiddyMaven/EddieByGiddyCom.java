package EddieByGiddy.EddieByGiddyMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class EddieByGiddyCom extends PadreClassNo {

	@Test
	public void DeliveryAddressNav()

	{

		driver.findElement(By.xpath("//a[@class='noMobile navPages-action']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("netoluevano4@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		System.out.printf(" El elemento esta desplegado : "
				+ driver.findElement(By.xpath("//h5[text()='My Giddy Account']")).isDisplayed() + "\n");
		WebElement giddyText = driver.findElement(By.xpath("//h5[text()='My Giddy Account']"));
		// wait.until(ExpectedConditions.visibilityOf(comparar));
		a.assertTrue(giddyText.isDisplayed());

		driver.findElement(By.xpath("//span[text()='Account Info']")).click();
		WebElement deliveryAddress = driver.findElement(By.xpath("//a[text()='Delivery Addresses']"));
		wait.until(ExpectedConditions.visibilityOf(deliveryAddress));

		deliveryAddress.click();

		System.out.println(driver.findElement(By.cssSelector(".page-heading")).getText() + "\n");

		/********************** [ add new address] ************************/

		WebElement newAddress = driver.findElement(By.xpath("//span[@class='address-addNew']"));
		js.executeScript("arguments[0].scrollIntoView();", newAddress);
		driver.findElement(By.xpath("//span[@class='address-addNew']")).click();

		accountInfo("First Name").sendKeys("QA TEST");
		accountInfo("Last Name").sendKeys("Automated");
		accountInfo("Address Line 1").sendKeys("376 Dogwood Ave.");
		// accountInfo("Address Line 2").sendKeys("");
		accountInfo("Suburb/City").sendKeys("Bethany, OK");

		stateProvince("FormField_12_select", "Oklahoma", "id");
		accountInfo("Zip/Postcode").sendKeys("73008");

		driver.findElement(By.xpath("//input[@value='Save Address']")).click();
		// driver.findElement(By.xpath("//a[@class='button']")).click(); para cancelar

		/// Para validar la diereccion ingresada
		// a.assertEquals(driver.findElement(By.xpath("//li[text()='376 Dogwood
		/// Ave.']")).getText(),"376 Dogwood jajaja");

		// a.assertEquals(driver.findElement(By.xpath("//li[text()='376 Dogwood
		// Ave.']")).getText(), "376 Dogwood jajaja");
		System.out.println(driver.findElement(By.xpath("//li[text()='376 Dogwood Ave.']")).getText());

		/******************** [Edit Address] ********************/ /// no TERMINADO
		driver.findElement(By.xpath("//a[text()='Edit Address']")).click();

		accountInfo("Address Line 2").sendKeys("UPDATED TEST");
		driver.findElement(By.xpath("//input[@value='Save Address']")).click();

		/******************** [Delete Address] ********************/

		// driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();
		// driver.switchTo().alert().accept();

	}

}
