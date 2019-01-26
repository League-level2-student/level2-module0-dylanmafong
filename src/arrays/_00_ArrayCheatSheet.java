package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] x = new String[5];
 		//2. print the third element in the array
		System.out.println(x[2]);
		//3. set the third element to a different value
		x[2] = "hi";
		//4. print the third element again
		System.out.println(x[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
		//6. make an array of 50 integers
		    int [] y = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < y.length; i++) {
			y[i] = new Random().nextInt();
		}
		//8. without printing the entire array, print only the smallest number in the array
		int small = y[0];
		for (int i = 0; i < y.length; i++) {
			if(small>y[i]) {
				small = y[i];
			}
		}
		System.out.println("Smallest: "+small);
		
		//9 print the entire array to see if step 8 was correct
		 for (int i = 0; i < 50; i++) {
				System.out.println(y[i]);
		}

		
	//10. print the largest number in the array.
		 int big = y[0];
		for (int i = 0; i < y.length; i++) {
			if(big < y[i]) {
				big = y[i];
			}
		}
		System.out.println("Biggest: "+big);
	}
	
}
