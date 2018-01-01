package com.icterguru.seleniumwebdrivercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverCommand {
	WebDriver driver;
	
	public void invokeBrowser() {
		//Instantiating Bowser Driver:
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sohail\\OtherDirectoriesLoc\\Desktop\\WebDrivers\\chromedriver.exe");
		//Create chrome browser Driver:
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.partialLinkText("gm")).click();

	}
public static void main(String[] args) {
	SeleniumWebDriverCommand obj = new SeleniumWebDriverCommand();
	obj.invokeBrowser();

}
}
