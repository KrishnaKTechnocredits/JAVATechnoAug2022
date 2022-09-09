/*Write a method to return sum of all prime numbers from given array.
input : {11,14,17,22,44}
output : 28
Hint : (11+17 = 28)*/

package manjiri.arrayEx;

public class ArrayEx2 {
	int getSumOfPrimeNumFromArray(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			boolean isPrime = checkPrimeNum(arr[index]);
			if (isPrime) {
				sum = sum + arr[index];
			}
		}
		return sum;
	}

	boolean checkPrimeNum(int num) {
		int i = 2;
		boolean flag = true;
		while (i < Math.sqrt(num)) {
			if(num % i == 0) {
				flag = false;
				break;
			}
			i++;
		}
		if(flag) {
			return true;
		}	
		return false;
	}
	
	public static void main(String[] args) {
		int intArr[] = {11,14,17,22,44};
		System.out.println(new ArrayEx2().getSumOfPrimeNumFromArray(intArr));
	}
}
