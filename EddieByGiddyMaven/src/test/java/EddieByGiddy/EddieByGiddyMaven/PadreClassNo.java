package EddieByGiddy.EddieByGiddyMaven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.functions.ExpectedCondition;

public class PadreClassNo {
	public static WebDriver driver = null;

	public static WebDriverWait wait = null;

	public static JavascriptExecutor js = null;

	public static SoftAssert a = null;

	@BeforeMethod
	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "//Users//ernestopasillasluevano//Downloads//chromedriver 3");
		driver = new ChromeDriver();

		js = (JavascriptExecutor) driver;
		a = new SoftAssert();
		wait = new WebDriverWait(driver, 20);

		driver.get("https://eddiebygiddy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
	}

	public static WebElement accountInfo(String field) {
		WebElement createAccount = driver
				.findElement(By.xpath("//label[contains (text(),\"" + field + "\")]/following-sibling::input "));
		///// label[contains (text(),'Last N')]/following-sibling::input

		return createAccount;
	}

	/// por si no detecta un elemento

	public static void stateProvince(String drop2, String state, String identificador) {
		By doctor = null;
		switch (identificador.toLowerCase()) {
		case "id":
			doctor = By.id(drop2);
			break;

		case "name":
		default:
			doctor = By.name(drop2);
			break;

		}

		WebElement selectState = driver.findElement(doctor);

		Select dropdown2 = new Select(selectState);
		dropdown2.selectByValue(state);
	}

	// para saber si la carga esta conpleta
	public static void loadPageComplete() {
		if (driver != null) {

			ExpectedCondition<Boolean> cargaCompleta = drivers -> {
				return ("complete".equals(js.executeScript("return document.readyState")));
			};

			wait.until(cargaCompleta);
		}
	}

	/// Obras amaeestra de mike
	public static void esperaElementos(String ele, String typeLocator) {

		switch (typeLocator.toLowerCase().trim()) {
		case "css":

			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(ele))));

			break;

		case "xpath":
		default:
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(ele))));
			break;

		}
		// wait.until(ExpectedConditions.textToBePresentInElement((By.xpath(ele),"Save
		// Article" or "Unsave Article")));
	}

	public static void validatexto(String string) {
		wait.until(ExpectedConditions.textToBePresentInElementValue(
				driver.findElement(By.xpath("//input[@value='Save Article' or @value='Unsave Article']")),
				"Save Article"));
	}

	public static void esperarClickBotones(String ele) {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(ele))));
	}

	/* para cambiar el pack de products */
	public static void dropDownPackProducts(String drop, String value) {
		WebElement selectMethod = driver.findElement(By.id(drop));

		Select dropdown = new Select(selectMethod);
		dropdown.selectByValue(value);
	}

	public static void stateProvince(String drop2, String state) {
		WebElement selectState = driver.findElement(By.name(drop2));

		Select dropdown2 = new Select(selectState);
		dropdown2.selectByValue(state);
	}

	/* para elegir los el tema EDGuide */
	public static void byTopic(String drop2, String state) {
		WebElement selectTopic = driver.findElement(By.id(drop2));

		Select dropdown2 = new Select(selectTopic);
		dropdown2.selectByValue(state);
	}

	
	
	@AfterMethod

	public void closeWidnows() {
		driver.close();
	}

	public WebDriver getDriver() {
		return driver;
	}

}
