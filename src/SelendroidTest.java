import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;




public class SelendroidTest {
	
	public  AndroidDriver driver;

	@BeforeTest
	public void launchapplication () {
		
			DesiredCapabilities caps = new DesiredCapabilities();
			//caps.setCapability("browserName", "Chrome");
			caps.setCapability("deviceName", "My Phone");
			caps.setCapability("udid", "e87a4fb3"); //Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "5.1.1");
			caps.setCapability("appPackage", "selendroid-test-app");
			try {
				
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
			//driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		Thread.sleep(10000);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}

	
	@Test
	 public void firstTC () {
		
		
		//driver.findElement(By.id("io.selendroid.testapp:id/buttonStartWebview")).click();
		//driver.navigate().to("http://gmail.com");
	}

}


