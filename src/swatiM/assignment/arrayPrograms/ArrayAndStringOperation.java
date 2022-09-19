/* Assignment - 23 : 16th Sep'2022

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
         is */

package swatiM.assignment.arrayPrograms;
		 
public class ArrayAndStringOperation{
	
	String getMaxLengthWord(String input){
	String[] arr = input.split(" ");
	int maxLength = 0;
	int maxIndex = 0;
	
	for(int index = 0; index < arr.length ; index++){
			if(maxLength < arr[index].length()){
				maxLength = arr[index].length();
				maxIndex = index;
			}
		}
		return arr[maxIndex];
	}
	boolean isWordHavingDigit(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

	void printAllWordsHavingAtleastOneDigit(String input) {
		String[] array = input.split(" ");

		for (int index = 0; index < array.length; index++) {
			if (isWordHavingDigit(array[index])) {
				System.out.println(array[index] + " ");
			}
		}
	}

	int getWordUpperCaseCount(String input) {
		int count = 0;

		for (int index = 0; index <= input.length() - 1; index++) {
			char ch = input.charAt(index);

			if (Character.isUpperCase(ch))
				count++;
		}

		return count;
	}

	boolean isWordHavingNoDigitOrUppercase(String input) {

		for (int index = 0; index <= input.length() - 1; index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch) || Character.isDigit(ch))
				return false;
		}

		return true;
	}

	String getWordHavingMaximumUppercase(String input) {
		String[] array = input.split(" ");
		int maxCount = 0;
		String tempString = "";

		for (int index = 0; index < array.length; index++) {
			int tempCount = getWordUpperCaseCount(array[index]);
			if (maxCount < tempCount) {
				maxCount = tempCount;
				tempString = array[index];
			}
		}
		return tempString;
	}

	void printWordsWithoutDigitAndUpperCase(String input) {
		String[] array = input.split(" ");

		for (int index = 0; index < array.length; index++) { // array parse
			if (isWordHavingNoDigitOrUppercase(array[index])) {
				System.out.println(array[index]);
			}
		}
	}	
	
public static void main(String[] args){
	
	ArrayAndStringOperation arrayAndStringOperation = new ArrayAndStringOperation();
	
	String input = "Good morning friends this is technocredits";
	System.out.println("\nProgram 1 - Method to return maximum length word from given input.");
	System.out.println("\n Input String  : " +input + " \n Output String  : " +arrayAndStringOperation.getMaxLengthWord(input));
	
	String input1 = "Good mor9ning fr3iends t2hi2s is technocredits";
	System.out.println("\nProgram 2 - Method to print all the words having atleast one digit.");
	System.out.println("\nInput String: " + input1 + "\nOutput: ");
	arrayAndStringOperation.printAllWordsHavingAtleastOneDigit(input1);

	String input2 = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
	System.out.println("\nProgram 3 - Method to print all the words having atleast one digit.");
	System.out.println("\nInput String: " + input2 + "\nOutput: " + arrayAndStringOperation.getWordHavingMaximumUppercase(input2));

	String input3 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
	System.out.println("\nProgram 4 - Method to print all the words having no digits and uppercase");
	System.out.println("\nInput String: " + input3 + "\nOutput: ");
	arrayAndStringOperation.printWordsWithoutDigitAndUpperCase(input3);
		
	}
}





