/*Assignment - 23 : 16th Sep'2022

Program 1:
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits

String getMaxLengthWord(String input){
	
}
*/
package deepakPatil.Assignment23StringExamples;

public class StringSplitEx1 {
	String getMaxLengthWord(String input) {
		String[] splitWords = input.split(" ");
		String maxLengthWord = splitWords[1];

		for (int i = 1; i < splitWords.length; i++) {
			if (splitWords[i].length() > maxLengthWord.length()) {
				maxLengthWord = splitWords[i];
			}

		}
		return maxLengthWord;

	}

	public static void main(String[] args) {
		String inputString = "Good morning friends this is technocredits";
		System.out.println("Given string is: " + inputString);
		System.out.println("Max lenght word from given string is '" + new StringSplitEx1().getMaxLengthWord(inputString+"'"));
	}

}
