package Act4;

import java.util.Scanner;

public class Act4_2 {
	public static void main(String[] args) {
		
//		Take values of length and breadth of a rectangle from the users and check if it is 
//		square or not.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input value of length: ");
	    int length = input.nextInt();
	    System.out.println("Input value of breadth: ");
	    int	breadth = input.nextInt();
	    
	    if(length == breadth) {
	    	System.out.println("the figure is a square ");
	    } else {
	    	System.out.println("the figure is a rectangle");
	    	
	    	input.close();
	    	
	    }
	}
}
