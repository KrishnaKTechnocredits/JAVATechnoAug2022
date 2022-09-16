/*2) Write a method to return sum of all non prime numbers 
and should be divisible by 5 & 7 from given array.
input : {11,35,17,105,44}
output : 140
Hint : (35+105 = 28)
*/
package asthaSrivastava.arrayBasics;

public class SumOfNonPrimeAndDiv {

	int getSumOfNonPrime(int[] input) { //Program2
		int sum = 0;

		for (int index = 0; index < input.length; index++) {
			boolean flag = true;
			for (int i = 0; i < input[index]; i++) {
				if (input[index]%5 == 0 && input[index]%7 == 0) {
					flag = false;
					break;
				}
		
			}
				if (flag == false)
					sum = sum + input[index];
			
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfNonPrimeAndDiv div = new SumOfNonPrimeAndDiv();
		int[] num1 = { 11, 35, 17, 105, 44 };
		int result = div.getSumOfNonPrime(num1);
		System.out.println("Sum of Non Prime Number and also divisible by 5 and 7 is :" + result);

	}
}
