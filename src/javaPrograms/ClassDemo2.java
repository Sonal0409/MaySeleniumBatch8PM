package javaPrograms;

public class ClassDemo2 extends ClassDemo1{

	// super keyword
	// in a constructor you will have only 1 super keyword
	public ClassDemo2()
	{
		super("Tom",1867);
		System.out.println("Child class Constructor");
	}
	
	public ClassDemo2(String empdept)
	{
		super(10);
		System.out.println("empdept");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassDemo2 obj= new ClassDemo2();
		ClassDemo2 obj2= new ClassDemo2("IT");
		
	}
	
	

}
