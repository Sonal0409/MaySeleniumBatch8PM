package javaPrograms;

public class UserDefinedMethods {
	
	 static int s=100; // global variable or static variable
	
	

	// Userdefined methods are written outside main method
	// calling of the method is done in main() method
	
	// method which return a value
	
	// modifier datatype methodname()
	
	public int sum()
	{
		int a=10;  // local variable
		int b=20;
		int c=a+b+s;
		return c;
		
	}
	
	public int sum1()
	{
		int a=10;
		int b=20;
		int c=a+b+s;
		System.out.println(" printing value of c inside the method"+c);
		return c;
		
	}
	
	// Methods which don't return a value
	
	
	public void login()
	{
		System.out.println("logic to log into an application");
	}
	
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum of 2 numbers of add() method " + c);
	}
	
	
	// Static method
	
	// static methods returning a value
	// we call a static method without an object
	// just call by its name
	public static int mul()
	{
		int x=10;
		int y=20;
		int result=x*y*s;
		return result;
	}
	
	public static void account()
	{
		System.out.println("account info logic");
	}
	
	
	
	
	
// write a method to loginto the application
	//write a method to logout the application
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	// calling of the methods in done in main() method
		
		// How to call a method
		// create a class object to call a user defined method
		
		//classname objectname= new Classname();
		
		
		UserDefinedMethods obj= new UserDefinedMethods();	
		
		// only if a method is returning a value, putting that method inside a
		// print statement is allowed
		
	obj.add();
	
	int res= mul();
	System.out.println(res);
		System.out.println(mul());   // calling a static method
		account();
	int sumResult	=obj.sum();  // output as 30
		
		System.out.println(sumResult);
		
		int finalresult= sumResult+100+s;
		
		System.out.println(finalresult);
		
		
		//sum1();  // no object is needed to call a static method
		
		
		
	}

}
