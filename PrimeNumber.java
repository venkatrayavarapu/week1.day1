package week1.day.assignements;

/*
 * Goal: To find whether a number is a Prime number or not
 * 
 * input: 13 output: 13 is a Prime Number
 * 
 * Shortcuts: 
 * 1) Print : type: syso, followed by: ctrl + space + enter 
 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter 
 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
 * 
 * What are my learnings from this code? 1) 2) 3)
 * 
 */
public class PrimeNumber {

	public static void main(String[] args) {
		int counter = 0;
		int number = 13;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				counter++;
			}
		}
		if (counter == 2) {
			System.out.println("Given number is a Prime Number : " + number);
		}
	}

}
