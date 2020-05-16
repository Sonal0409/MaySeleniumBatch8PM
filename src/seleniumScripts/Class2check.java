package seleniumScripts;

public class Class2check extends Configuration  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// loginto an application - test case
		
		Configuration.initialsetup();
		
		//we need an object reference to chromedriver and webdriver class so as to
		//access its methods
		// get method is present in WebDriver 
		driver.get("www.google.com");
		
	}

}
