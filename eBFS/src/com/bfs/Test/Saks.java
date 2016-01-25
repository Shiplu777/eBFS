package com.bfs.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Saks {
	WebDriver driver;
	public Saks(WebDriver argDriver){
		driver=argDriver;
		
	}
	
	public void click(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement bttn = driver.findElement(By.xpath(".//*[@id='site-search']/form/div[1]/button"));
		bttn.click();
		System.out.println("Button clicked Successfully");
	}
	
	public void GetProduct(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> list = driver.findElements(By.className("product-price"));
		List<WebElement> AllItemDesc = driver.findElements(By.className("product-description"));
		int TotalPrdct = list.size();
		System.out.println(TotalPrdct);
		for(int i=0; i<TotalPrdct; i++){
			double ItemPrice;
			String ProdctPrice = list.get(i).getText();
			String ItemDesc = AllItemDesc.get(i).getText();
			String ProdctPrices = ProdctPrice.replace("$", "");
			if(ProdctPrices.contains("Was")){
				ProdctPrices = ProdctPrices.replace("Was", "");
				ItemPrice = Double.parseDouble(ProdctPrices);
			}else{
				ItemPrice = Double.parseDouble(ProdctPrices);
			}
			System.out.println("Item Description is: " +ItemDesc);
			System.out.println("Price is: "+"$"+ItemPrice);
			
			driver.quit();
		}
	}
}
