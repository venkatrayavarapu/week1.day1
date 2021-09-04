package week1.day.assignements;
/*
 * Goal: To find Fibonacci Series for a given range
 * 
 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
 */

public class FibonacciSeries {

	public static void main(String[] args) {
		int maxNumber = 8;
		int preNum = 0;
		int nxtNum = 1;
		for (int i = 1; i <= maxNumber; ++i) {
			System.out.print(preNum + " ");
			int sum = preNum + nxtNum;
			preNum = nxtNum;
			nxtNum = sum;
		}
	}
}