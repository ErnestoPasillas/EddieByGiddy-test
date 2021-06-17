package EddieByGiddy.EddieByGiddyMaven;


import org.testng.annotations.Test;

public class AddToCart extends PadreClassNo {

	
	
	
	@Test
	public void AddToCartChecktOut() throws InterruptedException {

		ProductsPage prod = new ProductsPage(driver);
		

		loadPageComplete();

		prod.ProductOP().click();

		prod.Carouseel2PackUI().isDisplayed();

		prod.Size2().click();

		prod.AddToCart().click();

		js.executeScript("arguments[0].scrollIntoView();", prod.CheckOutBtn());

		prod.CheckOutBtn().click();

		loadPageComplete();

		//prod.ModalHeaderMD().isDisplayed();

		//prod.ModalTM().click();
		
		Thread.sleep(4000);

		prod.CloseNodalC().click();

	}

}
