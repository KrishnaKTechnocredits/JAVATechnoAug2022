/*
	 * 
	Program 1 : (20 mins)
	Return middle character of max length String from given array.
	input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
	output : c

	Program 2: (40 mins)
	Write a method to return middle character of each elements from given array.
	input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
	output : Mahesh -> h
	              Avni -> v
	              Harshal -> s
	              Aditty -> i
	              Rahul -> h
	 */

package akankshaVyas.Test;

import java.util.Arrays;

public class MaxStringLengthName {

	String getMaxLengthString(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[0].length() <= arr[index].length()) {
				arr[0] = arr[index];
			}
		}
		return arr[0];
	}

	char getMiddleCharacterOfString(String str) {

		int index = 0;
		if (str.length() % 2 == 0) {
			index = (str.length() / 2 - 1);
		} else {
			index = (str.length() / 2);
		}
		char ch = (str.charAt(index));
		return ch;
	}

	char[] getMiddleCharacterOfName(String[] arr) {
		char[] mid = new char[arr.length];
		for (int index = 0; index < arr.length; index++) {
			mid[index] = getMiddleCharacterOfString(arr[index]);

		}
		return mid;

	}

	public static void main(String[] args) {

		String[] input1 = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		String ans = new MaxStringLengthName().getMaxLengthString(input1);
		System.out.println(new MaxStringLengthName().getMiddleCharacterOfString(ans)+ "\n");

		String[] input = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };

		for (int index = 0; index < input.length; index++) {
			char[] mid = new char[input.length];
			mid[index] = new MaxStringLengthName().getMiddleCharacterOfString(input[index]);
			System.out.println(input[index] + "-> " + mid[index]);

		}
		System.out.println("\n"+ Arrays.toString(input) + " in given array mid char is "
				+ Arrays.toString(new MaxStringLengthName().getMiddleCharacterOfName(input)));

	}

}
