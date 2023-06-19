package Act4;

public class Act4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to convert minutes into a number of years and days.
		
		int minutes = 525600,
			//converting minutes to days
			days = minutes / 1440,
			//converting days to years
			years = days / 365;
		
		System.out.println(minutes + " minutes is " + days + " days and " + years + " years.");


	}

}
