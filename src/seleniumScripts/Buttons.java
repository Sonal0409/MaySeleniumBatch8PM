package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
		
		Thread.sleep(2000);
		
		String ph=driver.findElement(By.id("wpPassword2")).getAttribute("placeholder");
		System.out.println(ph);
		
		// Write the steps for text box data entry
		
		// add wait time (7000) ms
		// go to the page and manually enter the captacha
		
		// tool will than click on the button after 7 seconds
		
		//Button
		
	WebElement e=	driver.findElement(By.xpath("//button[@id='wpCreateaccount']"));
		
		System.out.println(" to check if button is displayed or not : " + e.isDisplayed());
		
		System.out.println(" to check if button is enabled or not : " +e.isEnabled());
	    e.click();
	    Thread.sleep(2000);
	    
		
		System.out.println(" print the value of the button : " +   e.getAttribute("value"));
		
		System.out.println(" print the type of button : " + e.getAttribute("type"));

	}

}
