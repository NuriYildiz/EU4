package Day14_Methods_Part2;

public class Lab4_DeerPlay {

	public static void main(String[] args) {

		deerPlay(95, true);

	}

	public static void deerPlay(int temp, boolean isSummer) {
		if (isSummer) {
			if (temp > 60 && temp < 90) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		} else {
			if (temp > 60 && temp < 100) {
				System.out.println("true");
			} else
				System.out.println("false");

		}
	}

}
