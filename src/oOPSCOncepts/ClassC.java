package oOPSCOncepts;



// here class C can access methods of Class B and CLass A
public class ClassC {

	// OverLoading
	// methods with same name are not allowed
	// same method names are allowed in java but different parameters and different datatypes
	public final int add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	// add 3 number
	// for variables we want to take values when calling the method, we parameterize them
	public String add(int x, String y, int z)
	{
		
		String r=x+y+z;
		return r;
	}
	
	public String add(String s, int u, String v)
	{
		
		String r=s+u+v;
		return r;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
