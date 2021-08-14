package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator objCalc= new Calculator();

		// Addition
		int num1 = 80, num2 = 100, num3 = 120;
		int addition = objCalc.add(num1, num2, num3);
		System.out.println("Addition : " + addition);

		// Subtraction
		int subnum1 = 180, subnum2 = 100;
		int subtr = objCalc.sub(subnum1, subnum2);
		System.out.println("Subtraction : " + subtr);

		// Multiplication
		double mulnum1 = 80, mulnum2 = 50;
		double mult = objCalc.mul(mulnum1, mulnum2);
		System.out.println("Multiplication : " + mult);
		
		// Division
		float divnum1 = 88, divnum2 = 5;
		float divi = objCalc.div(divnum1, divnum2);
		System.out.println("Division : " + divi);
	}

}
