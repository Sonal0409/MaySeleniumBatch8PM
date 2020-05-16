package javaPrograms;

public class VariablesJava {
	
	
	// Class level declaration of variables
	
	static int x=100;   // global variable or class variable or static variable
	// this variable can be used in any method of the class
	
	// if a set of data has to be used again and again in different methods of the class than we will go for gloabal variables
	
	static String s1;
	
	static boolean b1;
	
	static float f1;
	
	static double d1;
	
	
	
	
	public void method1()
	{
		int s=20;
		int y=30;  // local variables : the scope of using these variables is only in this method
		int sum= s+y+x;
		System.out.println(sum);
		
	}
	
	public void method3()
	{
		int s=20;
		int y=30;  // local variables : the scope of using these variables is only in this method
		int sum= s+y+x;
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables and DataTypes
		
	// Variable: There are temporary locations to store data	
		
	// datatype variablename = assigned data	;
		// datatype variable;
	
		// datatype: 
		
	
		
		 int prd1=100;  // int datatype
		 
		// The value of char datatype will always be stored in single quotes 
		 
		char prd2= 'c';  // char dataype
		
		// a float value will always have a suffix which is f or F
		
		 float prd3= 2.34F;  // float datatype
		
		double d= 3.455677868667676767;   // double datatype
		
		// The value of String datatype will always be stored in double quotes
		
		    String var1= "Selenium";
		
		    String var= "Selenium@8PM";  // String datatype
		
		
		      boolean var2 = true;
		      
		      boolean var3 = false;
		
	int	abc;
	
	
	 String name="Sonal";
	 String $lastname="Mittal";
	 String _email="abc@gmail.com";
	 int age= 23435;
	 
	 int empid=184672;
	 
	 
	 int a=100;   // local variables
	 
	 int b=200;
	  
	

int c=a+b+x;
	
	
System.out.println(c);
	
	
	
	
		
		
	}

}
