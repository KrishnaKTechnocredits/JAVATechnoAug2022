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
package chaitanyaMankar.String;

public class StringFunct {
	String getMaxLengthWord(String Name) {
		String[] arr = Name.split(" ");
		String tMax = "";

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i].length() < arr[i + 1].length()) {
				tMax = arr[i + 1];
			}
		}
		return tMax;
	}

	String[] containNumber(String Name) // "Good mor9ning fr3iends t2hi2s is technocredits";
	{
		String[] arr = Name.split(" ");
		String tWord = "";
		String[] temp = new String[Name.length()]; // String Array Size
		int k = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			tWord = arr[i];
			for (int j = 0; j < tWord.length(); j++) {
				char ch = tWord.charAt(j);
				if (Character.isDigit(ch)) {
					// System.out.println(tWord);
					temp[k] = tWord;
					k++;
					break;
				}
			}
		}
		return temp;
	}

	void printWordHavingNumber(String[] output2) {
		for (int i = 0; i < output2.length; i++) {
			if (output2[i] != null)
				System.out.println("Word having Numbers: " + output2[i]);
		}
	}

	int getCountUpperCase(String word) {
		int countUpper = 0;
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isUpperCase(ch)) {
				countUpper++;
			}
		}
		return countUpper;
	}

	String containMaxUpper(String input) {
		int maxCountUpper = 0;
		int countUpper = 0;
		String word = "";
		String[] input1 = input.split(" ");
		for (int index = 0; index < input1.length; index++) {
			countUpper = getCountUpperCase(input1[index]);
			if (maxCountUpper < countUpper) {
				maxCountUpper = countUpper;
				word = input1[index];
			}
		}
		return input;
	}

	String getWordMaxUpperCase(String input) {
		int maxCountUpper = 0;
		int countUpper = 0;
		String word = "";
		String[] input1 = input.split(" ");
		for (int index = 0; index < input1.length; index++) {
			countUpper = getCountUpperCase(input1[index]);
			if (maxCountUpper < countUpper) {
				maxCountUpper = countUpper;
				word = input1[index];
			}
		}
		return word;
	}

	boolean isDigit(String word) {
		boolean flag = false;
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isDigit(ch)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			return flag;
		} else {
			return flag;
		}
	}

	boolean isUpperCase(String word) {
		boolean flag = false;
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isUpperCase(ch)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			return flag;
		} else {
			return flag;
		}
	}

	void printWordNoDigitNoUppercase(String word) {
		boolean isDigit = isDigit(word);
		boolean isUpperCase = isUpperCase(word);
		if (isDigit == false && isUpperCase == false) {
			System.out.println(word);
		}
	}

	void containNoMaxUpper(String input) {
		System.out.println("Words having no digits and uppercase are: ");
		String[] input1 = input.split(" ");
		for (int index = 0; index < input1.length; index++) {
			printWordNoDigitNoUppercase(input1[index]);
		}
	}

	public static void main(String[] args) {
		StringFunct SF = new StringFunct();
		String input1 = "Good morning friends this is technocredits";
		String output1 = SF.getMaxLengthWord(input1);
		System.out.println("Max Length Word-> " + output1);
		

		String input2 = "Good mor9ning fr3iends t2hi2s is technocredits";
		String[] output2 = SF.containNumber(input2);
		SF.printWordHavingNumber(output2);
		System.out.println("");

		String input3 = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println("Input3 : " + input3);
		System.out.println("Max Uppercase word in the given string is: " + SF.getWordMaxUpperCase(input3));
		System.out.println("");

		String input4 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		SF.containNoMaxUpper(input4);

	}
}
