package javaPrograms;

public class OperatorsJava {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Operators in Java
		// 1. Arithmetic Operators
		
		// Addition ---   +
		
		int a=20;
		int b=30;
		
		int c;
		
		// a+b will return some value , so we have to store the result in a variable
		// the outut is going be an integer value
		
		
		int result=a+b;    // Arithmetic expression
		
		System.out.println("The output of addition is :" + result);
		
		c=a+b;  // 50
		
		int d= c+a;   // 70
		
		System.out.println(d);
		
		String s ="Sonal";
		
		String s1= "Mittal";
		
		
		String result2= s+s1;
		
		System.out.println(result2);
		
		System.out.println(s+ " " +s1);
		
		
		
		// Assignment : Declare 2 integer variables x and y and assign values it
		// Declare a variable result1 to store result,
		// use (-) operator on variables x and y and store the output in result1 and print it
		
		// Declare 2 integer variables x1 and y1 and assign values it
		// Declare a variable result2 to store the output,
		// use (*) operator on variables x1 and y1 and store the output in result2 and print it
		
		// Declare 2 integer variables x2 and y2 and assign values to it
				// Declare a variable result3 to store the output,
				// use (/) operator on variables x2 and y2 and store the output in result3 and print it
		
		
		// increment (++) : whenever this operator is used with an integer it increases it value by 1
		
		//and decrement (--) operators : whenever this operator is used with an integer it decreases it value by 1
		
		// 
		
		int i=0;   // value of i is 0
		
		System.out.println(i);  // output will be 0
		
		 ++i;   // pre increment  -- i=1
		
		
		System.out.println(" incremented the value of i :" + i);  // output will be 1
		
		
		System.out.println(" value of i in post increment: " + i++);   // post increment
		
		
		
		System.out.println(i);   // value of 2
		
		
		
		
		int j=0;
		
		System.out.println("the out put when we do --j : " + --j);   // decrement the value of j by 1
		
		System.out.println("the current value of J " + j);
		
		System.out.println("the out put when we do j-- : " + j--);
		
		System.out.println("the current value of J " + j);
		
		
		
		// Relational Operators --- out put will be boolean
		
		
		// ==    equals to
		
		int r1 =100;
		
		int r2=100;
		
		// (r1==r2) is called as relational expression
		
		boolean r3 = (r1==r2);  // true
		
		System.out.println(" the output of equals operators: " + r3);
		
		
		int r4= 200;
		
		boolean r5= (r1==r4); // False
		
		System.out.println(" the output of equals operators: " + r5);
		
		boolean r6= 100==300; // False
		
		System.out.println(" the output of equals operators: " + r6);
		
		// not eaual to -- !=
		
		boolean n1= (100!=200);   // True
		
		System.out.println(" the output of not equals operators: " + n1);
		
		
		// Greater than or equal ---    >=
		// Atleast one of the above methoned condition should be true to get the output as True
		
		int g1= 45;
		
		int g2=75;
	
		//  85 > = 75   // true, false   ----> true
		// false & false  --> false
		
		boolean g3= (g1>=g2);   // False
		
		System.out.println("The output of greater than and equals to is : " + g3);
		// 45>=75  // False
		
		//75>=75    // True
		
		// 81>=75   // True
		
		// Assignment
		// less than or equal ---    <=
				// Atleast one of the above mentioned condition should be true to get the output as True
					
		// less than ----  <
		// greater than == >
		
		// Logical Operators:
		
		
		// 1 And Operators --- &&
		
		// it is used to compare relational expression
		// in AND operator both the expression have to be True, so as to get the output as TRUE
		// otherwise the output will be False
		// if output of any one of the expression is False, the final output will also be false
		
		// expres 1 = true && express2 is True ---> True
		// expres 1 = False && express2 is True --> False
		// expres 1 = true && express2 is False  ---> False
		///expres 1 = False && express2 is False  --- False
		
		int a1=20;
		int a2= 30;
		
		int a3=50;
		//                  true && true
		boolean aresult= ((a1<a2)&&(a1<a3));   // True
		
				
			System.out.println("output of AND operator : " + aresult)	; //True
			
			//               False  &&  True
		boolean aresult1= ((a1==a2)&&(a1<a3));	  // False
			
		System.out.println("output of AND operator with False and True : " + aresult1)	;	// False	
				
				
				
		// OR operator  ---  ||
		
		// in OR operator any one  the expression can be True, so as to get the final output as TRUE
		
		// if both the expressions is false only than, the final output will also be false
		
		// expres 1 = true || express2 is True ---> True
		// expres 1 = False || express2 is True --> True
		// expres 1 = true || express2 is False  ---> True
		///expres 1 = False && express2 is False  --- False	
		
			//                  true     true	
			boolean oresult= ((20<40)||(20==20));   // True
		
			System.out.println("output of OR operator : " + oresult); // true
			
			//                   True  ||  False
			boolean oresult1= ((20<40)||(20>50));   // True
			
			System.out.println("output of OR operator : " + oresult1); //true
			
			
			//	//                   False  ||  False
			boolean oresult2= ((20==40)||(20>50));   // False
			
			System.out.println("output of OR operator : " + oresult2); //False
			
			
			
			// Not operator ---  !
			// Not operator is always applied on a realtional expression
		boolean nt1 = !(20==20);  //true --- change to False
			// 20 not equal to 20   ---> False
		
		System.out.println("output of Not operator : " + nt1); 
			
			
		boolean nt2 = !(20<10);  // False --- change to True
		// 20 is not less than 10   ----> the out put will be True
		
		System.out.println("output of Not operator : " + nt2); // True
		
		
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
