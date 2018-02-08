import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class ApiumDemo {
	public static AndroidDriver driver;
	public static void main(String[] args) {
	
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", "");
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "e87a4fb3"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "5.1.1");
		
		//io.selendroid.testapp/io.selendroid.testapp.HomeScreenActivity}
		caps.setCapability("appPackage", "io.selendroid.testapp");
		caps.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		//caps.setCapability("appPackage", "com.android.chrome-1");
		//caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try {
				//AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			//driver.findElement(By.id("io.selendroid.testapp:id/waitingButtonTest")).click();
			
			
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		//driver.findElementById("io.selendroid.testapp:id/waitingButtonTest").click();
		
		driver.findElement(By.id("my_text_field")).sendKeys("ashutosh");
		//driver.get("http://gmail.com");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
