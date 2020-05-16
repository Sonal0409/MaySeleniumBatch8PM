package oOPSCOncepts;

public class ClassD extends ClassC{

	
	// Overriding
	
	//Suppose child class has the methods with same name as parent class
	// than when you call the methods, which method will be called:  Method of current class will be called.
	
	
	public int add1()
	{
		int p=100;
		int q=2000;
		int r1= p+q;
		return r1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 final int a=10;  /// it values will remain constant
		
		 ClassD obj= new ClassD();
		 
		 obj.add();  // class C
		
		// a=a+200; // value of a is now 210 
		 
		 
		 
	}

}
