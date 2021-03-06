package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.sql.Driver;

public class BaseClass2 {

    private WebDriver driver;

    private String deviceName;
    private String platformName;
    private String platformVersion;
    private String skipUnlock;
    private String appPackage;
    private String appActivity;
    private String noReset;
    private String autoGrantPermissions;
    private String apkName;
    private String appDir;
    private String automationName;
    private String deviceTimeOut;
    private String app;
    private String appiumServer = "http://127.0.0.1:4723/wd/hub";
    private final int port = 4723;
    private final AppiumDriverLocalService appiumService = AppiumDriverLocalService.buildDefaultService();

    public BaseClass2(String platformName) throws MalformedURLException {

        startAppium();

        switch (platformName.toLowerCase()) {
            case "android":
                setUpAndroid();
                closeAndroidEmulator();
                break;
            case "ios":
                setUpIOS();
                closeIOSSimulator();
                break;
            case "hybrid":
                setUpHybrid();
                break;
            default:
                System.out.println("No valid platform");
        }

        closeAppium();

    }

    private void setUpAndroid() throws MalformedURLException {

        System.out.println("Starting appium for android...");

        deviceName = "Galaxy_Nexus_API_24";
        platformName = "Android";
        platformVersion = "7.0";
        skipUnlock = "true";
        appPackage = "com.example.work.thetestingworld";
        appActivity = "com.example.work.thetestingworld.Splash";
        noReset = "false";
        autoGrantPermissions = "true";
        apkName = "exampleApk.apk";
        appDir = System.getProperty("user.dir") + "//src//testData//Application//Android";
        automationName = "UiAutomator2";
        deviceTimeOut = "450";
        app = new File(appDir, apkName).getAbsolutePath();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        //Capabilities for device
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(MobileCapabilityType.APP, app);
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appActivity);
        capabilities.setCapability("deviceReadyTimeout", deviceTimeOut);
        capabilities.setCapability("noReset", noReset);
        capabilities.setCapability("autoGrantPermissions", autoGrantPermissions);
        capabilities.setCapability("skipUnlock", skipUnlock);
        capabilities.setCapability("automationName", automationName);
        capabilities.setCapability("avd", deviceName);

        driver = new AndroidDriver(new URL(appiumServer), capabilities);

    }

    @BeforeMethod
    private void setUpIOS() throws MalformedURLException {
        System.out.println("Starting appium for IOS...");

        deviceName = "iPhone 8";
        platformName = "iOS";
        platformVersion = "14.5 (18E182)";
        skipUnlock = "true";
      //  appPackage = "com.example.work.thetestingworld";
        //appActivity = "com.example.work.thetestingworld.Splash";
        noReset = "true";
        autoGrantPermissions = "true";
        //apkName = "TestingBootSampleApp.app";
        //appDir = System.getProperty("user.dir") + "//src//testData//Application//IOS";
        automationName = "XCUITest";
      //  app = "https://testingbot.com/appium/sample.zip";


        DesiredCapabilities capabilities = new DesiredCapabilities();
        //Capabilities for device
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
       // capabilities.setCapability(MobileCapabilityType.APP, app);
        capabilities.setCapability("deviceReadyTimeout", "450");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, noReset);
        capabilities.setCapability("skipUnlock",skipUnlock);
        capabilities.setCapability("automationName", automationName);
        capabilities.setCapability("useNewWDA", false);

        capabilities.setCapability(MobileCapabilityType.UDID, "C5B996EC-4C43-45BF-8D3F-22E7656A88EB");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");


        driver = new IOSDriver<MobileElement>(new URL(appiumServer), capabilities);
    }

    private void setUpHybrid() throws MalformedURLException {
        System.out.println("Starting appium for Hybrid applications...");
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void closeAndroidEmulator(){

        try{
            driver.quit();
            Runtime.getRuntime().exec("adb -s emulator-5554 emu kill");
            System.out.println("Android emulator was closed...");
        }catch (IOException e){
            e.printStackTrace();
        }



    }

    public void closeIOSSimulator(){
        //8D270325-32B6-4097-8621-7629EB2F362B
        try{
            driver.quit();
            Runtime.getRuntime().exec("killall Simulator");
            System.out.println("iOS emulator was closed...");
            driver.quit();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void startAppium(){
        //AppiumDriverLocalService appiumService = AppiumDriverLocalService.buildDefaultService();
        appiumService.start();
        System.out.println("Appium connection was opened...");
    }
    public void closeAppium(){
        appiumService.stop();
        System.out.println("Appium connection was closed...");
    }


    @Test
    public void sampleTest(){



        System.out.println("estoy dentrto del test");

        driver.get("https://google.com");

        MobileElement search = (MobileElement) (driver.findElement(By.class("gLFyf gsfi")));

         search.sendKeys("cars");




    }


}
