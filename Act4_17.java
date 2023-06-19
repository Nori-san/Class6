package Act4;

import java.util.Scanner;

public class Act4_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to display the multiplication table of a given integer.
//		Test Data :
//		Input the number (Table to be calculated) : 15
//		Expected Output :
//		15 X 1 = 15
//		...
//		...
//		15 X 10 = 150
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the number (Table to be calculated) : ");
		int mult = input.nextInt();
		
		for (int i=1; i<=10; i++) {
			int prod = i * mult;
			System.out.printf("%2d X %2d = %3d%n", mult, i, prod);
		}
		input.close();
	}

}
