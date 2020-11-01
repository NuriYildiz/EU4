package Lab_2;

import java.util.Scanner;

public class Q2_Cokies {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of cookies:");
		int cookies = scan.nextInt();

		System.out.println("Number of calories :" + cookies * 300 / 4);

	}

}
