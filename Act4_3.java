package Act4;

import java.util.Scanner;

public class Act4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		A school has following rules for grading system:
//			a. Below 25 - F
//			b. 25 to 45 - E
//			c. 45 to 50 - D
//			d. 50 to 60 - C
//			e. 60 to 80 - B
//			f. Above 80 - A
//			print the corresponding grade base of variable, Which you get from users.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input grade: ");
	    int grade = input.nextInt();
	    
	    if (grade < 25) {
	    	System.out.println("Grade is F");
	    } else if (25 < grade && grade < 45) {
	    	System.out.println("Grade is E");
	    } else if (45 < grade && grade < 50) {
	    	System.out.println("Grade is D");
	    } else if (50 < grade && grade < 60) {
	    	System.out.println("Grade is C");
	    } else if (60 < grade && grade < 80) {
	    	System.out.println("Grade is B");
	    } else {
	    	System.out.println("Grade is A");
	    }
	    
	    input.close();

	}

}
