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
		 Ankita -> k*/
package nilamP;

public class ArrayOperations {
	int getSum() {
		int[] num = { 10, 11, 15 };
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}

	boolean CheckPrimeNumber(int num) {

		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;

				break;
			}

		}
		if (flag == true) {
			int count = 0;
			count++;

		}

		return flag;
	}

	int getSumofPrimeNum() {
		int[] num = { 11, 14, 17, 22, 44 };
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			boolean flag = CheckPrimeNumber(num[i]);
			if (flag) {
				sum += num[i];
			}
		}
		return sum;
	}

	int getMaxNum() {
		int[] arr = { 11, 4, 55, 23, 43 };
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	int getMinNum() {
		int[] arr = { 11, 4, 55, 23, 43 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	char getMiddlechar(String str) {

		int index = 0;
		int length = str.length();
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		char ch = str.charAt(index);
		return ch;
	}

	public static void main(String[] args) {
		ArrayOperations ao = new ArrayOperations();
		System.out.println("Sum of all number in an array is : " + ao.getSum());
		System.out.println("Sum of all prime numbers in an array is : " + ao.getSumofPrimeNum());
		System.out.println("Maximum num in an array is : " + ao.getMaxNum());
		System.out.println("Minimum num in an array is : " + ao.getMinNum());
		String[] arr1 = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		System.out.println("Middle char of " + arr1[0] + " is: " + ao.getMiddlechar(arr1[0]));
		System.out.println("Middle char of " + arr1[1] + " is: " + ao.getMiddlechar(arr1[1]));
		System.out.println("Middle char of " + arr1[2] + " is: " + ao.getMiddlechar(arr1[2]));
		System.out.println("Middle char of " + arr1[3] + " is: " + ao.getMiddlechar(arr1[3]));
	}
}
