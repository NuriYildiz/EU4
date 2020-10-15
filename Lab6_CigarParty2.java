package Day14_Methods_Part2;

public class Lab6_CigarParty2 {

	public static void main(String[] args) {

		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);

	}

	public static void cigarParty(int Cigar, boolean Wekeend) {

		if (Wekeend) {
			if (Cigar >= 40) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			if (Cigar >= 40 && Cigar <= 60) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
	}
}
