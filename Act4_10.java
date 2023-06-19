package Act4;

import java.util.Scanner;

public class Act4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program that takes three numbers as input to calculate and print the 
//		average of the numbers.
		
		Scanner input = new Scanner(System.in);
		int num1, num2, num3, avg;
		System.out.print("Input first number: ");
			num1 = input.nextInt();
	    System.out.print("Input second number: ");
	    	num2 = input.nextInt();
	    System.out.print("Input third number: ");
			num3 = input.nextInt();
			
		//calculate average	
			avg = (num1 + num2 + num3) / 3;
			
			System.out.println("The average is: " + avg);
			input.close();
	}

}
