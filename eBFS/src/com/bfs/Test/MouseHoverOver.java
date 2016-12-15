package com.bfs.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverOver {

	public static void main(String[] args) {
		System.out.println("Hover Over Example");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");
		driver.manage().window().maximize(); // maximize the browser
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // implicit wait
		
	
		
		// Hover Over Mouse on Product image so that Add To Cart Button get visible
		WebElement prodImage = driver.findElement(By.xpath("//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img"));
		Actions builder = new Actions(driver); 
		builder.moveToElement(prodImage).perform();
		
		//Explicit wait to Add to Cart Button to get visible
		By addToCartButton = By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span");
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(addToCartButton));
		driver.findElement(addToCartButton).click();
			
		
	}

}
