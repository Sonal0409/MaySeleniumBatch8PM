package seleniumScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://www.popuptest.com/goodpopups.html");
			
			Thread.sleep(2000);
			
			
			driver.findElement(By.linkText("Good PopUp #3")).click();
			
			// To learn how to switch between windows
			
		Set<String> handles	=driver.getWindowHandles();
		
	Iterator<String> it =handles.iterator();
		
// fetch the parent window handles
	
	String parentid=it.next();
	
	System.out.println(parentid);
	
	// fetch the parent window handles
	
		String childwindowid=it.next();
		
		System.out.println(childwindowid);
	
	
	driver.switchTo().window(childwindowid);
	
	driver.manage().window().maximize();
	
	String title= driver.getTitle();
	
	System.out.println("title of popup window: " + title);
	
	Thread.sleep(3000);
	driver.close();  // close the popup window
	
	
	driver.switchTo().window(parentid);
	
String titleparent= driver.getTitle();
	
	System.out.println("title of Parent window: " + titleparent);
	
	Thread.sleep(3000);
	driver.close();  // close the parent window
	
	
	}

}
