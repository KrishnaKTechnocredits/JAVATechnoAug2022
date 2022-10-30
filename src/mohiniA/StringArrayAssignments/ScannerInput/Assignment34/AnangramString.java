
 /* Program 1 : How to check if two given String is the anagram of each other (using scanner class)?
Input1: catc
Input2: actc
Output: anagram
 */




package mohiniA.StringArrayAssignments.ScannerInput.Assignment34;

import java.util.Arrays;
import java.util.Scanner;

public class AnangramString {
	
	void checkAnagramString(String input1, String input2) {

		int length1 = input1.length();
		int length2 = input2.length();

		// LOGIC >> if length is same then convert to char to sort and check if anagram
		if (length1 == length2) {

			// converting strings to char array 
			char[] arr1 = input1.toCharArray();
			char[] arr2 = input2.toCharArray();

			// sort both the arraus
			Arrays.sort(arr1);
			Arrays.sort(arr2);

			// if sorted char arrays are same
			// then the string is anagram
			boolean result = Arrays.toString(arr1).equals(Arrays.toString(arr2));

			if (result) {
				System.out.println("Result: "+"\""+input1+"\"" + " and " +"\""+ input2 +"\""+ " --> are Anagram");
			} else {
				System.out.println("Result: "+"\""+input1 +"\""+ " and " +"\""+ input2 +"\""+ " --> are not Anagram");
			}
		} else {
			
			System.out.println("Result: "+"\""+input1 +"\""+ " and " +"\""+ input2 +"\""+ " --> are not Anagram");
		}
			
			
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** Enter 2 Strings to check if they are Anagram ***");

		// UserInput
		System.out.println("Enter String 1:");
		String input1 = scanner.next();
		System.out.println("Enter String 2:");
		String input2 = scanner.next();

		AnangramString anagram = new AnangramString();
		anagram.checkAnagramString(input1, input2);
		
		scanner.close();
	}
	
	

}
