package Act4;

import java.util.Scanner;

public class Act4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write the program to print the factorial number of the value getting from user?
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a value: ");
		int num = input.nextInt();
		
		int i = 1,
		factorial = 1;
		
		while(i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println(num + "! = " + factorial);
        input.close();
		

	}

}
