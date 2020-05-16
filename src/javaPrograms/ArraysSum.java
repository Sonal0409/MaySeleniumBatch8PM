package javaPrograms;

public class ArraysSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {245, -321, 725, 43, -67, 99, 81, 4567, 54, 1, -123, 11, 13, 340, 290};  
        int sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 4; i <= arr[11]; i++) {
        	
        	System.out.println(arr[i]);
        	
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);  
	}

}
