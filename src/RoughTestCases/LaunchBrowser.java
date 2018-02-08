package RoughTestCases;



	

	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.remote.DesiredCapabilities;
	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
	public class LaunchBrowser {

		public static void main(String[] args) {
			
			//Set the Desired Capabilities
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "My Phone");
			caps.setCapability("udid", "e87a4fb3"); //Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "5.1.1");
			caps.setCapability("browserName", "Chrome");
			caps.setCapability("noReset", true);
			
			//Set ChromeDriver location
			//System.setProperty("webdriver.chrome.driver","C:\\selenium_drivers\\chromedriver.exe");
			
			//Instantiate Appium Driver
			AppiumDriver<MobileElement> driver = null;
			try {
				driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
				
			} catch (MalformedURLException e) {
				System.out.println(e.getMessage());
			}
					
			//Open URL in Chrome Browser
			driver.get("http://www.google.com");
		}
	}


