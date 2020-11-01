package Lab_2;

import java.util.Scanner;

public class Q1_LargestAndSmallest {

	public static void main(String[] args) {

		// Question-1

		// Write a program with a loop that lets the user enter a series of integer
		// numbers.
		// After all the numbers have been entered, the program should display the
		// largest and smallest numbers entered.

		int biggest = 0;
		int smallest = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your first number:");
		int num1 = scan.nextInt();

		System.out.print("Enter your next number:");
		int numNext = scan.nextInt();

		if (num1 > numNext) {
			biggest = num1;
			smallest = numNext;
		} else if (numNext > num1) {
			biggest = numNext;
			smallest = num1;
		}

		System.out.print("Do you want to enter another number: 0-No, 1-Yes");
		byte go = scan.nextByte();

		while (go == 1) {
			System.out.print("Enter your next number:");
			numNext = scan.nextInt();
			if (smallest > numNext) {
				smallest = numNext;
			} else if (numNext > biggest) {
				biggest = numNext;
			}
			System.out.print("Do you want to enter another number: 0-No, 1-Yes");
			go = scan.nextByte();
		}

		if (go != 0 && go != 1) {
			System.out.println("Invalid entry");
		}

		System.out.println("Smallest number is:" + smallest);
		System.out.println("Largest number is:" + biggest);

	}

}
