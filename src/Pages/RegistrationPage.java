package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.ObjectRepository;

public class RegistrationPage {
	
	
	@FindBy(id= ObjectRepository.userName)
	WebElement uname;
	
	@FindBy(id= ObjectRepository.email)
	WebElement emailid;

	@FindBy(id= ObjectRepository.password)
	WebElement pwd;
	
	@FindBy(id= ObjectRepository.name)
	WebElement inputName;
	
	@FindBy(id= ObjectRepository.input_cb)
	WebElement inputadds;
	
	
	public void registration() {
		
		uname.sendKeys("ashutosh");
		emailid.sendKeys("ashutosh.dobhal@test.com");
		pwd.sendKeys("12345");
		inputadds.click();
		
	}

}
