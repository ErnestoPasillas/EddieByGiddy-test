package EddieByGiddy.EddieByGiddyMaven;

import org.testng.annotations.Test;

public class Login extends PadreClassNo {

	@Test
	public void LoginSU() {

		ObjectRepository login = new ObjectRepository(driver);

		login.getAccountLogin().click();
		loadPageComplete();

		login.EmailId().sendKeys("netoluevano4@gmail.com");
		login.PasswordId().sendKeys("1234");
		login.getLogin().click();
		;

		System.out.println(driver.getTitle());

	}

}
