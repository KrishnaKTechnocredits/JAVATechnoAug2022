/*Assignment - 23 : 16th Sep'2022

Program 1:
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits

String getMaxLengthWord(String input){

}

String[] arr = input.split(" ");

Program 2: Write a method to print all the words having atleast one digit.

String input = "Good mor9ning fr3iends t2hi2s is technocredits";
output : mor9ning
         fr3iends
         t2hi2s

Program 3: Write a method to return word having maximum uppercase.

String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs

Program 4: Write a method to print all the words having no digits and uppercase.
String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
output : techno
         is
*/

package sanket;

public class ArrayOperationsEx3 {
	// method to return maximum length word from given input.
	String getMaximumLengthWord(String str) {
		String[] tempString = str.split(" ");
		String maxLengthWord = "";
		for (int index = 0; index < tempString.length; index++) {
			int maxLengh = 0;
			if (maxLengh < tempString[index].length()) {
				maxLengthWord = tempString[index];
			}
		}
		return maxLengthWord;
	}

	// method to return boolean as given word consist of any digit
	boolean isWordContainsDigit(String word) {
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

	// method to print all the words having atleast one digit
	void printWordsHavingDigits(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			boolean flag = isWordContainsDigit(arr[index]);
			if (flag)
				System.out.println(arr[index]);
		}
	}

	// method tell the count of upper case in word
	int maxWordCountUpperCase(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		return count;
	}

	// method to return word having maximum uppercase
	String getMaximumUpperCaseWord(String str) {
		String[] arr = str.split(" ");
		int maxWordCount = 0;
		String maxUpperCaseWord = "";
		for (int index = 0; index < arr.length; index++) {
			if (maxWordCount < maxWordCountUpperCase(arr[index])) {
				maxWordCount = maxWordCountUpperCase(arr[index]);
				maxUpperCaseWord = arr[index];
			}
		}
		return maxUpperCaseWord;
	}

	//method to return boolean as given word consist no digit
	boolean isWordContainsNoDigit(String word) {
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

	//method to return boolean as given word no upper case
	boolean isWordContainsUpperCase(String word) {
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isUpperCase(ch)) {
				return false;
			}
		}
		return true;
	}

	//method to print all the words having no digits and uppercase
	void getTheWordHavingNoUpperCaseAndDigit(String arr) {
		String[] str = arr.split(" ");
		for (int index = 0; index < str.length; index++) {
			if (isWordContainsNoDigit(str[index]) && isWordContainsUpperCase(str[index])) {
				System.out.println(str[index]);
			}
		}
	}

	public static void main(String[] args) {
		String input = "Good morning friends this is technocredits.";
		System.out.println("The string is : " + input);
		String output = new ArrayOperationsEx3().getMaximumLengthWord(input);
		System.out.println("The maximum length in given string is : " + output);

		System.out.println("\n");

		String input2 = "Good mor9ning fr3iends t2hi2s is technocredits";
		System.out.println("The string is : " + input2);
		System.out.println("All the words having atleast one digit in given string are :");
		new ArrayOperationsEx3().printWordsHavingDigits(input2);

		System.out.println("\n");

		String input3 = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println("The string is : " + input3);
		System.out.println("Word having maximum uppercase in given string are : "
				+ new ArrayOperationsEx3().getMaximumUpperCaseWord(input3));

		System.out.println("\n");

		String input4 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		System.out.println("The string is : " + input4);
		System.out.println("All the words having no digits and uppercase in given string are :");
		new ArrayOperationsEx3().getTheWordHavingNoUpperCaseAndDigit(input4);
	}
}