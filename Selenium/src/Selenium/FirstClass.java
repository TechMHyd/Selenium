package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {


			public static void main(String[] args) 
			{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("lst-ib")).sendKeys("what is selenium");
			driver.findElement(By.partialLinkText("Introduction to Selenium - Guru99")).click();
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,350);");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.partialLinkText("Install IDE & FireBug")).click();
			driver.navigate().back();
			driver.navigate().back();
			driver.findElement(By.partialLinkText("Selenium (software) - Wikipedia")).click();
			driver.navigate().back();
			driver.close();

			}


		// TODO Auto-generated method stub

	}


