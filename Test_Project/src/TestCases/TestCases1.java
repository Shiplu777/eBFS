package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.Login;

public class TestCases1 {
	
	WebDriver driver;
	
	@Test
	public void LoginVerification(){
		HomePage hm = new HomePage();
		Login L = new Login();
		hm.SinginClick();
		L.Signin();
		String ActualHeader = L.getPageHeader();
		Assert.assertEquals(ActualHeader, "ExpectedHeader");
				
		
	}
	
	@BeforeTest
	public void OpenBrowser(){
		driver = new FirefoxDriver();
		driver.get("http://ebfs.bruteforcesolution.net/ebfs");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void CloseBrowser(){
		driver.close();
	}
	

}
