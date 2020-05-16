package javaPrograms;

public class Methodagain {
	
	
	 static int x=10;
	
	public static int method1()
	{
		int a=10;
		int sum=a+x;
		return a;
	}

	public void login()
	{
		System.out.println("login");
	}
	
	
	public static void logout()
	{
		System.out.println("logout");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Methodagain name= new Methodagain();
		
		name.login();
		
		logout();
		
		
		
		
		
		
		
	}

}
