/*Test 4 - 11th Sep'2022

Expected time : 15 mins
Program 1 :
Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0*/
package adittyThakare.arrayoperations;

import java.util.Arrays;

public class Test4_Program1 {
	
	int getDigitSumFromString(String inputString) {
		int digitSum=0;
		
		for(int index=0;index<inputString.length();index++) {
			int ch = inputString.charAt(index);
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				digitSum = digitSum + num;
			}
		}
		return digitSum;
	}
	
	int[] getAllDigitSumFromArrayElements(String[] inputArray) {
		int[] outputArray = new int[inputArray.length];
		
		for(int index=0;index<inputArray.length;index++) {
			outputArray[index] = getDigitSumFromString(inputArray[index]);
		}
		return outputArray;
	}
	
	void displayDigitSumArrayElements(String[] inputArray) {
		int[] resultArray = getAllDigitSumFromArrayElements(inputArray);
		
		for(int index=0;index<resultArray.length;index++) {
			System.out.println(inputArray[index]+" -> "+resultArray[index]);
		}
	}
	
	public static void main(String[] args) {
		Test4_Program1 test = new Test4_Program1();
		String[] input = {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		
		System.out.println("Program to  return sum of all the digits present in each elements from given array!\n");
		
		System.out.println("Input array: "+Arrays.toString(input)+"\n");
		test.displayDigitSumArrayElements(input);
	}
}
