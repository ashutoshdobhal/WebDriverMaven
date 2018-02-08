package RoughTestCases;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mi4i {
	
	public  AndroidDriver driver = null;;

	//@BeforeTest
	@Test
	public void launchapplication () throws MalformedURLException {
		
			DesiredCapabilities caps = new DesiredCapabilities();
			//caps.setCapability("browserName", "Chrome");
			caps.setCapability("deviceName", "Mi 4i");
			caps.setCapability("udid", "a99ce430"); //Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "5.0.2");
			//caps.setCapability("appPackage", "selendroid-test-app");
			
			
				driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
				driver.navigate().to("htpp://gmail.com");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		
	
}

	
//	@Test
	 public void firstTC () {
		//driver.navigate().to("http://gmail.com");
		
		//driver.findElement(By.id("io.selendroid.testapp:id/buttonStartWebview")).click();

	}

}




