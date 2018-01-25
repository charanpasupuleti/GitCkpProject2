package CKPtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class InvokeChrome {

	//private static final CharSequence IWebelent = "14fb.cherry";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
		ChromeDriver drive = new ChromeDriver();
		drive.get("https://www.facebook.com/");
		
		drive.findElement(By.name("email")).sendKeys("charan_4u22@yahoo.com");
		drive.findElement(By.cssSelector("input[type='password']")).sendKeys("14fb.cherry");
		drive.findElement(By.cssSelector("input[value='Log In']")).click();
		
		Actions action = new Actions(drive);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		//log out from facebook
		WebElement usernav = drive.findElement(By.id("userNavigationLabel"));
		usernav.click();
		Thread.sleep(1000);
		drive.findElement(By.partialLinkText("Create Page")).click();
		usernav.click();
		Thread.sleep(1000);
		drive.findElement(By.partialLinkText("Create Group")).click();
		Thread.sleep(3000);
		action.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(1000);
		usernav.click();
		drive.findElement(By.partialLinkText("Log Out")).click();
		
		
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver");
		FirefoxDriver fdrive = new FirefoxDriver();
		fdrive.get("https://www.amazon.in/");
	}

}
