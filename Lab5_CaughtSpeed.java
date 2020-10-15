package Day14_Methods_Part2;

public class Lab5_CaughtSpeed {

	public static void main(String[] args) {

		caughtSpeeding(60, false);
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);
	}

	public static void caughtSpeeding(int speed, boolean birthday) {
		if (birthday) {
			speed = speed - 5;
			if (speed <= 60) {
				System.out.println("0");
			} else if (speed > 60 && speed <= 80) {
				System.out.println("1");
			} else if(speed >= 81){
				System.out.println("2");
			}
		} else {
			if (speed <= 60) {
				System.out.println("0");
			} else if (speed > 60 && speed <= 80) {
				System.out.println("1");
			} else if(speed >= 81){
				System.out.println("2");
			}

		}

	}

}
