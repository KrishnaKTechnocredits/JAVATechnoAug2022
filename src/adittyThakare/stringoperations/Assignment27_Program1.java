/*Assignment-27 : 23rd Sep'2022
 
Program - 1. Write a program to print unique character of each name in given string array.
 
Input: String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
 Output: 
  Name is Maulik :
  M
  a
  u
  l
  i
  k
  ----------------------
  Name is Kanani : 
  K
  i*/

package adittyThakare.stringoperations;

import java.util.Arrays;

public class Assignment27_Program1 {

	// Method to find and print unique character from each word of array
	void printUniqueCharFromWord(String[] arr) {

		for (int index = 0; index < arr.length; index++) { // Loop to process array till its length
			System.out.println("\nWord: " + arr[index]);
			for (int i = 0; i < arr[index].length(); i++) { // Loop to process each word
				char ch = arr[index].charAt(i); // Get word character at position 'i'
				if (arr[index].indexOf(ch) == arr[index].lastIndexOf(ch)) { // Check if word character's first and last
																			// index is same, if yes then its an unique
																			// character
					System.out.println(arr[index].charAt(i)); // Print unique character
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment27_Program1 assignment27_Program1 = new Assignment27_Program1();
		String[] input = { "Maulik", "Kanani", "Mahesh", "Aditty" };
		
		System.out.println("Program to print unique character of each name in given string array.");
		System.out.println("Input array: "+Arrays.toString(input));
		assignment27_Program1.printUniqueCharFromWord(input);
	}

}
