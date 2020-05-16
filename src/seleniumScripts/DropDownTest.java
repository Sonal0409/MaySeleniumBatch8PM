package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		
		Thread.sleep(2000);
		
		WebElement e= driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/center[1]/div/form/select"));
	
		Select dd= new Select(e);
	
	// This class Select has methods that will help us selection options from the drop down
		
		dd.selectByIndex(0);
		
		Thread.sleep(2000);
	
		
		dd.selectByIndex(3);
		
		Thread.sleep(2000);
		
		dd.selectByVisibleText("Crisp (har har...)");
		
		Thread.sleep(2000);
		
		// Counting the number of values in the dropdown
		
		// create an object of type List so as to store all the list of options of drop down
		
		List<WebElement> option =dd.getOptions();
		
		
		
	// size() will return the number of values in the list
		
		int optioncount= option.size();
		
		System.out.println(optioncount);
		
		
	// Printing each value from the drop down in console	
		
		
		for(int i=0; i<optioncount;i++)
		{
			System.out.println(option.get(i).getText());
			
			
		}
		
		
		
	}

}
