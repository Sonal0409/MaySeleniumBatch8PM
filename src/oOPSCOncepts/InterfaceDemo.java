package oOPSCOncepts;

// implements keyword will be used in order implement the methods of an Interface

public class InterfaceDemo implements IntrTest {

	public int sum()
	{
		// a1, ,b1,c1 scope is only in between sum() method
		int a1=10;
		int b1=20;
		int c1=a1+b1;
		return c1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// you cannot intsantiate an object for an interface.
		
		// creation of an object which will call only methods of interface class
		
		IntrTest rv;
		 
		 // reference variable
		// this is object where the methods are implemented
		InterfaceDemo obj= new InterfaceDemo();
		
		rv=obj;
		
		// method2 to create object reference is
		
		IntrTest rv1= new InterfaceDemo();
		
		rv.create();
		rv.delete();
		rv.modify();
		rv1.create();
		
		
		
		// WebDriver driver= new ChromeDriver();
		
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Account creation method");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Account deletion method");
	}

	@Override
	public void modify() {
	
	}

}


