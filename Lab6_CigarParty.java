package Day14_Methods_Part2;

public class Lab6_CigarParty {

	public static void main(String[] args) {

		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);

	}

	public static void cigarParty(int cigar, boolean isWeekend) {
		if (isWeekend) {
			if (cigar > 40) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			if (cigar > 40 && cigar < 60) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
	}

}
