import io.appium.java_client.remote.MobileCapabilityType;
	import io.appium.java_client.service.local.AppiumDriverLocalService;
	import io.appium.java_client.service.local.AppiumServiceBuilder;

	import java.io.File;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.remote.CapabilityType;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
public class StartStopAppiumServer {
	
	 WebDriver driver;
	 AppiumDriverLocalService appiumService;
	 String appiumServiceUrl;

	 @BeforeTest
	 public void setUp() throws MalformedURLException {
	  // Start Appium Service
	  appiumService = AppiumDriverLocalService
	    .buildService(new AppiumServiceBuilder()
	      .usingAnyFreePort()
	      .usingDriverExecutable(
	        new File(
	          "C:\\Program Files\\nodejs\\node.exe"))
	      .withAppiumJS(
	        new File(
	          "C:/Program Files (x86)/Appium/node_modules/appium/bin/appium.js")));
	  appiumService.start();
	  appiumServiceUrl = appiumService.getUrl().toString();
	  System.out.println("Appium Service Address : - " + appiumServiceUrl);

	  // Created object of DesiredCapabilities class.
	  DesiredCapabilities capabilities = new DesiredCapabilities();

	  // Set android deviceName desired capabilitcy. Set your device name.
	  // capabilities.setCapability("deviceName", "c8c5d8f6");
	  capabilities
	    .setCapability(MobileCapabilityType.DEVICE_NAME, "c8c5d8f6");

	  // Set BROWSER_NAME desired capability. It's Android in our case here.
	  capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

	  // Set android VERSION desired capability. Set your mobile device's OS
	  // version.
	  capabilities.setCapability("platformVersion", "5.1.1");

	  // Set android platformName desired capability. It's Android in our case
	  // here.
	  capabilities.setCapability("platformName", "Android");
	  capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,
	    "100");

	  // Set android appPackage desired capability. It is
	  // com.android.calculator2 for calculator application.
	  // Set your application's appPackage if you are using any other app.
	  capabilities.setCapability("appPackage", "com.android.calculator2");

	  // Set android appActivity desired capability. It is
	  // com.android.calculator2.Calculator for calculator application.
	  // Set your application's appPackage if you are using any other app.
	  capabilities.setCapability("appActivity",
	    "com.android.calculator2.Calculator");

	  // Created object of RemoteWebDriver will all set capabilities.
	  // Set appium server address and port number in URL string.
	  // It will launch calculator app in android device.
	  // driver = new RemoteWebDriver(new
	  // URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	  driver = new RemoteWebDriver(new URL(appiumServiceUrl), capabilities);
	  capabilities.setCapability("fullReset", true);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 }

	 @Test
	 public void Sum() {
	  // Click on DELETE/CLR button to clear result text box before running
	  // test.
	  driver.findElements(
	    By.xpath("//android.widget.ImageButton[contains(@resource-id,'clear')]"))
	    .get(0).click();

	  // Click on number 2 button.
	  driver.findElement(By.id("com.android.calculator2:id/digit2")).click();

	  // Click on + button.
	  driver.findElement(By.id("com.android.calculator2:id/plus")).click();

	  // Click on number 5 button.
	  driver.findElement(By.id("com.android.calculator2:id/digit5")).click();

	  // Click on = button.
	  driver.findElement(By.id("com.android.calculator2:id/equal")).click();

	  // Get result from result text box.
	  String result = driver.findElement(
	    By.className("android.widget.EditText")).getText();
	  System.out.println("Number sum result is : " + result);

	 }

	 @AfterTest
	 public void End() {

	  System.out.println("Stop driver");
	  driver.quit();
	  System.out.println("Stop appium service");
	  appiumService.stop();
	 }

	}

