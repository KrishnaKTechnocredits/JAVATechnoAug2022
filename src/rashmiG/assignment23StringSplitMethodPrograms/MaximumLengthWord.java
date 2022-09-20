/*Assignment - 23 : 16th Sep'2022

Program 1:
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits

String getMaxLengthWord(String input){
	
}

String[] arr = input.split(" ");*/

package rashmiG.assignment23StringSplitMethodPrograms;

class MaximumLengthWord {

	String getMaxLengthWord(String input) {
		System.out.println("Maximum length word is : ");
		String[] wordsArray = input.split(" ");
		int maxLength = wordsArray[0].length();
		String maxLengthWord = wordsArray[0];
		for (int index = 1; index < wordsArray.length; index++) {
			if (maxLength < wordsArray[index].length()) {
				maxLength = wordsArray[index].length();
				maxLengthWord = wordsArray[index];
			}
		}
		return maxLengthWord;
	}

	public static void main(String[] args) {
		System.out.println(new MaximumLengthWord().getMaxLengthWord("Good morning friends this is technocredits"));
		System.out.println(new MaximumLengthWord().getMaxLengthWord("Good morning friends this is ;'[p;olijkumhg"));

	}
}
