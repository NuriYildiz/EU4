package assignment5_ForLoop;

public class Q12 {

	public static void main(String[] args) {
		
		for(int j=1 ; j<=10 ;j+=1) {
			
			for(int i=j ; i<=10*j; i+=j) {
				
				System.out.print(i + " ");
				}	
			System.out.println();
			}
		
	}

}
