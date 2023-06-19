package Act4;

public class Act4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("a.");
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\n");
		
		
		System.out.println("b.");
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\n");
		
		
		System.out.println("c.");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\n");

		
		System.out.println("d.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 5; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        
        System.out.println("d.");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 5; k++) {
                System.out.print("* ");
            }
            System.out.println();
        	}
        System.out.println("\n");
        
	
        System.out.println("e.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 5; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        
        System.out.println("f.");
        int count = 1;
        for (int i = 1; i <= 5; i++) {
        	for (int j = 1; j <= i; j++) {
        		count++;
        		System.out.print(count + " ");
        	}
        	System.out.println();
        }
        System.out.println("\n");
        
        System.out.println("g.");
        for (int i = 1; i < 4; i++) { 
            for (int j = 1; j < 4-i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
        for (int i = 4 - 1; i >= 1; i--) {
            for (int j = 1; j < 4-i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        
        
        System.out.println("h.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2*i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 5 - 1; i >= 1; i--) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2*i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
	
	
	}
}

