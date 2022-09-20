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
         is*/

package smitaVetal.Assignment20_30;

public class Assignment23 {

	String getMaxLengthWord(String name) {

		String[] arr = name.split(" ");
		String word = "";
		for (int i = 0; i < arr.length - 1; i++) {
			word = arr[i];
			if (arr[i].length() < arr[i + 1].length()) {
				word = arr[i + 1];
			}
		}
		return word;
	}

	boolean isWordContainsDigit(String input) {
		boolean flag = false;
		// String name[] = input.split(" ");
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				flag = true;
			}
		}
		return flag;
	}

	void getWordWithAtleast1Digit(String name) { // "Good mor9ning fr3iends t2hi2s is technocredits";
		String arr[] = name.split(" ");

		for (int i = 0; i < arr.length; i++) {
			// String word = arr[i];
			boolean isword = isWordContainsDigit(arr[i]);
			if (isword) {
				System.out.println(arr[i]);
			}
		}
	}

	// method to return word having maximum uppercase
	String getWordWithMaxUpperCase(String input) {
		String[] inputArray = input.split(" ");
		int maxCount = 0;
		String maxWord = " ";
		for (int index = 0; index < inputArray.length; index++) {
			int count = 0;
			for (int j = 0; j < inputArray[index].length(); j++) {
				if (Character.isUpperCase(inputArray[index].charAt(j)))
					count++;
			}
			if (maxCount < count) {
				maxCount = count;
				maxWord = inputArray[index];
			}
		}
		return maxWord;
	}

	// method to print all the words having no digits and uppercase
	void getWordWithNoDigitsNoUpCase(String input) {
		String[] inputArray = input.split(" ");
		System.out.print( "\nOutput :\n");
		for (int index = 0; index < inputArray.length; index++) {
			boolean flag = true;
			for (int j = 0; j < inputArray[index].length(); j++) {
				char ch = inputArray[index].charAt(j);
				if (Character.isDigit(ch) || Character.isUpperCase(ch)) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.print(inputArray[index] + " \n");
				
		}

	}

	public static void main(String[] args) {
		Assignment23 array = new Assignment23();
		String input1 = "Good morning friends this is technocredits";
		System.out.println("Input string is : " + input1);
		String output = array.getMaxLengthWord(input1);
		System.out.println("Maximum length word from string is : " + output);

		System.out.println("===============================================================");

		String input2 = "Good mor9ning fr3iends t2hi2s is technocredits";
		System.out.println("Given string is " + input2 + "\nAll words having atleast 1 digit are");
		array.getWordWithAtleast1Digit(input2);

		System.out.println("===============================================================");

		String input3 = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println("Given input string is " + input3);
		String output3 = array.getWordWithMaxUpperCase(input3);
		System.out.println("word with maximum uppercase is " + output3);
		System.out.println("=====================================================================");

		String input4 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		System.out.println("Given input string is " + input4);
		array.getWordWithNoDigitsNoUpCase(input4);

	}

}
