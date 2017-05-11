package Selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://pacehr.techmahindra.com/psp/PACEHR/?cmd=login&languageCd=ENG");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Username");
		String user = scan.nextLine();
		driver.findElement(By.id("user")).sendKeys(user);
		System.out.println("Enter the Password");
		String password = scan.nextLine();
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		String url = driver.getCurrentUrl();
		
		if(url.equals("https://pacehr.techmahindra.com/psp/PACEHR/EMPLOYEE/HRMS/h/?tab=DEFAULT"))
		{
			System.out.println("Login Successfully");
		}
		else
		{
			System.out.println("Login Unsuccessful");
		}
		driver.close();
		// TODO Auto-generated method stub

	}

}
