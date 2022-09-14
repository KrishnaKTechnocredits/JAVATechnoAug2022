// Assignment - 20 : 10th Sep'2022

package komalShrivastava;

import java.util.Arrays;

public class ArrayFunctions {

	// method to return sum of all not prime numbers from given array
	
	int getSumOfNonPrimeNum(int[] input) {
		int sum = 0;
		for(int index=0; index<input.length; index++) {
			boolean primeFlag = true;
			for(int i=2; i<input[index]; i++) {
				if(input[index]%2==0) {
					primeFlag = false;
					break;
				}
			}
			if(primeFlag == false)
				sum = sum + input[index];
		}
		return sum;
	}
	
	//method to return sum of all non prime numbers divisible by 5 and 7
	
	int getSumofNonPrimeNumDivisibleBy5and7(int[] input) {
		int sum = 0;
		for(int index=0; index<input.length; index++) {
			boolean primeFlag = true;
			for(int i=0; i<input[index]; i++) {
				if(input[index]%5 == 0 && input[index]%7 == 0) {
					primeFlag = false;
					break;
				}
			}
			if(primeFlag == false)
				sum = sum + input[index];
		}
		return sum;
	}
	
	//method to return sum of all even numbers in given array
	
	int getSumOfEvenNumers(int []input) {
		int evenSum = 0;
		for(int index=0; index<input.length; index++) {
			boolean evenFlag = false;
				if(input[index]%2 == 0) {
					evenFlag = true;
			}
			if(evenFlag)
				evenSum = evenSum + input[index];
		}
		return evenSum;
	}
	
	//method to return difference of sum of all even numbers and odd numbers in given array
	
	int getDiffOfEvenOddSum(int[] input) {
		int oddSum = 0;
		for(int index=0; index<input.length; index++) {
			boolean oddFlag = false;
				if(input[index]%2 != 0) {
					oddFlag = true;
			}
			if(oddFlag)
				oddSum = oddSum + input[index];
		}
		int evenSum = getSumOfEvenNumers(input);
		return (evenSum-oddSum);
	}
	
	//Return count of vowels in a given String
	
	int getCountOfVowels(String inputName) {
		String name = inputName.toLowerCase();
		int count = 0;
		for(int index=0; index<name.length(); index++) {
			if(name.charAt(index)== 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i' || name.charAt(index) == 'o' || name.charAt(index) == 'u' )
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		ArrayFunctions arrayFunctions = new ArrayFunctions();
		
		int[] numArray1 = {11,13,17,22,44};
		int sumNonPrimeNum = arrayFunctions.getSumOfNonPrimeNum(numArray1);
		System.out.println("Sum of non-Prime Numbers in " + Arrays.toString(numArray1) + " is : " + sumNonPrimeNum);
		System.out.println("----------------------------------------------------------------------------------");
		int[] numArray2 = {11,35,17,105,44};
		int sumNonPrimDivBy5and7 = arrayFunctions.getSumofNonPrimeNumDivisibleBy5and7(numArray2);
		System.out.println("Sum of non-Prime Numbers divisible by 5 and 7 in " + Arrays.toString(numArray2) + " is : " + sumNonPrimDivBy5and7);
		System.out.println("----------------------------------------------------------------------------------");
		int[] numArray3 = {10,11,15,6};
		int evenSumArray = arrayFunctions.getSumOfEvenNumers(numArray3);
		System.out.println("Sum of even numbers in " + Arrays.toString(numArray3) + " is : " + evenSumArray);
		System.out.println("----------------------------------------------------------------------------------");
		int diffOfEvenOddSum = arrayFunctions.getDiffOfEvenOddSum(numArray3);
		System.out.println("Difference of sum of all even numbers and odd numbers in " + Arrays.toString(numArray3) + " is : " + diffOfEvenOddSum);
		System.out.println("----------------------------------------------------------------------------------");
		String name = "Maulik";
		int countOfVowels = arrayFunctions.getCountOfVowels(name);
		System.out.println("Number of vowels in " + name + " is : " + countOfVowels);
		System.out.println("----------------------------------------------------------------------------------");
		
		// method to count vowels of each name in given array
		
		String[] inputArray = {"Ashish","Aditty","Manjiri","Ankita"};
		System.out.println("VowelCount in each string in " + Arrays.toString(inputArray));
		for(int index=0; index<inputArray.length; index++) {
			int vowelCount = arrayFunctions.getCountOfVowels(inputArray[index]);
			System.out.println(inputArray[index] + " --> " + vowelCount);
		}
	}

}
