/*Test 4 - 11th Sep'2022

Expected time : 15 mins --Actual - 19mins
Program 1 :
Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0

Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins] -Actual 18.38-18.50 - 12mins

input : {3,7,5}
output : 2

input : {3,5,11,9,10,13}
output : 4*/

package pranjaliV.Test2;

import java.util.Arrays;

public class Test4Pranjali {
	
	int getSumDigits(String input) {
		int sum=0;
		int digit=0;
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				digit = Character.getNumericValue(ch);
				sum = sum+digit;
			}
		}
		return sum;
	}
	
	int[] getSumOfDigitOfEachElement(String[] input) {
		int[] sum = new int[input.length]; 
		for(int index=0; index<input.length; index++) {
			sum[index]=getSumDigits(input[index]);
		}
		return sum;
	}
	
	int getCountVisibleTrees(int[] input) {
		int count = 0;
		int max = input[0];
		for(int index=0; index<input.length; index++) {
			if(max<=input[index]) {
				max=input[index];
				count++;
			}
		}
		return count;
	}
	
	void printInfo(String[] input) {
		System.out.println("Sum of all the digits present in each elements from given array are : ");
		int[] output = getSumOfDigitOfEachElement(input);
		for(int index=0; index<input.length; index++) {
			System.out.println(input[index]+" -> "+output[index]);
		}
	}
	
	void printInfo2(int[] input) {
		System.out.println("Count of visible trees = "+getCountVisibleTrees(input));
	}

	public static void main(String[] args) {
		Test4Pranjali test4 = new Test4Pranjali();
		String[] input = {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		System.out.println("Input : "+Arrays.toString(input));
		test4.printInfo(input);
		int [] input2 = {3,7,5} ;
		int [] input3 = {3,5,11,9,10,13};
		System.out.println("");
		System.out.println("Input : "+Arrays.toString(input2));
		test4.printInfo2(input2);
		System.out.println("");
		System.out.println("Input : "+Arrays.toString(input3));
		test4.printInfo2(input3);
	}

}
