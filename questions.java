package assignment3;

public class questions {

	public static void main(String[] args) {
		
		//question1
		
		int gal = 15;
		double liter= gal*3.7854;
		
		System.out.println(gal + " gallon is " + liter + " liter");
				
		//question2
		
		String name = "Nuri";
		int yearofbirth = 1980;
		int age= 2020-yearofbirth;
		System.out.println("Hello, " + name +  "! Based on your input, your age is " + age + ":)" );
		
		//question3
		
		double width = 4.5;
		double height = 7.9;
		double area = width * height;
		
		System.out.println(area);
		
		//question4	
		
		int num1= 10, num2 = 20;
		int num3 ;
		
		System.out.println("n1=" + num1);
		System.out.println("n2=" + num2);
		
		num3 = num1;
		num1 = num2;
		num2 = num3;
				
		System.out.println("-------------");
				
		System.out.println("n1=" + num1);
		System.out.println("n2=" + num2);		
		
		//question5
		
		int inputSecond = 4873;
		int hour,minute,second;
		int res1 ;
		
		second= inputSecond%60;
		res1 = inputSecond%3600;		
		minute = res1/60;
		hour = (inputSecond - second)/3600;		
		
		System.out.println("inputSecond is " + inputSecond);
		System.out.println( hour + " hours, " + minute + " minutes, and " + second + " seconds");
		
		//question6
		
		int mgPerDrink = 500;
		int drinks ;
		
		drinks =10000/mgPerDrink;
		
		System.out.println("Number of miligrams in drink: " + mgPerDrink);
		System.out.println("it would take about " + drinks + " drinks for a leathal overdose");
		
		//question7
		
		int price = 30;
		int quarters, dimes, nickels,change;
		int a,b,c ;		
		
		change = 100-price;
		
		quarters = change/25;
		a = change%25;
		
		dimes = a/10;
		b = a%10;
		nickels = b/5;
				
		System.out.println("Price in cent : " + price);
		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels");
		
		
	}

}
