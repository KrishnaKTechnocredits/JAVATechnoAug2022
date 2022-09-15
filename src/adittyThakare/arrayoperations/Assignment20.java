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
package adittyThakare.arrayoperations;

import java.util.Arrays;

public class Assignment20 {
	
	 boolean isPrime(int number) {
			for(int index=2;index<=number/2;index++){
				if(number%index==0){
					return false;
				}	
			}
			return true;
	}
	 
	int getSumOfNonPrimeArrayElements(int[] inputArray) {
		int sum=0;
		
		for(int index=0;index<inputArray.length;index++) {
			if(!isPrime(inputArray[index])) 
			sum = sum + inputArray[index];
		}
		return sum;
	}
	
	int getSumOfNonPrimeAndDivisibleBy5And7(int[] inputArray) {
		int sum=0;
		
		for(int index=0;index<inputArray.length;index++) {
			if(!isPrime(inputArray[index]) && inputArray[index]%5==0 && inputArray[index]%7==0) 
			sum = sum + inputArray[index];
		}
		return sum;
	}
	
	int getDifferenceOfSumOfEvenAndOddElements(int[] inputArray) {
		int evenSum=0, oddSum=0;
		
		for(int index=0;index<inputArray.length;index++) {
			if(inputArray[index]%2==0) 
				evenSum = evenSum + inputArray[index];
			else
				oddSum = oddSum + inputArray[index];
		}
		return Math.abs(evenSum-oddSum);
	}
	
	int getSumOfEvenArrayElements(int[] inputArray) {
		int sum=0;
		
		for(int index=0;index<inputArray.length;index++) {
			if(inputArray[index]%2==0) 
				sum = sum + inputArray[index];
		}
		return sum;
	}
	
	int getVowelCountFromString(String inputString) {
		int vowelCount=0;
		inputString = inputString.toLowerCase();
		
		for(int index=0;index<inputString.length();index++) {
			char ch = inputString.charAt(index);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowelCount++;
			}
		}
		return vowelCount;
	}
	
	int[] getVowelCountFromArrayElement(String[] inputArray) {
		int[] outputArray = new int[inputArray.length];
		
		for(int index=0;index<inputArray.length;index++) {
			outputArray[index] = getVowelCountFromString(inputArray[index]);
		}
		return outputArray;
	}
	
	String getMaximumLengthArrayElement(String[] inputArray) {
		int maxLength = inputArray[0].length();
		int maxIndex=0;
		
		for(int index=1;index<inputArray.length;index++) {
			if(maxLength<inputArray[index].length()) {
				maxLength = inputArray[index].length();
				maxIndex=index;
			}
		}
		return inputArray[maxIndex];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment20 assignment20 = new Assignment20();
		
		int[] input = {11,13,17,22,44};
		System.out.println("Sum of non prime numbers from array!");
		System.out.println("Input array: "+Arrays.toString(input));
		System.out.println("Output: "+assignment20.getSumOfNonPrimeArrayElements(input));
		
		int[] input1 = {11,35,17,105,44};
		System.out.println("\nSum of non prime numbers and divisible 5 and divisible by 7 from array!");
		System.out.println("Input array: "+Arrays.toString(input1));
		System.out.println("Output: "+assignment20.getSumOfNonPrimeAndDivisibleBy5And7(input1));
		
		int[] input2 = {10,11,15,6};
		System.out.println("\nSum of even numbers from array!");
		System.out.println("Input array: "+Arrays.toString(input2));
		System.out.println("Output: "+assignment20.getSumOfEvenArrayElements(input2));
		
		System.out.println("\nDifference of sum of even numbers and odd numbers from array!");
		System.out.println("Input array: "+Arrays.toString(input2));
		System.out.println("Output: "+assignment20.getDifferenceOfSumOfEvenAndOddElements(input2));
		
		System.out.println("\nReturn count of vowels in a given String!");
		String inputString = "maulik";
		System.out.println("Input String: "+inputString);
		System.out.println("Output: "+assignment20.getVowelCountFromString(inputString));
		
		System.out.println("\nWrite a method to count vowels of each name in given array!");
		String[] input3 = {"Ashish","Aditty","Manjiri","Ankita"};
		System.out.println("Input array: "+Arrays.toString(input3)+"\nOutput: ");
		int[] output = assignment20.getVowelCountFromArrayElement(input3);
		for(int index=0;index<input3.length;index++) {
			System.out.println(input3[index]+" -> "+output[index]);
		}
		
		System.out.println("\nWrite a method to return name having maximum length!");
		String[] input4 = {"Ashish","Aditty","Manjiri","Ankita","Credits"};
		System.out.println("Input array: "+Arrays.toString(input4)+"\nOutput: "+assignment20.getMaximumLengthArrayElement(input4));
		
	}
}
