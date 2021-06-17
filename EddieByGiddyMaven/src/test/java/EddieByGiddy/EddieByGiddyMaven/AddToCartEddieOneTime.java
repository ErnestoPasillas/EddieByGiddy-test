package EddieByGiddy.EddieByGiddyMaven;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddToCartEddieOneTime extends PadreClassNo {

	@Test
	public void EddieOneTime() throws InterruptedException {

		ProductsPage prod = new ProductsPage(driver);

		loadPageComplete();

		prod.ProductOP().click();

		prod.Carouseel2PackUI().isDisplayed();
		loadPageComplete();

		js.executeScript("window.scrollBy(0,500)");

		prod.EddieOneTimeOP().click();

		Thread.sleep(1000);

		prod.Pack1S().click();

		prod.Size1().click();

		prod.AddToCartBtn2().click();

		js.executeScript("arguments[0].scrollIntoView();", prod.CheckOutBtn());

		prod.CheckOutBtn().click();

		//loadPageComplete();
Thread.sleep(4000);


driver.findElement(By.cssSelector("#close")).click();
		//prod.ModalHeaderMD().isDisplayed();

///		prod.ModalTM().click();

	///	prod.CloseNodalC().click();

		// dropDownPackProducts("one-pack-size-selection","2"); No funciona por meetodo
	}

}
