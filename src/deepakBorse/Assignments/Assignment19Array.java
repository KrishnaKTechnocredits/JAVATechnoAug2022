/*
 * Assignment - 19 : 9th Sep'2022

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
package deepakBorse.Assignments;

import java.util.Arrays;

public class Assignment19Array {

	void sumofarray(int[] arry) {
		int sum = 0;
		// System.out.println("Size of the Array :" + (arry.length));
		for (int i = 0; i < arry.length; i++) {
			sum = sum + arry[i];

		}
		System.out.println("Sum of Array-" + Arrays.toString(arry) + " :" + sum);

	}

	void getsumofPrime(int[] arry) {
		int sumprime = 0;

		for (int i = 0; i < arry.length; i++) {
			boolean isprime = true;
			for (int j = 2; j <= Math.sqrt(arry[i]); j++) {
				if (arry[i] % j == 0) {
					isprime = false;
					break;
				}
			}

			if (isprime) {
				sumprime = sumprime + arry[i];
			}

		}
		System.out.println("Sum of prime number " + Arrays.toString(arry) + " from array :" + sumprime);
	}

	void maxArray(int[] arry) {
		int max = arry[0];
		// System.out.println("Size of the Array :" + (arry.length));
		for (int i = 0; i < arry.length; i++) {
			if (max < arry[i]) {
				max = arry[i];
			}

		}
		System.out.println("Max no from Array- " + Arrays.toString(arry) + ": " + max);
	}

	void minArray(int[] arry) {
		int min = arry[0];
		// System.out.println("Size of the Array :" + (arry.length));
		for (int i = 0; i < arry.length; i++) {
			if (min > arry[i]) {
				min = arry[i];
			}

		}
		System.out.println("Min no from Array- " + Arrays.toString(arry) + ": " + min);
	}

	void getMiddleChar(String[] arry) {

		for(int i=0;i<arry.length;i++){
			int index1 = 0;
			int len = arry[i].length();// when this is used
			if (len % 2 == 0) {
				index1 = len / 2 - 1;
			} 
			else {
				index1 = len / 2;
			}
			char ch=arry[i].charAt(index1);
			System.out.println(arry[i] + "--->" +ch);
		 }
	}

	public static void main(String[] args) {
		Assignment19Array Assignment19Array = new Assignment19Array();

		int[] array = { 10, 20, 28, 5 };
		Assignment19Array.sumofarray(array);
		Assignment19Array.maxArray(array);
		Assignment19Array.minArray(array);
		int[] arr = { 11, 14, 17, 22, 44 };
		Assignment19Array.getsumofPrime(arr);
		String[] midarr = {"Ashish","Aditty","Manjiri","Ankita"};
		Assignment19Array.getMiddleChar(midarr);

	}

}
