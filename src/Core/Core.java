package Core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Utilities.ObjectRepository;

public class Core {
	
	public static AndroidDriver driver = null;
	public static Properties property = null;
	public static Properties or = null;
	public static FileInputStream fis = null;
	public ObjectRepository orc= new ObjectRepository();
	
	@BeforeSuite
	public void launchApplication () throws IOException {
		property =  new  Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\Utilities\\config.properties");
		property.load(fis);
		
		or =  new  Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\Utilities\\or.properties");
		or.load(fis);
		
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability("browserName", "Chrome");
		caps.setCapability("deviceName", property.getProperty("deviceName"));
		caps.setCapability("udid", property.getProperty("udid")); 
		caps.setCapability("platformName", property.getProperty("platformName"));
		caps.setCapability("platformVersion", property.getProperty("platformVersion"));
		caps.setCapability("appPackage", property.getProperty("appPackage"));
		caps.setCapability("appActivity", property.getProperty("appActivity"));
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.findElementById("io.selendroid.testapp:id/waitingButtonTest").click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
	}

}
