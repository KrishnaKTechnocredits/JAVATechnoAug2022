/*Program 1:
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits

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

package rohanNaik.Assignments;

public class Assignment23String {

	void noDigitsNUppercase(String input2) {

		String[] arr = input2.split(" ");

		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			int flag = 0;
			for (int innerIndex = 0; innerIndex < str.length(); innerIndex++) {
				char ch = str.charAt(innerIndex);
				if (Character.isDigit(ch) || Character.isUpperCase(ch)) {
					flag = 1;
					break;
				} else
					flag = 0;
			}
			if (flag == 0)
				System.out.println(str);

		}

	}

	String uppercaseWord(String inline) {

		String[] arr = inline.split(" ");
		String word = "";
		int max = 0;

		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			int count = 0;

			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if (Character.isUpperCase(ch)) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				word = str;
			}

		}
		return word;
	}

	void getWordDigit(String line) {
		String[] arr = line.split(" ");
		// int flag = 0;
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];// str=go1od

			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (Character.isDigit(ch) == true) {
					// flag = 1;
					System.out.println(str);
					break;
				}
			}

		}

	}

	String getMaxLengthWord(String input) {

		String[] arr = input.split(" ");
		String maxlengthString = "";
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > maxlengthString.length()) {
				maxlengthString = arr[index];
			}
		}

		String output = maxlengthString;

		return output;

	}

	public static void main(String[] args) {

		Assignment23String obj = new Assignment23String();

		String input = "Good morning friends this is technocredits";
		String output = obj.getMaxLengthWord(input);
		System.out.println(output);
		System.out.println("-------------------------------------------");
		String line = "Good mor9ning fr3iends t2hi2s is technocredits";
		obj.getWordDigit(line);
		System.out.println("-------------------------------------------");
		String inline = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		String word = obj.uppercaseWord(inline);
		System.out.println(word);
		System.out.println("-------------------------------------------");
		String input2 = "Good mor9ning fr3iends t2hi2s is technocredits";
		obj.noDigitsNUppercase(input2);

	}

}
