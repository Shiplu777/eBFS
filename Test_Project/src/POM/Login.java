package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	By emailId = By.xpath(".//*[@id='email']");
	By password = By.xpath(".//*[@id='passwd']");
	By LoginButton = By.xpath(".//*[@id='SubmitLogin']");
	By PageHeader = By.xpath(".//*[@id='login_form']/h3");
	
	public void Login(WebDriver argDriver){
		this.driver = argDriver;
	}
	
	public void Signin(){
		driver.findElement(emailId).sendKeys("shiplu@yahoo.com");
		driver.findElement(password).sendKeys("test123");
		driver.findElement(LoginButton).click();
	}
	
	public String getPageHeader(){
		String Header = driver.findElement(PageHeader).getText();
		return Header;
		
	}

}
