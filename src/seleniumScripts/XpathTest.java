package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		   WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://money.rediff.com/index.html");
			
			Thread.sleep(2000);
			
	String text=driver.findElement(By.xpath("//div[@class='hmbseindicestable show']/descendant::a[1]")).getText();
		
		System.out.println(text);
		
		driver.findElement(By.xpath("//div[@class='hmbseindicestable show']/descendant::a[1]")).click();
		
		System.out.println(driver.getTitle());
		
		
	}

}
