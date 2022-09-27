package shubhamG.Assignment21to30;

import java.util.Arrays;

public class Assignment28SwitchCase {

	// Methodh returns total number of vowels in the given string
	int getCountOfVowels(String str) {
		str = str.toLowerCase();
		int count = 0; // Initializing a variable count with value as 0
		for (int i = 0; i < str.length(); i++) { // applying a loop which traverse through each character of given
													// string
			char ch = str.charAt(i);

			switch (ch) {// applying switch case which compare if each char is vowel or not
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++; // If the character is vowel, then we are increasing the count
			}
		}
		return count;
	}

	// Method returns 1st vowel from the given string
	char getFirstVowelFromString(String str) {
		str = str.toLowerCase();
		char ch = str.charAt(0); //// Initializing a variable ch with value as 1st character of string
		int count = 0; // Initializing a variable count with value as 0
		for (int i = 0; i < str.length(); i++) { // applying a loop which traverse through each character of given
													// string
			char ch1 = str.charAt(i);

			switch (ch1) {// applying switch case which compare if each char is vowel or not
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'O':
			case 'u':
				ch = ch1; // if ch1 is vowel then storing its value in ch
				count++; // once vowel is found in the string increasing the count
				break;
			}
			if (count == 1) { // As we need 1st vowel, once the count reaches 1, we are coming out of loop
				break;
			}
		}
		return ch;
	}

	// method to print count of each vowel in string
	void printCountOfEachVowelInString(String str) {
		str = str.toLowerCase(); // converting the string to lower case
		int countA = 0;// initializing variables count for all vowel with 0 value
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		for (int i = 0; i < str.length(); i++) { // applying the loop from 1st character till last
			char ch = str.charAt(i); // storing th character in ch variable

			switch (ch) { // applying switch case on each character and if it matching the condition, the
							// corresponding count value will increase
			case 'a':
				countA++;
				break;

			case 'e':
				countE++;
				break;
			case 'i':
				countI++;
				break;
			case 'o':
				countO++;

				break;
			case 'u':
				countU++;
				break;
			default:
				break;
			}
		} // checking what all vowels are present and printing its count
		if (countA > 0)
			System.out.println("a" + "->" + countA);
		if (countE > 0)
			System.out.println("e" + "->" + countE);
		if (countI > 0)
			System.out.println("i" + "->" + countI);
		if (countO > 0)
			System.out.println("o" + "->" + countO);
		if (countU > 0)
			System.out.println("u" + "->" + countU);

	}

	// method to count vowel in each string of array
	void printCountOfEachVowelInString(String[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println("\nVowel count in "+arr[i]);
			int count = getCountOfVowels(arr[i]); // calling existing method to count vowel in array
			System.out.println(arr[i] + " -> " + count); // printing the string and vowel count
			System.out.println("Instance of each variables in "+arr[i]+ " are-");
			printCountOfEachVowelInString(arr[i]); //Printing the count of each vowel in string
		}
	}

	public static void main(String[] args) {
		Assignment28SwitchCase test = new Assignment28SwitchCase();

		String input = "TechnOcredits";
		System.out.println("Input String is : " + input);
		System.out.println("Total number of vowels in the given string are: " + test.getCountOfVowels(input));
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Input String is : " + input);
		System.out.println("First vowels in the given string are: " + test.getFirstVowelFromString(input));
		System.out.println("-----------------------------------------------------------");
		
		String input1 = "TechnOcredits";
		System.out.println("Input String is : " + input1);
		System.out.println("Count of vowels in the given string are: ");
		test.printCountOfEachVowelInString(input);
		System.out.println("-----------------------------------------------------------");
		
		String[] input2 = { "technocredits", "swati", "aashvi" };
		System.out.println("Given input array is : " + Arrays.toString(input2));
		System.out.println("Total number of vowels in the given string are:");
		test.printCountOfEachVowelInString(input2);
	}
}
