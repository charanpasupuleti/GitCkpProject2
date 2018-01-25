package CKPtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class ABCDriver 
{

	//private static final CharSequence IWebelent = "14fb.cherry";

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
		ChromeDriver drive = new ChromeDriver();
		
		drive.get("https://www.amazon.in"); //using get method
		drive.navigate().to("https://www.amazon.in"); // using navigate method
		
		drive.manage().window().fullscreen(); // to maximize window
		/*drive.manage().deleteAllCookies();  // to delete all cookies of browser
		
		String title = drive.getTitle();  //getting title name
		System.out.println(title);
		
		//drive.getCurrentUrl();
		System.out.println(drive.getCurrentUrl()); //getting current url
		
		drive.navigate().back(); 
		Thread.sleep(3000);
		drive.navigate().forward();
		Thread.sleep(3000);
		drive.navigate().refresh();
		
		drive.close();  //close current active window/tab
		drive.quit();   // close all windows/tabs opened by webdriver
		//drive.getWindowHandle();*/
		
		//drive.findElement(By.id("twotabsearchtextbox")).click();   // one way of performing
	
		WebElement searchbox = drive.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("apple");
		Thread.sleep(3000);
		drive.findElement(By.name("field-keywords")).clear();
		Thread.sleep(3000);
		//drive.findElement(By.className("nav-input")).sendKeys("cherry"); // class is not unique many times
		drive.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("oaktech");
		Thread.sleep(3000);
		drive.findElement(By.linkText("Today's Deals")).click();
		
		drive.findElement(By.partialLinkText("Customer")).click();
		
		do
		{
	   ((RemoteWebDriver)drive).executeScript("window.scrollBy(0,100)");
		}while(false);
	   
		Thread.sleep(5000);
	   drive.findElement(By.partialLinkText("Careers")).click();
	   Thread.sleep(5000);
	   ((RemoteWebDriver)drive).executeScript("window.scrollBy(0,800)");
	   Thread.sleep(5000);
	   ((RemoteWebDriver)drive).executeScript("window.scrollBy(0,-800)");
		////*[@id="twotabsearchtextbox"]
	   
	   
	   
	   
	}
	
	
}
