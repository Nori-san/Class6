package Act4;

import java.util.Scanner;

public class Act4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to accept a grade and declare the equivalent description :
//			Grade 		Description
//			E 			Excellent
//			V 			Very Good
//			G 			Good
//			A 			Average
//			F 			Fail
//			Test Data :
//			Input the grade :a
//			Expected Output :
//			You have chosen : Average
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the grade :  ");
		char grade = input.next().charAt(0);
		
		switch (grade) {
		case 'e':
			System.out.println("You have chosen : Excellent");
			break;
			
		case 'v':
			System.out.println("You have chosen : Very Good");
			break;
			
		case 'g':
			System.out.println("You have chosen : Good");
			break;
			
		case 'a':
			System.out.println("You have chosen : Average");
			break;
			
		case 'f':
			System.out.println("You have chosen : Fail");
			break;
			
		default:
			System.out.println("Invalid grade");
		}
		input.close();
	}

}
