
/******Assignment - 23 : 16th Sep'2022 *******************/

package mohiniA.StringArrayAssignments;

import java.util.Arrays;

public class StringArrayAssign23 {

	/**************
	 * Program 1: Write a method to return maximum length word from given input.
	 * String input = "Good morning friends this is technocredits"; output :
	 * technocredits
	 *******/

	String getMaxString(String name) {
		String output = " ";
		String[] temp = name.split("\\s");
		// System.out.println("Split Array is : "+Arrays.toString(temp));
		for (int index = 0; index < temp.length; index++) {
			if (temp[index].length() > output.length())
				output = temp[index];
		}
		return output;
	}

	/***
	 * Program 2: Write a method to print all the words having atleast one digit.
	 * String input = "Good mor9ning fr3iends t2hi2s is technocredits"; output :
	 * mor9ning fr3iends t2hi2s
	 ***/

	String getOneDigitWord(String name) {
		System.out.println("\n"+name);
		String[] temp = name.split("\\s");
		String output = "";
		System.out.println("\n"+Arrays.toString(temp));
		for (int index = 0; index < temp.length; index++) {
			String word = temp[index];
			for (int wordindex = 0; wordindex < word.length(); wordindex++) {
				if (Character.isDigit(word.charAt(wordindex))) {
					output += word;
					output += " ";
					break;
				}

			}

		}
		return output;
	}

	/*******
	 * Program 3: Write a method to return word having maximum uppercase.
	 * 
	 * String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits"; output :
	 * FR3ienDs
	 *****/

	String getWordMaxUpperCase(String name) {
		System.out.println("\n"+name);
		String[] temp = name.split("\\s");
		int upcount = 0;
		String upper = "";
		System.out.println("\n"+Arrays.toString(temp));
		for (int index = 0; index < temp.length; index++) {
			String word = temp[index];
			int count = 0;
			for (int wordindex = 0; wordindex < word.length(); wordindex++) {

				if (Character.isUpperCase(word.charAt(wordindex))) {
					count++;
				}
			}
			if (upcount < count) {
				upcount = count;
				upper = word;
			}

		}
		return upper;

	}

	/***********
	 * Program 4: Write a method to print all the words having no digits and
	 * uppercase. String input = "Good mor9ning techno fr3iends t2Hi2s is
	 * tEchnocredits"; output : techno
	 ************/

	String getNoUpperNoDigit(String name) {
		System.out.println("\n"+name);
		String[] temp = name.split("\\s");
		String output = "";
		System.out.println("\n"+Arrays.toString(temp));
		for (int index = 0; index < temp.length; index++) {
			String word = temp[index];
			boolean flag = false;
			for (int wordindex = 0; wordindex < word.length(); wordindex++) {

				if (Character.isUpperCase(word.charAt(wordindex)) || Character.isDigit(word.charAt(wordindex))) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				output += word;
				output += " ";
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String name = "Good morning friends this is technocredits";
		System.out.println("String is : " + name);
		System.out.println("\nMAX Length out of above String is : " + new StringArrayAssign23().getMaxString(name));
		System.out.println("----------------------------------------------------------------------");
		String name1 = "Good mor9ning fr3iends t2hi3s is technocredits";
		System.out.println("\nString with Digits are : " + new StringArrayAssign23().getOneDigitWord(name1));
		System.out.println("----------------------------------------------------------------------");
		String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println("\nWord with Max Uppercase is : " + new StringArrayAssign23().getWordMaxUpperCase(input));
		System.out.println("----------------------------------------------------------------------");
		String input1 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		System.out.println("\nWord having no Uppercase and No Digits out of given String is :"
				+ new StringArrayAssign23().getNoUpperNoDigit(input1));

	}

}
