package com.icicibank.loans.carloans;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ABCDriver 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		FirefoxDriver fdriver = new FirefoxDriver();
		
	}

}