package Selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the username");
		String username = scan.nextLine();
		driver.findElement(By.id("usernameId")).sendKeys(username);
		System.out.println("Enter the password");
		String password = scan.nextLine();
		driver.findElement(By.name("j_password")).sendKeys(password);
		System.out.println("Enter the Capcha");
		String capcha =scan.nextLine();
		driver.findElement(By.name("j_captcha")).sendKeys(capcha);
		driver.findElement(By.id("loginbutton")).click();
	    String url = driver.getCurrentUrl();
	 
	    if(driver.findElement(By.xpath("//*[@id='loginerrorpanel_content']")).isDisplayed())
	    		{
	    	System.out.println("Login Unsuccessful");
	        System.out.println(driver.findElement(By.xpath("//*[@id='loginerrorpanel_content']")).getText());  
	    		} 
	    else
	    {
	    	System.out.println("Login Successfull");
	    }
	    
	    
	    driver.close();
	}   
	  }
	   
	