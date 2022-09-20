/*Program 1:
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits

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

package apurvaBabel;

public class Assignment23 {

	// Program 1
	String getMaxLengthWord(String input) {
		String[] arr = input.split(" ");
		int maxLength = 0;
		String tempName = " ";
		for (int index = 0; index < arr.length; index++) {
			if (maxLength <= arr[index].length()) {
				maxLength = arr[index].length();
				tempName = arr[index];
			}
		}
		return tempName;
	}

	// Program 2
	boolean isWordContainDigit(String word) {
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

	void printWordHavingDigits(String input) {
		String[] arr = input.split(" ");
		System.out.println("\nWords having digits in given input are :");
		for (int index = 0; index < arr.length; index++) {
			boolean flag = isWordContainDigit(arr[index]);
			if (flag) {
				System.out.println(arr[index]);
			}
		}
	}

	// Program 3
	int getUpperCaseCount(String word) {
		int count = 0;
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		return count;
	}

	String getWordHavingMaxUpperCase(String input) {
		String[] arr = input.split(" ");
		int maxCount = 0;
		int tempCount = 0;
		String tempName = " ";
		for (int index = 0; index < arr[index].length(); index++) {
			tempCount = getUpperCaseCount(arr[index]);
			if (maxCount < tempCount) {
				maxCount = tempCount;
				tempName = arr[index];
			}
		}
		return tempName;
	}

	// Program 4
	boolean isDigitOrUpperCase(String word) {
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isDigit(ch) || Character.isUpperCase(ch)) {
				return false;
			}
		}
		return true;
	}

	void printWordHavingLowerCase(String input) {
		String[] arr = input.split(" ");
		System.out.println("\nWord in lower case from given input are : ");
		for (int index = 0; index < arr.length; index++) {
			boolean flag = isDigitOrUpperCase(arr[index]);
			if (flag) {
				System.out.println(arr[index]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		String input1 = "Good morning friends this is technocredits";
		System.out.println("Maximum length word from given input is : " + assignment23.getMaxLengthWord(input1));

		String input2 = "Good mor9ning fr3iends t2hi2s is technocredits";
		assignment23.printWordHavingDigits(input2);

		String input3 = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println("\nWord having maximum upper case from given input is : "
				+ assignment23.getWordHavingMaxUpperCase(input3));

		String input4 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		assignment23.printWordHavingLowerCase(input4);
	}
}
