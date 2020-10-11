package assignment5_ForLoop;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		
		int i=1;
		int end=11;
		
		//Scanner scan=new Scanner(System.in);
		System.out.println("Enter end number ");
		
		//end = scan.nextInt();
		
		while (i<=end) {
			if (i%2==1) { System.out.print(i);
					
			}else {System.out.print(",");
				
			}i++;
		} 
		
	}

}
