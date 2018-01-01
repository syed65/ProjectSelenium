package com.icterguru.selenium.command;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TakeScreenShot {
	
		WebDriver driver;
		String imagePath="C:\\Users\\Sohail\\OtherDirectoriesLoc\\Desktop\\Screenshots\\paytm.png";
		File tempFile, permanentFile;
		TakesScreenshot screenShot;

		public void invokeBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sohail\\OtherDirectoriesLoc\\Desktop\\WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.get("http://www.paytm.com");
			
		}
		public void takeScreenShot() {
			try {
			permanentFile =new File(imagePath);
			if(permanentFile.exists()) {
				throw new Exception("The image already exist");
}
	screenShot= (TakesScreenshot)driver;
	tempFile=screenShot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(tempFile, permanentFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	
public static void main(String[] args) {
	TakeScreenShot obj= new TakeScreenShot();
	obj.invokeBrowser();

}}
