/*Program 3: Write a method to return word having maximum uppercase.
String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs			 
Program 4: Write a method to print all the words having no digits and uppercase.
String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
output : techno
         is*/

package anujaD;

public class Assignment23_2 {
	
	int getUpperCase(String input) {
		int upperCaseCount = 0;
		for (int index = 0; index < input.length() - 1; index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			}
		}
		return upperCaseCount;
	}

	String getWordWithMaxUpper(String input) {
		String[] arr = input.split(" ");
		int maxCount = 0;
		String tempString = "";

		for (int index = 0; index < arr.length; index++) {
			int tempCount = getUpperCase(arr[index]);
			if (maxCount < tempCount) {
				maxCount = tempCount;
				tempString = arr[index];
			}
		}
		return tempString;
	}
	boolean isDigit(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch) || Character.isUpperCase(ch))
				return false;
		}
		return true;
	}

	void printWordWithLowerCase(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			boolean flag = isDigit(arr[index]);
			if (flag) {
				System.out.println(arr[index]);
			}
		}
	}
	public static void main(String[] args) {
		Assignment23_2 p2 = new Assignment23_2();
		String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println(p2.getWordWithMaxUpper(input));
		
		
		String input1 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		System.out.println(input1);
		System.out.println("-----------------------------------------------");
		p2.printWordWithLowerCase(input1);
	}

}
