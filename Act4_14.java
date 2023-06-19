package Act4;

import java.util.Scanner;

public class Act4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to read n numbers from keyboard and find their sum and average
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number of n :  ");
		int n = input.nextInt(),
		
		sum = 0,
		avg= 0;
		
		for (int i = 1; i<=n; i++) {
            sum += i ;
            avg = sum /n;
            
		}
		System.out.println("The Sum is : " + sum + "\nThe Average is : " + avg);
		input.close();

	}

}
