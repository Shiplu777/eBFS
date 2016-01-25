package com.bfs.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class eBFS {


	public static void main(String[] args) {
		
		try{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");
		String pageTitle = driver.getTitle();
		Thread.sleep(10000);
		
		
		if(pageTitle.equals("eBFS - the power of choice")){
			System.out.println("Page displayed Correctly");
		}else{
			System.out.println("Page doesn't display Correctly");
			System.out.println(pageTitle);
		}
		
	 String Text = driver.findElement(By.xpath(".//*[@id='homefeatured']/li[1]/div/div[2]/h5/a")).getText();
		
	 if(Text.equalsIgnoreCase("Faded Short Sleeve T-shirts")){
		 System.out.println(Text);
		 System.out.println("Text Found");
	 }else{
		 System.out.println("Text not Found");
	 }
	 WebElement we = driver.findElement(By.xpath(".//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span"));
	 Actions action = new Actions(driver);
	 action.moveToElement(we).build().perform();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span")).click();
	 
	 driver.close();
		
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	

	}
}	
