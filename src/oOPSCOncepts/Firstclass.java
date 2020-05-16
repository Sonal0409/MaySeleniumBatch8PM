// Syntax : package packagename
// package -- Java keywords
// any statements in Java program will end with a ;
// comments: Author : Sonal Mittal
// About program : Learning Java program Structure
package oOPSCOncepts;

import javaPrograms.UserDefinedMethods;

// Syntax: modifier  classkeyword nameofclass {   
//All of the code, data, statements will be present inside this opening brackets and closing brackets
//     }
// A class in java is called as a template
// classes will use public modifer
// A class and methods in Java is an Object and not a statement, so there is no ;
// If we are accessing class from other packages than we will also have to import them
public class Firstclass extends UserDefinedMethods {  
	

	public void mymethod()
	{
	int c=  10+20;
	
	System.out.println(c);
	}
	
	static int c=10+30;
	
// Anything written outside main method will not get executed
public static void main(String [] args)
{
	
	System.out.println(c);
	
	
	Firstclass obj= new Firstclass();
	
	
	// block of code
	// code written inside main method will only get executed

	
	
	
	
	
}

}
