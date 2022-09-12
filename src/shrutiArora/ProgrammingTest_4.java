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
         Rahul -> 0

Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

input : {3,7,5}
output : 2

input : {3,5,11,9,10,13}
output : 4*/
package shrutiArora;

import java.util.Arrays;

public class ProgrammingTest_4 {
	int[] getSumOfDigitsInArrayElement(String[] input) {
		int[] digitSum = new int[input.length];
		for(int index = 0 ; index< input.length;index++) {
			digitSum[index] = getSumOfDigits(input[index]);
		}
		System.out.println(" input: " + Arrays.toString(input));
		return digitSum;
	}
	 static private int getSumOfDigits(String str) {
		int sum = 0;
		for(int index = 0; index<str.length() ; index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	 int getCountOfVisibleTrees(int[]input1) {
		 int maxHeight = 0;
		 int count = 0;
		 for(int index = 0; index<input1.length;index++) {
			 if(maxHeight<input1[index]) {
				 maxHeight = input1[index];
				 count++;
			 }
		 }
		  return count ;
	 }
	 public static void main(String[] args) {
		 ProgrammingTest_4 programmingTest_4 = new ProgrammingTest_4();
		 String[] input =  {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		 int[] digitSum = programmingTest_4.getSumOfDigitsInArrayElement(input);
		 System.out.println("***********************************Program-1*****************************************");
		 System.out.println(" Output: ");
		 for(int index = 0 ; index< input.length;index++) {
			 System.out.println(input[index] + " -> " +digitSum[index] );
		 }
		 System.out.println("***********************************Program-2*****************************************");
		 int[] input1 = {3,7,5};
		 System.out.println(" input: " + Arrays.toString(input1));
		 System.out.println(" Output " + programmingTest_4.getCountOfVisibleTrees(input1));
		 int[] input2 = {3,5,11,9,10,13};
		 System.out.println(" input: " + Arrays.toString(input2));
		 System.out.println(" Output " + programmingTest_4.getCountOfVisibleTrees(input2));
	 }
}