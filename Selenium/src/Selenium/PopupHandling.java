package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("lst-ib")).sendKeys("ksrtc");
		driver.findElement(By.partialLinkText("KSRTC.in: KSRTC Official Website for Online Bus Ticket Booking")).click();
	    driver.findElement(By.id("fromPlaceName")).sendKeys("Vijayawada");
	    driver.findElement(By.id("searchBtn")).click();
	    
	   Alert all = driver.switchTo().alert();
	    System.out.println(all.getText());
	    all.accept();
	    driver.close();
		// TODO Auto-generated method stub

	}

}
