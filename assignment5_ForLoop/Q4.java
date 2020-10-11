package assignment5_ForLoop;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter a number ");
		
		int i = scan.nextInt();
		
		while(i * 10<100) {
			int product = i * 10;
			System.out.println(product);
			i++;
		}
		 
		

	}

}
