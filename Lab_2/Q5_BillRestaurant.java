package Lab_2;

import java.util.Scanner;

public class Q5_BillRestaurant {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter charge:");
		int charge = scan.nextInt();

		double tax = charge * 0.0675;
		double tip = (charge + tax) * 0.20;
		double total = charge + tax + tip;

		System.out.println("Charge: " + charge + ", tax: " + tax + ", tip: " + tip + ", total bill: " + total);

	}

}
