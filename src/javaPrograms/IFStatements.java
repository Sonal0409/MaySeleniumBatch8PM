package javaPrograms;

public class IFStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Single if condition
		
		int a=10;
		
		if(a<20)    // if the condition is true, the print statements inside the flower brackets will get executed
		// if the condition is false, the statements inside the flower bractes will not get executed
		{
			
			System.out.println("learning if condition");
			
			System.out.println("A is less than 20");
			
			System.out.println("if condition is True");
				
		}
		
		if(a>20)   // here the condition is false, the lines below in the brackets will not get excuted
		{
            System.out.println("learning if condition again");
			
			System.out.println("A is not greater  than 20");
			
			System.out.println("if condition is False");
		}
		
		
		int b=30;
		int c=a+b;
		System.out.println(c);
		
		
		if((a<b)&&(b<c))   // True
		{
System.out.println(" Compound if condition is True");
		}
			
		if(!((a<b)&&(b<c)))   // True
		{
System.out.println(" Compound if condition is False");
		}
		
		
		// Nested If
		
		
		if(a<20)
		{
			if(a==10)
			{
				if(b>a)   
				{
					if(b<c)
					{
						System.out.println("nested if executed");
					}
				}
			}
		}
		
		
		
		int d= 20+c;
		
		System.out.println(" output of d: "+ d);
		
		
		
	//	if-else condition
		// if the condition is true, if block will be excuted and else block will be ignored
		// if the condition is false than if block will be executed, else block will get executed
		
	if(d<c)    // false
	{
		System.out.println("if condition is true in case of if-else block");
	}
		
	else if(!(a==10))
	{
		System.out.println("a is = to 10, so else if block is executed");
	}
	else if (b==20)
	{
		System.out.println("b is = to 20, so else if block is executed");
	}
	else 
	{
		System.out.println(" No if condition is true, so else block executed");
	}
		
		
	// Nested if again
	
	String name="Sonal";
	String emp="184672";
	String trn="selenium";
	
	if(name=="Sonal")
	{
		if(emp=="184673")
		
		if(trn=="selenium")
			{
				System.out.println("Assign 8 Pm batch to sonal");
			}
		}
		
	}
	
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


