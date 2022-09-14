/*Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0
     */

package smitaVetal;

import java.util.Arrays;

public class ArraySumDigit {
	
	int getSumOfDigit(String name) {
		int count = 0;
		for(int index=0;index<name.length();index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				count = count+temp;
			}
		}
		return count;
	}
	
	void displayResult(String[] input) {
		for(int index=0;index<input.length;index++) {
			int sum = getSumOfDigit(input[index]);
			System.out.println(input[index] + " -> " + sum);			
		}
	}
	
	public static void main(String[] args) {
		ArraySumDigit array = new ArraySumDigit();
		String[] input = {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		System.out.println("Input array is " + Arrays.toString(input));
		array.displayResult(input);
	}

}
