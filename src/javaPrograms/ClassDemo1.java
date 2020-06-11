package javaPrograms;

public class ClassDemo1 {

	String empname;
	int empid;
	
	public ClassDemo1()
	{
		System.out.println("default Constructor");
	}
	
	public ClassDemo1(int i)
	{
		System.out.println(i);
	}
	
	public ClassDemo1(String empname, int empid)   // this is  constructor
	{
		this.empname=empname;
		this.empid=empid;
		
		System.out.println(empname + " "+ empid);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
