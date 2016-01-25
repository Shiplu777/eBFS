package com.bfs.Test;

import java.io.File;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowser {
	
	public static void main(String[] args) {
		WebDriver driver;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser type: ");
		String BrowserType = sc.nextLine();
		
		if(BrowserType.equalsIgnoreCase("FireFox")){
			driver = new FirefoxDriver();
		}else if(BrowserType.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver","C:\\bfs\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}else if(BrowserType.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\bfs\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.saks.com");
			Saks sks = new Saks(driver);
			sks.click();
			sks.GetProduct();
		}
		else{
			driver = new FirefoxDriver();
			driver.get("http://www.saks.com");
			Saks sks = new Saks(driver);
			sks.click();
			sks.GetProduct();
		}
		
	}
	

}
