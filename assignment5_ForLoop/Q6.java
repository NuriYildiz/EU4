package assignment5_ForLoop;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		int i = 0;
		int a = 0;
		int b = 1;
		int c = 0;
		
		System.out.println("Enter n: ");
		n = scan.nextInt();
		
		for(i =0 ; i <n ; i++) {
			System.out.print(a + " ");
			c = a+b;
			a=b;
			b=c;
			
		}
		
	}

}
