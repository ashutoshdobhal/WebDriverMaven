package RoughTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GMAILTEST {
	
	

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver" ,"D:\\Technical\\Updated Library\\AllJarFile\\chromedriver.exe"); // this is path for chrome driver download it and put path here
			WebDriver driver =new ChromeDriver();
		 driver.get("https://gmail.com");
		 Thread.sleep(10000);
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("test@test.com"); //put your username here
		 driver.findElement(By.xpath("//*[@id='next']")).click();
		 driver.findElement(By.xpath("//*[@id=password']/div[1]/div/div[1]/input")).sendKeys("23423423"); //put your password here

}
}
