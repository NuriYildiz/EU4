package Day14_Methods_Part2;

public class Lab3_SpecialEleven {

	public static void main(String[] args) {

		specialEleven(24);

	}

	public static void specialEleven(int i) {
		if (i % 11 == 0 || i % 11 == 1) {
			System.out.println("true");
		} else
			System.out.println("false");
	}

}
