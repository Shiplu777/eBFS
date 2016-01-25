package com.bfs.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	WebDriver driver;
	
	public Amazon(WebDriver argDriver){
		driver=argDriver;
		
	}
	
	public void SelectVal(String args){
		try{
			
			Select src = new Select(driver.findElement(By.xpath(".//*[@id='searchDropdownBox']")));
			src.selectByVisibleText("Computers");
			
			System.out.println("Successfully Selected value");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void SearchText(String args){
		
		driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys(args);
		System.out.println("Sucessfully typed in the search box");
	}
}
