/*Java Program To Print Result Of  1^2 + 2^2 + 3^2 + 4^2 + 5^2  till number 10*/

package manjiri.assignment45;

public class SumOfSquareOfNumbers {
	
	void getSumOfSquaresOfNumbers(int n) {
		int sum = 0;
		for(int index = 0; index <= 10;index++) {
			sum += index*index;
		}
		System.out.println("Sum of Sqaure of Numbers is: " + sum);
	}
	
	public static void main(String[] args) {
		new SumOfSquareOfNumbers().getSumOfSquaresOfNumbers(10);
	}
}
