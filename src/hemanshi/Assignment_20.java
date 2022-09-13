/*1) Write a method to return sum of all not prime numbers from given array.
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
input : Hemanshi
output : 3
6) Write a method to count vowels of each name in given array.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3
		 
7) Write a method to return name having maximum length.
input : {"Ashish","Aditty","Manjiri","Ankita","Credits"}
output : Credits
 */

package hemanshi;

import java.util.Arrays;

public class Assignment_20 {
//program-1	
	boolean isPrime(int num1) {
		for(int index=2;index<=num1/2;index++){
			if(num1%index==0){
				return false;
			}	
		}
		return true;
}
	int getSumOfNonPrime(int[] inputArray) {
	int sum=0;

	for(int index=0;index<inputArray.length;index++) {
		if(!isPrime(inputArray[index])) 
		sum = sum + inputArray[index];
	}
	return sum;
}
	
	
//program-2
int DivisibleBy5And7(int[] inputArray) {
	int sum=0;

	for(int index=0;index<inputArray.length;index++) {
		if(!isPrime(inputArray[index]) && inputArray[index]%5==0 && inputArray[index]%7==0) 
		sum = sum + inputArray[index];
	}
	return sum;
}

//program-3

int EvenArrayElements(int[] inputArray) {
	int sum=0;
	for(int index=0;index<inputArray.length;index++) {
		if(inputArray[index]%2==0) 
			sum = sum + inputArray[index];
	}
	return sum;
}

//program-4

int DifferenceOfEvenAndOdd(int[] inputArray) {
	int eSum=0, oSum=0;

	for(int index=0;index<inputArray.length;index++) {
		if(inputArray[index]%2==0) 
			eSum = eSum + inputArray[index];
		else
			oSum = oSum + inputArray[index];
	}
	return Math.abs(eSum-oSum);
}


//program-5
int VowelCount(String inputString) {
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

//program-6
int[] getVowelCountFromArrayElement(String[] inputArray) {
	int[] outputArray = new int[inputArray.length];

	for(int index=0;index<inputArray.length;index++) {
		outputArray[index] = VowelCount(inputArray[index]);
	}
	return outputArray;
}


//program-7
String MaximumLength(String[] inputArray) {
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
	Assignment_20 assignment20 = new Assignment_20();

	//program-1
	int[] input = {11,13,17,22,44};
	System.out.println("Sum of non prime numbers from array!");
	System.out.println("Input array: "+Arrays.toString(input));
	System.out.println("Output: "+assignment20.getSumOfNonPrime(input));

	//program-2
	int[] input1 = {11,35,17,105,44};
	System.out.println("\nSum of non prime numbers and divisible 5 and divisible by 7 from array!");
	System.out.println("Input array: "+Arrays.toString(input1));
	System.out.println("Output: "+assignment20.DivisibleBy5And7(input1));

	//program-3
	int[] input2 = {10,11,15,6};
	System.out.println("\nSum of even numbers from array!");
	System.out.println("Input array: "+Arrays.toString(input2));
	System.out.println("Output: "+assignment20.EvenArrayElements(input2));

	//program-4
	System.out.println("\nDifference of sum of even numbers and odd numbers from array!");
	System.out.println("Input array: "+Arrays.toString(input2));
	System.out.println("Output: "+assignment20.DifferenceOfEvenAndOdd(input2));

	//program-5
	System.out.println("\nReturn count of vowels in a given String!");
	String inputString = "Hemanshi";
	System.out.println("Input String: "+inputString);
	System.out.println("Output: "+assignment20.VowelCount(inputString));
	
    //program-6
	System.out.println("\nWrite a method to count vowels of each name in given array!");
	String[] input3 = {"Hemu","Himsss","Hemanshi","Heeya"};
	System.out.println("Input array: "+Arrays.toString(input3)+"\nOutput: ");
	int[] output = assignment20.getVowelCountFromArrayElement(input3);
	for(int index=0;index<input3.length;index++) {
		System.out.println(input3[index]+" -> "+output[index]);
	}

	//program-7
	System.out.println("\nWrite a method to return name having maximum length!");
	String[] input4 = {"Hemu","Himsss","Hemanshi","Harshil","Heeya"};
	System.out.println("Input array: "+Arrays.toString(input4)+"\nOutput: "+assignment20.MaximumLength(input4));

}
	
}
	
	
