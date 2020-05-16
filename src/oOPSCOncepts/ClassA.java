package oOPSCOncepts;

import javaPrograms.UserDefinedMethods;

public class ClassA {
// final class properties or methods cannot be inheritated
	
	
	public int sum()
	{
		// a1, ,b1,c1 scope is only in between sum() method
		int a1=10;
		int b1=20;
		int c1=a1+b1;
		return c1;
	}
	
	public int sum2(int a1, int b1)
	{

		int c1=a1+b1+40;
		return c1;
	}
	
	
	
	// static method
	
	public static String concatination()
	{
		String s1= "Selenium";
		String s2="training";
		String s3= s1+s2;
		return s3;
	}
	
	public static void login()
	{
		System.out.println("loginto an application");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// I will create an object here and call the method if required.
		
		UserDefinedMethods.mul();
	}

}
