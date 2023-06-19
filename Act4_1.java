package Act4;

public class Act4_1 {

	public static void main(String[] args) {
		
//		Write the program, which is calculate the profit of investment , given an amount of investment, 
//		interest rate and number of investment year.
//		principle = 1000; // notice that this is a valid double value
//		interestRate = 0.0625; // that is 6.25%
//		numOfYears = 5;
//		numOfYears = 8;//also calculate for 8 years
		
		// TODO Auto-generated method stub
		int numOfYears = 5;
		double principle = 1000, 
			interestRate = 0.0625,
			profit = principle * numOfYears * interestRate;

		//for 5 year
		System.out.println("The profit of investment after " + numOfYears + " years is " + profit); 
		
		//for 8 years
		numOfYears = 8;
		profit = principle * numOfYears * interestRate;
		System.out.println("The profit of investment after " + numOfYears + " years is " + profit); 
		
		
		 
		 	

	}

}
