package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Core.Core;
import Pages.HomePage;
import Pages.RegistrationPage;

public class HomeScreen extends Core {
	
	//@Test
	public void showProgressBar() throws InterruptedException {
		
		HomePage hp	= PageFactory.initElements(driver,HomePage.class);
		hp.showProgressBar();
	}



 @Test
 public void registration() throws InterruptedException {
	  HomePage hp = PageFactory.initElements(driver, HomePage.class);
	  
	 RegistrationPage rp = hp.showProgressBar();
	 rp.registration();
	  
 }
	 
	 
 }