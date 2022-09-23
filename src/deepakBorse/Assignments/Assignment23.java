/*
 * Assignment - 23 : 16th Sep'2022

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
package deepakBorse.Assignments;

public class Assignment23 {

	String getMaxLenWord(String input) {// 10 mins

		String[] arrysplit = input.split(" ");
		String maxlenword = arrysplit[0];
		for (int i = 1; i < arrysplit.length; i++) {

			if (maxlenword.length() < arrysplit[i].length()) {
				maxlenword = arrysplit[i];
			}
		}
		return maxlenword;
	}

	boolean isDigitword(String str) {

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

	void printWordContainDigit(String input) {

		String[] arrysplit = input.split(" ");
		for (int i = 0; i < arrysplit.length; i++) {
			boolean isworddigit = isDigitword(arrysplit[i]);
			if (isworddigit) {
				System.out.println(arrysplit[i]);
			}
		}
	}

	int getMaxUpperCase(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				count++;

			}
		}
		return count;
	}

	void printWordmaxUppercase(String input) {
		int maxcount = 0;
		String maxstr = "";
		String[] arrysplit = input.split(" ");
		for (int i = 0; i < arrysplit.length; i++) {
			int uppercount = getMaxUpperCase(arrysplit[i]);

			if (maxcount < uppercount) {
				maxcount = uppercount;
				maxstr = arrysplit[i];
			}
		}
		System.out.println(maxstr);
	}

	boolean isDigitUpcase(String input) {

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch) || Character.isUpperCase(ch)) {
				return true;
			}
		}

		return false;
	}

	void printWord(String input) {
		String[] inputsplit = input.split(" ");
		for (int i = 0; i < inputsplit.length; i++) {
			boolean isDigitUpcase = isDigitUpcase(inputsplit[i]);
			if (!isDigitUpcase) {

				System.out.println(inputsplit[i]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment23 Assignment = new Assignment23();

		String input = ("Good morning friends this is technocredits");

		String maxlenword = Assignment.getMaxLenWord(input);
		System.out.println("Maximum length word from given input '" + input + "' is: " + maxlenword);

		String input1 = ("Good mor9ning fr3iends t2hi2s is technocredits");
		System.out.println("Word contain atleast one digit from given string '"+input1+"' :");
		Assignment.printWordContainDigit(input1);
		
		String input2 = ("Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits");
		System.out.println("Word contain maximum uppder case from given string '"+input2+"' :");
		Assignment.printWordmaxUppercase(input2);

		String input3 = ("Good mor9ning techno fr3iends t2Hi2s is tEchnocredits");
		System.out.println("Word does not contain digit and upper case from given string '"+input3+"' :");
		Assignment.printWord(input3);

	}
}
