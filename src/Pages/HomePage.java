package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import Utilities.ObjectRepository;
import Core.Core;

public class HomePage extends Core {
	
	
	@FindBy(id = ObjectRepository.txt_field)
	public WebElement txt_field;
	
	@FindBy(id = orc.progress_bar)
	public WebElement progressBar;
	
	
	
	public void enterText() {
	//driver.findElement(By.id(or.getProperty("txt_field"))).sendKeys("ashutosh");
	txt_field.sendKeys("ashutosh");
	
		
	}
	
	public RegistrationPage showProgressBar() throws InterruptedException {
		progressBar.click();
		Thread.sleep(40000);
		return PageFactory.initElements(driver,RegistrationPage.class);
		
		
		
		
	}
}
