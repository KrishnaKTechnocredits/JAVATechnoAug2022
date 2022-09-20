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

package nilamP;

public class StringOperations3 {
	String getMaxString(String str) {
		String[] arr = str.split(" ");

		int maxlength = 0;
		String maxstring = " ";
		for (int i = 0; i < arr.length; i++) {
			if (maxlength <= arr[i].length()) {
				maxlength = arr[i].length();
				maxstring = arr[i];

			}
		}
		return maxstring;
	}

	boolean isWordHaveDigit(String word) {
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

	void getWordWithDigit(String input) {

		String[] arr = input.split(" ");

		for (int i = 0; i < arr.length; i++) {
			boolean flag = isWordHaveDigit(arr[i]);
			if (flag) {
				System.out.println(arr[i]);
			}
		}
	}

	int getUpperCaseCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		return count;
	}

	String getMaxUpperCase(String input) {
		String[] arr = input.split(" ");
		int maxcount = 0;
		int tempcount = 0;
		String maxuppercasestring = " ";
		for (int i = 0; i < arr[i].length(); i++) {
			tempcount = getUpperCaseCount(arr[i]);
			if (maxcount < tempcount) {
				maxcount = tempcount;
				maxuppercasestring = arr[i];
			}
		}
		return maxuppercasestring;

	}

	boolean isDigitOrUpperCase(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) || Character.isUpperCase(ch)) {
				return false;
			}
		}
		return true;
	}

	void PrintWords(String input) {
		String[] arr = input.split(" ");

		for (int i = 0; i < arr[i].length(); i++) {
			boolean flag = isDigitOrUpperCase(arr[i]);
			if (flag) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String args[]) {
		StringOperations3 so = new StringOperations3();
		String str = "Good morning friends this is technocredits";
		System.out.println("maxstring is : " + so.getMaxString(str));
		String str1 = "Good mor9ning fr3iends t2hi2s is technocredits";
		System.out.print("words are : ");
		so.getWordWithDigit(str1);
		String str2 = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println("word having maximum Uppercase  :" + so.getMaxUpperCase(str2));
		String str3 = "Good mor9ning techno fr3iends t2Hi2s Is tEchnocredits";
		System.out.println("words are : ");
		so.PrintWords(str3);

	}

}
