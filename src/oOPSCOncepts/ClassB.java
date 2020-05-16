package oOPSCOncepts;



// here using extends keyword we are create a parent-child relation
// now class B can use all the methods of class A
public class ClassB extends ClassA  {
	
	
	public int mul()
	{
		int a=10;
		int b=20;
		int c=a*b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassB obj= new ClassB();
		System.out.println(obj.mul()); // to perform multiplication
	      System.out.println( obj.sum());
	      
	     System.out.println(obj.sum2(10, 20));
	      
	      // if i have to call a static method from Parent class 
	      
	      concatination();
	      
	      login();
		
		// I also want to perform addition
		// one of the way is to write the addition method in the current class
		// another way and code reuse method is to call exisitng sum method from another class if any
		
	}

}
