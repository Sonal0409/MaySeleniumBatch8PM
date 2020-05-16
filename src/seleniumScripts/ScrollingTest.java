package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ironspider.ca/forms/checkradio.htm");
		
		Thread.sleep(2000);
		
		// To scroll until the element is visible
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		
		js.executeScript("scroll(0,1000)");
		
		Thread.sleep(2000);
		
		js.executeScript("scroll(0,-300)");
		
		
	/*	WebElement e= driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", e);
		
		e.click();*/
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
