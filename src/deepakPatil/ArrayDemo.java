/*Assignment - 19 : 9th Sep'2022

1) Write a method to return sum of all numbers in given array.
input : {10,11,15}
output : 36

2) Write a method to return sum of all prime numbers from given array.
input : {11,14,17,22,44}
output : 28
Hint : (11+17 = 28)

3) Write a method to return max number from array.
input : {11,4,55,23,43}
output : 55

4) Write a method to return min number from array.
input : {11,4,55,23,43}
output : 4

5) Write a method to print middle character of all array elements.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> h
         Aditty -> i
		 Manjiri -> j
		 Ankita -> k
*/
package deepakPatil;

public class ArrayDemo {

	static boolean primeFlag = true;

	int getSumOfNumbersInArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	boolean isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			return true;
		else
			return false;
	}

	int getSumOfPrimeNumbers(int[] arr) {
		int primeSum = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = isPrime(arr[i]);
			if (flag)
				primeSum = primeSum + arr[i];
		}
		return primeSum;
	}

	int getMaxNumber(int[] arr) {

		int maxNum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxNum)
				maxNum = arr[i];
		}
		return maxNum;
	}

	int getMinNumber(int[] arr) {
		int minNum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minNum)
				minNum = arr[i];
		}
		return minNum;
	}

	char getMiddleChar(String name) {
		char ch;
		if (name.length() % 2 == 0)
			ch = name.charAt(name.length() / 2 - 1);
		else
			ch = name.charAt(name.length() / 2);

		return ch;

	}

	public static void main(String[] args) {
		ArrayDemo arrayDemo = new ArrayDemo();

		int[] nums1 = { 10, 11, 15 };
		System.out.println("\nSum of all numbers from given array is "+ arrayDemo.getSumOfNumbersInArray(nums1));

		int[] nums2 = { 11, 14, 17, 22, 44 };
		System.out.println("\nSum of all prime numbers from given array is "+arrayDemo.getSumOfPrimeNumbers(nums2));

		int[] nums3 = { 11, 4, 55, 23, 43 };
		System.out.println("\nMaximum number from given array is "+arrayDemo.getMaxNumber(nums3));

		int[] nums4 = { 11, 4, 55, 23, 43 };
		System.out.println("\nMinimum number from given array is "+arrayDemo.getMinNumber(nums4));

		String[] names = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		System.out.println("\n**Middle character**");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " -> " + arrayDemo.getMiddleChar(names[i]));
		}
	}

}
