package Act4;

import java.util.Scanner;

public class Act4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to find the sum of the series 1 +11 + 111 + 1111 + .. n terms.
//		Test Data :
//		Input the number of terms : 5
//		Expected Output :
//		1 + 11 + 111 + 1111 + 11111 +
//		The Sum is : 12345
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number of terms :  ");
		int terms = input.nextInt(),
		
		sum = 0,
		n = 1;
		
		for (int i = 1; i<=terms; i++) {
			System.out.print(n + " + ");
            sum += n;
            n = (n * 10) + 1;
		}
		System.out.println("\nThe Sum is : " + sum);
		input.close();
	}

}
