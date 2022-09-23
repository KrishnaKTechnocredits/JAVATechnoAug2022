/*Program - 2.  Write a program to print 1st unique character of each name in given string array.
 
 String[] arr = {"Maulik", "KananiK", "akanksha"};
 
 Name is Maulik : M
 -------------------
 Name is KananiK : i
 -------------------
 Name is akanksha : n */
package adittyThakare.stringoperations;

import java.util.Arrays;

public class Assignment27_Program2 {

	void printFirstUniqueCharacterInWord(String[] input) {

		for (int index = 0; index < input.length; index++) { // Loop to process array till its length
			System.out.println("\nName " + input[index] + " :");
			for (int i = 0; i < input[index].length(); i++) { // Loop to process each word
				char ch = input[index].charAt(i); // Get word character at position 'i'
				if (input[index].indexOf(ch) == input[index].lastIndexOf(ch)) { // Check if word character's first and
																				// last index is same, if yes then its
																				// an unique character
					System.out.println(ch); // Print 1st unique character and then break;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment27_Program2 assignment27_Program2 = new Assignment27_Program2();
		String[] input = { "Maulik", "KananiK", "akanksha" };
		
		System.out.println("Program to print 1st unique character of each name in given string array.");
		System.out.println("\nInput array: " + Arrays.toString(input));
		assignment27_Program2.printFirstUniqueCharacterInWord(input);
	}

}
