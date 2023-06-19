package Act4;

import java.util.Scanner;

public class Act4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to solve quadratic equations with 3 variables get from users.
		
		Scanner input = new Scanner(System.in);
		double a, b, c;
		System.out.print("Input value of a: ");
			a = input.nextInt();
	    System.out.print("Input value of b: ");
	    	b = input.nextInt();
	    	System.out.print("Input value of c: ");
			c = input.nextInt();
			
		double	discriminant = b * b - 4 * a * c;
			
			if(discriminant > 0) {
				double root1 = (-b + Math.sqrt(discriminant)) / (2 * a),
						root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
				System.out.println("Root1: " + root1);
				System.out.println("Root2: " + root2);
			} else if (discriminant == 0) {
				double root = -b / (2 * a);
				System.out.println("Root: " + root);
			} else {
				double real = -b / (2 / a),
						imaginary = Math.sqrt(-discriminant) / (2 * a);
				System.out.println("Root1 " + real + " + " + imaginary + "i");
				System.out.println("Root2 " + real + " - " + imaginary + "i");
			}
				input.close();

	}

}
