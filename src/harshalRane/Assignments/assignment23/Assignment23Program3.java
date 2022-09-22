/*
 * Program 3: Write a method to return word having maximum uppercase.

String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs	
 */
package harshalRane.Assignments.assignment23;

public class Assignment23Program3 {

	int getUpperCase(String input) {
		int upperCaseCount = 0;
		for (int index = 0; index < input.length() -1; index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) 
			{
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
			if (maxCount < tempCount) 
			{
				maxCount = tempCount;
				tempString = arr[index];
			}
		}
		return tempString;
	}

	public static void main(String[] args) {
		Assignment23Program3 p3 = new Assignment23Program3();
		String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println(p3.getWordWithMaxUpper(input));
	}
}
