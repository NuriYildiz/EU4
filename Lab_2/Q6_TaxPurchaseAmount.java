package Lab_2;

import java.util.Scanner;

public class Q6_TaxPurchaseAmount {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		System.out.println("Enter amount of purchase:");
		int amount = scan.nextInt();

		double taxState = amount * 0.04;
		double taxCounty = amount * 0.02;
		double total = amount + taxState + taxCounty;

		System.out.println("Amount of the purchase: " + amount + ", the state sales tax: " + taxState + ", the county sales tax: " + 
		taxCounty + ", the total of the sale: " + total);

	}

}
