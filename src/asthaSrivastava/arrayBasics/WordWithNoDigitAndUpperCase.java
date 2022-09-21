/*Program 4: Write a method to print all the words having no digits and uppercase.
String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
output : techno
         is*/
package asthaSrivastava.arrayBasics;

public class WordWithNoDigitAndUpperCase {
	
	boolean getWordWithNoDigitAndUpperCase(String str) {

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) || Character.isUpperCase(ch) ) {
				return true;
			}
		}
		return false;
	}

	void printWordWithNoDigitAndUpperCase(String input) {
		String[] arr = input.split(" ");

		for (int index = 0; index < arr.length; index++) {
			boolean flag = getWordWithNoDigitAndUpperCase(arr[index]);
			if (flag == false) {
				System.out.println(arr[index]);
			}
		}
	}

	public static void main(String[] args) {
		WordWithNoDigitAndUpperCase test = new WordWithNoDigitAndUpperCase();
		String input =  "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		test.printWordWithNoDigitAndUpperCase(input);
		

	}

}
