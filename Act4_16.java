package Act4;

public class Act4_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a method that print 10 by 10 multiplication table. Make it readable
		
		int multTableSize = 10;
		for (int i = 1; i <= multTableSize; i++) {
			for (int j = 1; j <= multTableSize; j++) {
				int result = i * j;
				System.out.printf("%5d", result);
			}
			System.out.println();
		}
	}

}
