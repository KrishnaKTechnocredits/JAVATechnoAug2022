/*1) Write a method to return sum of all numbers in given array.
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

package smitaVetal;

public class ArrayBasic {

	int getSum(int[] num) { // return sum of all numbers in given array.
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			sum = sum + num[index];
		}
		return sum;
	}

	boolean isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index < num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	int getSumOfPrimeNum(int[] arr2) {
		int sum = 0;
		for (int index = 0; index < arr2.length; index++) {
			if (isPrime(arr2[index])) {
				sum = sum + arr2[index];
			}
		}
		return sum;
	}

	int getMaxNum(int[] num) {
		int max = num[0];
		for (int index = 1; index < num.length; index++) {
			if (num[index] > max)
				max = num[index];
		}
		return max;
	}

	int getMinNum(int[] num) {
		int min = num[0];
		for (int index = 1;index<num.length; index++) {
			if(num[index]<min) {
				min=num[index];
			}
		}
		return min;
	}
	
	char getMiddleCharacter(String name) {
		int index = 0;
		if(name.length()%2 == 0) 
			index = name.length()/2 - 1;
		else
			index = name.length()/2;		
		return name.charAt(index);
		
	} 
	
	public static void main(String[] args) {
		ArrayBasic array = new ArrayBasic();
		int[] arr = { 10, 20, 30 };
		int sum = array.getSum(arr);
		System.out.println("Sum of all numbers in array is " + sum);
		int[] arr2 = { 7, 11, 20, 54, 19, 13 };
		int sumOfPrime = array.getSumOfPrimeNum(arr2);
		System.out.println("sum of all prime numbers from given array is " + sumOfPrime);
		int[] arr3 = { 0, 30, 9, 2, 5, 6, 4, 6, 11, 6 };
		int max = array.getMaxNum(arr3);
		System.out.println("Maximum numbers from the array is " +max);
		int[] arr4 = {30, 9, 2, 5, 6, 4, 6, 11, 6 };
		int min = array.getMinNum(arr4);
		System.out.println("Minimum number from the array is " +min);

		String[] name = {"Smita", "Ashish","Aditty","Manjiri","Ankita"};
		System.out.println("Middle Characters");
		for(int index = 0; index < name.length; index++) {
			char ch = array.getMiddleCharacter(name[index]);
			System.out.println(name[index] + " - " + ch);

		}
	}
}
