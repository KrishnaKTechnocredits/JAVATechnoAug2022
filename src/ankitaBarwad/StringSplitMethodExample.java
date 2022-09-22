/*Program 1:
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
package ankitaBarwad;

public class StringSplitMethodExample {

	String getMaxLengthWord(String inputString) {

		String[] outputString = inputString.split(" ");
		String maxLengthWord = outputString[0];
		for (int index = 1; index < outputString.length; index++) {
			if (maxLengthWord.length() < outputString[index].length()) {
				maxLengthWord = outputString[index];
			}
		}
		return maxLengthWord;
	}

	private boolean isWordContainsDigit(String word) {
		for (int index = 0; index < word.length(); index++) {
			if (Character.isDigit(word.charAt(index))) {
				return true;
			}
		}
		return false;
	}

	void printWordsHavingDigits(String inputString) {
		String[] output = inputString.split(" ");
		System.out.print("Words Having Digit : ");
		for (int index = 0; index < output.length; index++) {
			boolean flag = isWordContainsDigit(output[index]);
			if (flag) {
				System.out.print(output[index]+" ");
			}
		}
		System.out.print("\n");
	}

	int getUpperCaseCount(String word) {
		int count = 0;
		for(int index = 0; index < word.length(); index++) {
			if(Character.isUpperCase(word.charAt(index))) {
				count++;
			}
		}
		return count;
	}
	
	String getMaxUpperCaseWord(String inputString) {
		String[] output = inputString.split(" ");
		String maxUpperCaseWord = null;
		int maxUpperCaseCount = 0;
		for(int index = 0; index < output.length; index++) {
			int count = getUpperCaseCount(output[index]);
			if(maxUpperCaseCount < count) {
				maxUpperCaseWord = output[index];
				maxUpperCaseCount = count;
			}
		}
		return maxUpperCaseWord;
	}
	
	private boolean isWordContainDigitUpperCase(String word) {
		for(int index = 0; index < word.length(); index++) {
			if(Character.isDigit(word.charAt(index)) || Character.isUpperCase(word.charAt(index))) {
				return false;
			}
		}
		return true;
	}
	
	void printNoDigitNoUpperCaseWord(String inputString) {
		String[] output = inputString.split(" ");
		System.out.print("Words with no digit and no uppercase : ");
		for(int index = 0; index < output.length; index++) {
			boolean flag = isWordContainDigitUpperCase(output[index]);
			if (flag) {
				System.out.print(output[index] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		StringSplitMethodExample example1 = new StringSplitMethodExample();
		String inputString = "Good morning friends this is technocredits";
		System.out.println("Program1 : \nInput String : " + inputString + " \nMax Length Word is : " + example1.getMaxLengthWord(inputString));
		
		inputString = "Good mor9ning fr3iends t2hi2s is technocredits";
		System.out.println("Program2 : \nInput String : " + inputString);
		example1.printWordsHavingDigits(inputString);
		
		inputString ="Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println("Program3 : \nInput String : " + inputString + " \nMax Uppercase Word is : " + example1.getMaxUpperCaseWord(inputString));
		
		inputString = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		System.out.println("Program4 : \nInput String : " + inputString);
		example1.printNoDigitNoUpperCaseWord(inputString);
	}
}
