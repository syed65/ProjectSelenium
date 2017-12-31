package com.ICTERGuru.WebDriver.command;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumComd {
	// How to verify Alert present in the url page or not?

	WebDriver driver;

	public boolean isalertPresent() {
		try {
			driver.switchTo().alert();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	@Test
	public void SeleniumComd() {
		driver = new ChromeDriver();
		driver.switchTo().alert();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss(); // How to accept or dismiss the alert
		
		//How to get the text of the alert
		Alert text=driver.switchTo().alert();
		System.out.println(text.getText());
			
		System.out.println("-------------------------------------");
	
		//three way to switchTo frame
		driver.switchTo().frame(0);//By index
		driver.switchTo().frame("frame");//By name
		driver.switchTo().frame(driver.findElement(By.xpath(" ")));//By WebElement
		
		System.out.println("-----------------------------------------------------");
	
	
		//Window handles available in SeleniumComd
		
		String PWindow= driver.getWindowHandle();//get the default window
		Set<String> allWindows = driver.getWindowHandles();// To get all windows
		Iterator<String> alltWindow = allWindows.iterator();
		Iterator<String> ParentWindow = allWindows.iterator();
		/*driver.switchTo().window(ParentWindow);//To get first window
		String ChildWindow = Allwindow.next();
		driver.switchTo().window(ChildWindow);//To get next window
		driver.switchTo().defaultContent();// To go back to the default window
	*/
		//Wait condition in SeleniumComd:
		//driver.manage().tomeouts().implicitlyWait(30,TimeUnit.SECOND);//for entire page to load withits DOM
		
		//WebDriverWait wait = new 

}}
