package com.icicibank.loans.carloans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicClass implements BasicInterface
{
	
	int a = 20;
	float f = (float) 20.543;
	
	public void m1()
	{
		System.out.println("I am method m1....");
	}

	public void m2()
	{
		System.out.println("I am method m2....");
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.out.println("Hi");
		
		/*BasicClass obj = new BasicClass();
		obj.m1();
		obj.m2();
		System.out.println(obj.a);
		System.out.println(obj.f);
		obj.m3();*/
		
		int a = 2;
		int b = 3;
		int c = a+b;
		
		System.out.println(a+"+"+b+"="+c);
		
		String cherry = "cheery is a super hero";
		System.out.println(cherry.length());
		System.out.println(cherry.charAt(10));
		System.out.println(cherry.substring(15));
		System.out.println(cherry.indexOf("h"));
		
		//Reverse a word
		
		String C = "AVEVA";
		String D = "";
		
		for ( int i=C.length()-1; i>=0; i--)
		{
			D = D + C.charAt(i);
	
		}
		System.out.println(D);
		
		if(C==D)
		{System.out.println("This is a palandrom");}
		
		
		int e[] = {6,8,12,34,54,98};
		int f = 0;
		int total=0;
		for (int i=0; i<e.length;i++)
		{
		System.out.println(e[i]);
		total = total + e[i];
		}
		
		System.out.println("total =" +total);
		
		//find the index of desired no 34
		
		for (int i=0; i<e.length;i++)
		{
			if (e[i] == 97)
			{
				System.out.println(i);
				break;
			}
			
		}
	
	/*	WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("download selenium");
		
		driver.findElement(By.name("btnK")).click();*/
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("I am method interface m3....");
	}

	
}
