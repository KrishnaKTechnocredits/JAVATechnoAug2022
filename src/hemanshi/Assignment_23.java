/*Program 1:
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
         is*/

package hemanshi;
import java.util.Arrays;

public class Assignment_23 {
	
//Write a method to return maximum length word from given input.
	
	String getMaxLengthWord(String inputString) {

		String[] outputString = inputString.split(" ");
		String maxLengthWord = outputString[0];
		for (int index = 1; index < outputString.length; index++) {
			if (maxLengthWord.length() < outputString[index].length()) {
				maxLengthWord = outputString[index];
			}
		}
		return maxLengthWord;
	}
		
// program-2
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
			void stringAteastOneDigit(String input) {
				String[] arr = input.split(" ");
				for (int index = 0; index < arr.length; index++) {
					boolean flag = isWordContainsDigit(arr[index]);
					if (flag)
						System.out.println(arr[index]);
				}
			}

// program-3
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

//program-4
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
	
	public static void main (String args[]) {
		
		Assignment_23 assignment_23 = new Assignment_23();
		String inputString = "Good morning friends this is technocredits";
		System.out.println("Program1 : \nInput String : " + inputString + " \nMax Length Word is : " + assignment_23.getMaxLengthWord(inputString));

		System.out.print("\n +++++----------------------+++++ \n");
		
		String input2 = "Good mor9ning fr3iends t2hi2s is technocredits";
		System.out.println("The string is : " + input2);
		System.out.println("All the words having atleast one digit in given string are :");
		new Assignment_23().stringAteastOneDigit(input2);

		System.out.println("\n +++++----------------------+++++ \n");

		String input3 = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println("The string is : " + input3);
		System.out.println("Word having maximum uppercase in given string are : "+ new Assignment_23().getMaximumUpperCaseWord(input3));

		System.out.println("\n +++++----------------------+++++ \n");

		String input4 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		System.out.println("The string is : " + input4);
		System.out.println("All the words having no digits and uppercase in given string are :");
		new Assignment_23().getTheWordHavingNoUpperCaseAndDigit(input4);
		
	}

}
