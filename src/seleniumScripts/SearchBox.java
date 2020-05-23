package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBox
{
public static void main(String[] args) throws InterruptedException 
 
{
	
//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Testing");
		
		Thread.sleep(3000);
		
List<WebElement>	lis	=driver.findElements(By.xpath("//ul[@class='erkvQe']/descendant::div[@role='option']"));


             System.out.println("size of list : " +     lis.size());  // 10
             
             
for(int i=0;i<lis.size();i++)
{
	System.out.println(lis.get(i).getText());  // testing, testing tools
	
	if(lis.get(i).getText().contains("tools"))
	{
		lis.get(i).click();
		break;
	}
	
}


 }

		
		
		
}	


