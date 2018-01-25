package CKPtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
		ChromeDriver drive = new ChromeDriver();
		
		drive.get("https://www.amazon.in"); //using get method
		drive.navigate().to("https://www.amazon.in"); // using navigate method
		
		//drive.manage().window().fullscreen();
		int counter = 0;	
		int counter1 = 0;	
		List<WebElement> var = drive.findElements(By.tagName("a"));
	 
	 for (int i=0; i<var.size(); i++)
	 {
		 if(!var.get(i).getText().isEmpty())
		 
			 {
			 counter++;
			 String links = var.get(i).getText();
			 System.out.println(links);
			 }
	}
	 				System.out.println("Total No of Links : " +var.size());		
	 				System.out.println("Final unempty links count : "  + counter);
	 		
	 for (int i=0; i<var.size(); i++)
	 		 {
	 			 if(var.get(i).getText().isEmpty())
	 			 
	 				 {
	 				 counter1++;
	 				 }
	 		}
	 		 		System.out.println("Final empty links count : "  + counter1);
	 		 		
	 		
	 	
	}

}
