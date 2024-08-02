package CodingPracticals;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practical1 {

	public static void main(String[] args) {
		int[] numbers = new int[500];
	    Random random = new Random();
	    
	    // loop through to populate the array with random numbers between 0 and 999
	    for (int i = 0; i < numbers.length; i++) {
	    	numbers[i] = random.nextInt(1000); 
        }
	    // sort array from smallest to largest number
	    Arrays.sort(numbers);
	    // Ask the user to input the nth smallest number
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the nth smallest number: ");
	    int n = input.nextInt();
	    
	    //print up the the number n and show that it's the nth smallest
	    for (int i = 0; i < n; i++) {
	    	System.out.print(numbers[i] + " "); 
        }
	    System.out.println();
	    System.out.println("The " + n + "th smallest number is: " + numbers[n - 1]);
	    	
	}

}
