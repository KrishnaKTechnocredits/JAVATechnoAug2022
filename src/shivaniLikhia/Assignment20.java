/*Assignment - 20 : 10th Sep'2022

1) Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66)

2) Write a method to return sum of all non prime numbers 
and should be divisible by 5 & 7 from given array.
input : {11,35,17,105,44}
output : 140
Hint : (35+105 = 28)

3) Write a method to return sum of all even numbers in given array.
input : {10,11,15,6}
output : 16

4) Write a method to return difference of sum of all even numbers and odd numbers in given array.
input : {10,11,15,6}
output : 10
Hint : 16 - 26 = 10

5) Return count of vowels in a given String.
input : maulik
output : 3

6) Write a method to count vowels of each name in given array.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3
		 
7) Write a method to return name having maximum length.
input : {"Ashish","Aditty","Manjiri","Ankita","Credits"}
output : Credits*/

package shivaniLikhia;

public class Assignment20 {

	boolean isNumberPrime(int num) {
		boolean flag = false;
		for(int index=2;index<=num/2;index++) {
			if(num%index==0) {
				flag = true;
				break;
			}
		}
		if(flag==true) {
			return flag;
		}
		
		return flag;
	}
	
	int getSumOfNonPrimeNumbers(int[] arr) {
		int sum = 0;
		for(int index=0;index<arr.length;index++) {
			if(isNumberPrime(arr[index])) {
				sum = sum + arr[index];
			}
		}
		return sum;
	}
	
	int getSumOfNonPrimeAndDivisibleBy5And7(int[] arr2) {
		int sum = 0;
		for(int index=0;index<arr2.length;index++) {
			if(isNumberPrime(arr2[index])) {
				if(arr2[index]%5==0 && arr2[index]%7==0) {
					sum = sum + arr2[index];
				}
			}
		}
		return sum;
	}
	
	int getSumOfEvenNumbers(int[] arr2) {
		int sum = 0;
		for(int index=0;index<arr2.length;index++) {
			if(arr2[index]%2==0) {
				sum = sum + arr2[index];
			}
		}
		return sum;
	}
	
	int getDifferenceOfSumOfOddAndEvenNumbers(int[] arr) {
		int evenSum = 0;
		int oddSum = 0;
		int difference = 0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]%2==0) {
				evenSum = evenSum + arr[index];
			}
			else {
				oddSum = oddSum + arr[index];
			}
		}
		difference = oddSum - evenSum;
		return difference;
	}
	
	int getVowelCount(String str) {
		int count = 0;
		str = str.toLowerCase();
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
	
	int[] getVowelFromArray(String[] arr) {
		int[] output = new int[arr.length];
		for(int index=0;index<arr.length;index++) {
			output[index] = getVowelCount(arr[index]);
		}
		return output;
	}
	
	String getMaximumLengthWord(String[] arr) {
		int maxLength = arr[0].length();
		String maxLengthWord = arr[0];
		for(int index=1;index<arr.length;index++) {
			if(maxLength<arr[index].length()) {
				maxLengthWord = arr[index];
			}
		}
		return maxLengthWord;
	}
	
	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		int[] arr = {11,13,17,22,44};
		System.out.println("The sum of all non prime numbers from given array is : ");
		System.out.println(assignment20.getSumOfNonPrimeNumbers(arr));
		System.out.println("--------------------------------------------------------------------------------------------");
		int[] arr1 = {11,35,17,105,44};
		System.out.println("The sum of all non prime numbers and numbers divisible by 5 and 7 ais : ");
		System.out.println(assignment20.getSumOfNonPrimeAndDivisibleBy5And7(arr1));
		System.out.println("--------------------------------------------------------------------------------------------");
		int[] arr2 = {10,11,15,6};
		System.out.println("The sum of all the even numbers from the given array is :");
		System.out.println(assignment20.getSumOfEvenNumbers(arr2));
		System.out.println("--------------------------------------------------------------------------------------------");
		int[] arr3 = {10,11,15,6};
		System.out.println("The difference of sum all the even numbers and odd numbers from the given array is :");
		System.out.println(assignment20.getDifferenceOfSumOfOddAndEvenNumbers(arr3));
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("The number of vowels from the given array is :");
		System.out.println(assignment20.getVowelCount("Maulik"));
		System.out.println("--------------------------------------------------------------------------------------------");
		String[] arr5 = {"Ashish","Aditty","Manjiri","Ankita"};
		System.out.println("The vowels from each word from the given array is : ");
		int[] output = assignment20.getVowelFromArray(arr5);
		for(int index=0;index<arr5.length;index++) {
			System.out.println(arr5[index] + " --> " +output[index]);
		}
		System.out.println("--------------------------------------------------------------------------------------------");
		String[] arr6 = {"Ashish","Aditty","Manjiri","Ankita","Credits"};
		System.out.println("The maximum length Word from the given array is : ");
		System.out.println(assignment20.getMaximumLengthWord(arr6));
	}
}
