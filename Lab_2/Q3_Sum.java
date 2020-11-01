package Lab_2;

import java.util.Scanner;

public class Q3_Sum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number other than zero");

		int num = scan.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
