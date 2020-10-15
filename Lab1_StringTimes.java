package Day14_Methods_Part2;

public class Lab1_StringTimes {

	public static void main(String[] args) {

		stringTimes("Hi", 3);

	}

	public static void stringTimes(String s, int j) {
		for (int i = 1; i <= j; i++) {

			String a = "";

			a = s + a;
			System.out.print(a);
		}

	}

}
