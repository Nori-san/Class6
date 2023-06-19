package Act4;

import java.util.Scanner;

public class Act4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to convert temperature from Fahrenheit to Celsius degree getting 
//		the values from users.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input temperature in Fahrenheit: ");
		int fahrenheit = input.nextInt(),
		
		//converting to celsius
		celsius = (fahrenheit -32) * 5/9;
		System.out.println(fahrenheit + "F degrees fahrenheit is " + celsius + "C degrees in celsius");
		input.close();
		
	}

}
