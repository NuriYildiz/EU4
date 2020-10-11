package assignment5_ForLoop;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		int i=1;
		int sum=0;
		int upperBound=0;
		
		System.out.println("Enter upper bound: ");
		upperBound = scan.nextInt();
				 
		while(i<=upperBound) {
			sum=i+sum;
			i++;
		}
		System.out.println("Sum: " + sum + ".");
	}

}





	