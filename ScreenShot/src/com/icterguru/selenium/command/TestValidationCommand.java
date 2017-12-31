package com.icterguru.selenium.command;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

public class TestValidationCommand {
	WebDriver driver;
	WebDriverWait myWait;

	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("http://www.paytm.com");
		validate();
	}

	public void validate() {
		WebElement postPaidCheckbox = driver.findElement(By.xpath("//*html//body//div/div//div[3]//div/div[2]//div[1]//div[1]//div//div[1]//div[1]//div[2]//label"));
		myWait = new WebDriverWait(driver, 10);
		myWait.until(ExpectedConditions.elementToBeClickable(postPaidCheckbox));
		postPaidCheckbox.click();
		driver.findElement(By.xpath("//*label[contains(text(),'Mobile Number')]")).sendKeys("7039921234");
		WebElement ffCheckbox = driver.findElement(By.className("shPe"));
		System.out.println("Is Fast Forward CheckBox checked?"+ ffCheckbox.isSelected());
		if(ffCheckbox.isSelected()==false){
		ffCheckbox.click();
		}
		WebElement proceedButton = driver.findElement(By.xpath("*//button[contains(text(),'Bill')]"));
		if(proceedButton.isSelected()==true){
		proceedButton.click();
		}
	}

	public static void main(String[] args) {
		TestValidationCommand obj = new TestValidationCommand();
		obj.invokeBrowser();
	}

}
