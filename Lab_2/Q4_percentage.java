package Lab_2;

import java.util.Scanner;

public class Q4_percentage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of male ");
		int male = scan.nextInt();

		System.out.println("Enter number of female ");
		int female = scan.nextInt();

		int permale = male * 100 / (male + female);
		int perfemale = female * 100 / (male + female);

		System.out.println(perfemale + "%");
		System.out.println(permale + "%");

	}

}
