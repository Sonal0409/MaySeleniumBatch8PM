package javaPrograms;

public class ArraysinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we can store only one value
		 int a = 10;
		 
		 String s="Selenium";
		 // An object which has states and behaviour in Java
		 
		 // it is an instance of the class, as in the object can access the methods or variables of that class 
// Arrays in java: which are used to store multiple values  of same datatype and arrays are of fixed size
		 
	// Declare an array : 3 ways of writing an array
		 // when we are declaring an array, we have to provide following details
		 // name of the array, type of array, length of array, values
		 
		 // Array is an Object
		// Method 1: 
		 
		 //dataType arrayname [];
		 // Declaring name and type of array
		 
		 int a1[];
		 
		 // arrayname = new dataType[size]
		 // length of array
		
		 a1= new int [5];
		 
		 // assign data to the array
		 
		 a1[0]=100;
		 a1[1]=200;
		 a1[2]=300;
		 a1[3]=400;
		 a1[4]=500;
		 //a1[5]=600;   // this is more than the length of =array defined
		 
		System.out.println(a1[3]) ;
		
		// 2nd method
		
		//datatype [] arrayname = new dataType[size]

		 String [] a2= new String[5];
		 
		 a2[0]="selenium";
		 a2[1]="training";
		 a2[2]="8PM";
		 a2[3]="Sonal";
		 a2[4]="Mittal";
				 
		 System.out.println(a2[3]) ;
		 
		 //3rd Method
		 
		 // dataType[] arrayname={value1,value2,value3};

		 
		 
		 
		String [] s1= {"Selenium","UFT","ABC"};
		
		
		// How to print all the values of an array, we will use for loop
		
		int [] a3= {10,20,30,40,50,60,50};
		
		for(int i=0;i<7;i++) // when i=2
		{
			System.out.println(a3[i]) ;  // 10  //a3[1] =20  ....a3[2]=30
		}
		
		
		// Multidimensional array
		
		// in a single array you want to store 2 or 3 sets of data
		int [] az= {10,20,30,40,50,60,50};
		
		
		
		// length of array a4 = 3;
		
		// assingment is to print values of this entire array
		
		// use 2 for loops 
		// 1st loop is for main loop
		// 2nd loop for child array values inside the main array
		
		
		//a4.length;  // will calculate the length of an array
		
		int [][] a4= {{10,20,30},{100,200,300,500},{25,35,45}};
		
		System.out.println(a4.length);
		System.out.println(a4[1].length);
		
		
		for(int i=0; i<a4.length;i++)
		{
			for(int j=0; j<a4[i].length;j++)
			{
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
