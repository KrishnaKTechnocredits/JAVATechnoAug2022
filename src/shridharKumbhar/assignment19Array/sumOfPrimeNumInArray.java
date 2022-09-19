//Sum of prime number in given array {11,14,17,22,44}

package shridharKumbhar.assignment19Array;

public class sumOfPrimeNumInArray {

	boolean isPrime(int num) {
		
		for (int index = 2; num / 2 >= index; index++) {
			if (num % index == 0) {
				return false;
				//break;
			}
		}
		return true;
	}
	
	int getSumOfPrime(int[] array) {
		
		int sumOfPrime = 0;
		
		for(int index1 =0; index1 < array.length ; index1++) {
			if(isPrime(array[index1])) {
				sumOfPrime = sumOfPrime + array[index1];
			}
		}return sumOfPrime;
	}
	
	
	public static void main(String[] args) {
		int[] input = {11,14,17,22,44};
		System.out.println("Sum of all prime num in given array " +new sumOfPrimeNumInArray().getSumOfPrime(input));
	}
}
