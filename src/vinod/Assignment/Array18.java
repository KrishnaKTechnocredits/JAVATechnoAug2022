package vinod.Assignment;

public class Array18 {
	int getSumOfAllNumber(int[] arr) {
		int sum  = 0;
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		
		return sum;
	}
	
	boolean isPrimeNumber(int num) {
		boolean isPrime = true;
		for (int i=2; i<=num/2; i++) {
			if (num % i == 0) {
				isPrime = false;
			}else
				isPrime = true;
		}
		return isPrime;
	}
	
	int getSumOfPrimeNumber(int[] arr) {
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			if (isPrimeNumber(arr[i])) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}
	
	int getMinNumberFromArray(int[] arr) {
		int MinNumber = arr[0];
		for(int i = 0; i < arr.length; i++) {
			
			if (MinNumber >= arr[i]) {
				MinNumber = arr[i];
			}		
		}
		return MinNumber;
	}
	
	int getMaxNumberFromArray(int[] arr) {
		int MaxNumber = arr[0];
		for(int i = 0; i < arr.length; i++) {
			
			if (MaxNumber < arr[i]) {
				MaxNumber = arr[i];
			}		
		}
		return MaxNumber;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Array18 array18 = new Array18();
		
		int[] num1 = {10,11,15};
		System.out.println("Sum of Array given aray is: "+array18.getSumOfAllNumber(num1));
		
		int[] num2 = {11,14,17,22,44};
		System.out.println("\nSUm of prime number from given array is: "+array18.getSumOfPrimeNumber(num2));
		
		int[] num3 = {11, 4,55,23,43};
		System.out.println("\nMin number from given array is: "+array18.getMinNumberFromArray(num3));
		
		int[] num4 = {11, 4,55,23,43};
		System.out.println("\nMax number from given array is: "+array18.getMaxNumberFromArray(num4));
	}
}
