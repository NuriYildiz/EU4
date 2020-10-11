package assignment5_ForLoop;

public class Q13 {

	public static void main(String[] args) {

		for(int i=1; i<=8 ;i++) {
			if (i%2==0) {			
				for(int j=1; j<=4; j++) {
			
					System.out.print("B ");
					System.out.print("W ");
				}	System.out.println();
			}else {
				
				for(int j=1; j<=4; j++) {
					System.out.print("W ");
					System.out.print("B ");		
				}	System.out.println();
			
			}
		}

	}

}
