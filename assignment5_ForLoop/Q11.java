package assignment5_ForLoop;

public class Q11 {

	public static void main(String[] args) {

		int i=4;
		int j=4;
		
		for(i=4;i>0;i--) {
			for(int k=0 ; k<4-i; k++) {
				System.out.print("    ");
			}
			for(j=i;j<=i && j>0;j--) {
				System.out.print(j + "       ");
			}
		System.out.println("");
		}

	}

}
