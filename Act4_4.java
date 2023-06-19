package Act4;

import java.util.Scanner;

public class Act4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Take 4th int values from the users and print greatest among them

		Scanner input = new Scanner(System.in);
		int val1, val2, val3, val4;
		System.out.print("Input value of length: ");
			val1 = input.nextInt();
	    System.out.print("Input value of length: ");
	    	val2 = input.nextInt();
	    	System.out.print("Input value of length: ");
			val3 = input.nextInt();
	    System.out.print("Input value of length: ");
	    	val4 = input.nextInt();
	    	
	    System.out.println( "Greatest value is: " + Math.max( Math.max(val1, val2), Math.max(val3, val4)));
	    input.close();
	    
	}

}
