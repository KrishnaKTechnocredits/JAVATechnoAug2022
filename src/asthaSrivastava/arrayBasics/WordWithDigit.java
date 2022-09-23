/*Program 2: Write a method to print all the words having atleast one digit.

String input = "Good mor9ning fr3iends t2hi2s is technocredits";
output : mor9ning
         fr3iends
         t2hi2s	*/
package asthaSrivastava.arrayBasics;

public class WordWithDigit {

	boolean getWordHavingDigit(String str) {

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

	void printWordWithDigits(String input) {
		String[] arr = input.split(" ");

		for (int index = 0; index < arr.length; index++) {
			boolean flag = getWordHavingDigit(arr[index]);
			if (flag) {

				System.out.println("Word with Digit is " + arr[index]);
			}
		}
	}

	public static void main(String[] args) {
		WordWithDigit test = new WordWithDigit();
		String input = "Good mor9ning fr3iends t2hi2s is technocredits";
		test.printWordWithDigits(input);

	}

}
