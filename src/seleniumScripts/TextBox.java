package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
		
		Thread.sleep(2000);
		
		// check if the textbox element is displayed or not
		
		// findElement() method is used to locate an element on the webpage
		
		
	boolean dis=	driver.findElement(By.id("wpName2")).isDisplayed();
	
	System.out.println(" The username is displayed or not" + dis);
	
		// check if the textbox element is enabled or not
		
	boolean enb=	driver.findElement(By.id("wpName2")).isEnabled();
		
	System.out.println(" The username is enabled or not" + enb);
	
		// Enter text
		driver.findElement(By.id("wpName2")).sendKeys("wikiusername");
		
		Thread.sleep(2000);
		
		// clear the text
		driver.findElement(By.id("wpName2")).clear();
		
		//Enter text again
		
		driver.findElement(By.id("wpName2")).sendKeys("Sonal123");
		
		String textvalue= driver.findElement(By.id("wpName2")).getAttribute("value");
		
		System.out.println(textvalue);
		
		String ph= driver.findElement(By.id("wpName2")).getAttribute("placeholder");
		
		System.out.println(ph);
		
		String siz= driver.findElement(By.id("wpName2")).getAttribute("size");
		
		System.out.println(siz);
		
		
		// To store the location of an element
		
		// Password text box
		
	WebElement e	=driver.findElement(By.xpath("//*[@id=\"wpPassword2\"]"));
		
	
	System.out.println(e.isDisplayed());
	System.out.println(e.isEnabled());
	e.sendKeys("abc@123");
	Thread.sleep(2000);
	e.clear();
	e.sendKeys("asdasd@123455");
	Thread.sleep(2000);
	System.out.println(e.getAttribute("value"));
	
		
	/*String str ="Test";	
		
	str.compareTo("text");
	
		Integer a=10;
		
		a.compareTo(100);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
