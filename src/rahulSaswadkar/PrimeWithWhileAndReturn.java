/*
 * Assignment - 15 : 5th Sep'2022

1. We need to do sum of first 5 prime number, using return keyword
output: (2 + 3 + 5 + 7 + 11) = 28
 */
package rahulSaswadkar;

public class PrimeWithWhileAndReturn {

	public static void main(String[] args) {
		//System.out.println(new PrimeWithWhileAndReturn().isPrimeNumber(17));
		System.out.print(new PrimeWithWhileAndReturn().getPrimeNumbers(5));
	}
	
	public boolean isPrimeNumber(int num) {
		boolean isPrimeNum = true;
		if(num > 0) {
			for(int startIndex = 2 ; startIndex <= num/2 ; startIndex++) {
			if(num % startIndex == 0) {
				isPrimeNum = false;
				break;
			}
		}
		return isPrimeNum;
		}else
			return false;
	}
	
	int getPrimeNumbers(int num) {
		int sum = 0;
		int count = 0;
		int startIndex = 2;
		while(count < num) {
			boolean isPrimeNum = isPrimeNumber(startIndex);
			if(isPrimeNum) {
				count += 1;
				sum = sum + startIndex;
				
			}
			startIndex++;
		}
		System.out.print("Sum of first " + num + " Prime Numbers is : ");
		return sum;
	}
}