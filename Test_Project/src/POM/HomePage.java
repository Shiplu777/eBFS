package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	By SigninClick = By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a");
	
	public void HomePage(WebDriver argDriver){
		this.driver=argDriver;	
	}
	
	public void SinginClick(){
		driver.findElement(SigninClick).click(); 
		
	}

}
