package Actions;

import Pages.Methods;
import Pages.ProductPage;
import Utilities.WaitManager;

public class ProductActions {

    ProductPage productPage = new ProductPage();

    public void clickOnSelectSize() {
        WaitManager.waitAndClick(productPage.getSize());
    }

    public void clickOnSelectSize2(){
        WaitManager.waitAndClick(productPage.getSize1());
    }
    public void clickOnAddToCart(){
        WaitManager.waitAndClick(productPage.getAddToCartBtn());
    }
    public void clickOnAddToCart2(){
        WaitManager.waitAndClick(productPage.getAddToCart2());
    }

    public void clickOnEddieOneTimePurchaseOption(){
        WaitManager.waitAndClick(productPage.getEddieOneTime());
    }
    public void clickOnEddieStayGiddyPlan(){
        WaitManager.waitAndClick(productPage.getEddieStayGiddyPlan());
    }

    public void carousel1PackIsDisplayed(){
        productPage.getCarousel1pack().isDisplayed();
    }
    public void carousel2PackIsDisplayed(){
        productPage.getCarousel2Pack().isDisplayed();
    }


    public void setProductPage(){
        Methods.stateProvince("two-pack-size-selection" ,"1"  );
    }

    public void setSelectSize(){
        Methods.stateProvince("two-eddie-size-selection", "A");
    }






}
