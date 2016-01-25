package com.bfs.Test;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MarketingSite {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://marketing.bruteforcesolution.net");
		WebDriverWait bfsWait = new WebDriverWait(driver,10);
		bfsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='UserName']")));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Browser Type: ");
		String BrowserType = sc.nextLine();
		
		
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='UserName']")).sendKeys("Shiplu");
		driver.findElement(By.xpath(".//*[@id='Password']")).sendKeys("drive@0912");
		driver.findElement(By.xpath(".//*[@id='login_form']/ul/li[8]/input")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(driver.findElement(By.xpath(".//*[@id='main']/div/div/div[2]/table/tbody/tr[2]/td[9]/a")).isEnabled()){
			System.out.println("View Button Displayed");
		}else{
			System.out.println("View Button doesn't exist");
		}
	}

}
