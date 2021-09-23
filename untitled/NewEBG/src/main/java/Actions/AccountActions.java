package Actions;

import Pages.AccountPage;
import Utilities.WaitManager;

import static Pages.Methods.accountInfo;
import static Pages.Methods.stateProvince;

public class AccountActions {

    AccountPage accountPage = new AccountPage();

    public void clickOnAccountInfo(){
        WaitManager.waitAndClick(accountPage.getAccountInfo());
    }

    public void clickOnOrderHistory(){
        WaitManager.waitAndClick(accountPage.getOrderHistory());
    }

    public void clickOnSubscriptions(){
        WaitManager.waitAndClick(accountPage.getSubscriptions());
    }

    public void clickOnEddieResize(){
        WaitManager.waitAndClick(accountPage.getEddieResize());
    }

    public void clickOnEDGuide(){
        WaitManager.waitAndClick(accountPage.getEDGuide());
    }

    public void clickOnLogout(){
        WaitManager.waitAndClick(accountPage.getLogout());
    }

    public void clickOnPersonalInfo(){
        WaitManager.waitAndClick(accountPage.getPersonalInfo());
    }

    public void  clickOnDeliveryAddresses( ) {
       WaitManager.waitAndClick(accountPage.getDeliveryAddresses());
    }

      public void setData(){
          accountInfo("First Name").sendKeys("QA TEST");
          accountInfo("Last Name").sendKeys("Automated");
          accountInfo("Address Line 1").sendKeys("376 Dogwood Ave.");
          accountInfo("Suburb/City").sendKeys("Bethany, OK");
          stateProvince("FormField_12_select", "Oklahoma");
          accountInfo("Zip/Postcode").sendKeys("73008");
      }

      public void clickOnSaveAddress(){
        WaitManager.waitAndClick(accountPage.getSaveAddress());
      }

      public void clickOnCancelBtn(){
        WaitManager.waitAndClick(accountPage.getCancelBtn());
      }

      public void clickOnEditAddressBtn(){
        WaitManager.waitAndClick(accountPage.getEditAddress());
      }

      public void clickOnNewAddress(){
        WaitManager.waitAndClick(accountPage.getNewAddress());
      }

      public void clickOnDeleteAddress(){
        WaitManager.waitAndClick(accountPage.getDeleteAddress());
      }


}
