package week1.day.assignements;

/*
 * Goal: Find the Factorial of a given number
 * 
 * input: 5
 * output: 5*4*3*2*1 = 120
 */
public class FindingFactorial {

	public static void main(String[] args) {
		int number = 5;
		int factorial = 1;
		for (int i = number; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial: " + factorial);
	}
}
