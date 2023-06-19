package Act4;

public class Act4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write the code to print Fibonacci numbers until 300
		
		int num = 300;
		
		int a = 0, b = 1, c = 0;

		for (int i = 1; i <= num; i++) {
          System.out.println(c + " ");
          a = b;
          b = c;
          c = a + b;
      }

	}

}
