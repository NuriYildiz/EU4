package Day14_Methods_Part2;

public class Lab2_Love6 {

	public static void main(String[] args) {
		 
		love6(24,18);
		
	}

public static void love6(int num1, int num2) {
	if ( num1 ==6  || num2 == 6|| num1+num2==6 || num1-num2==6 || num2-num1 ==6) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
}