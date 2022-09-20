/*Assignment - 23 : 16th Sep'2022

Program 3: Write a method to return word having maximum uppercase.

String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs*/

package rashmiG.assignment23StringSplitMethodPrograms;

class WordHavingMaimumUpperCaseChar {

	private int getUpperCaseCount(String word) {
		int upperCaseCount = 0;
		for (int index = 0; index < word.length(); index++) {
			if (Character.isUpperCase(word.charAt(index))) {
				upperCaseCount++;
			}
		}
		return upperCaseCount;
	}

	public String getWordHavingMaxUpperCase(String input) {
		String[] wordsArray = input.split(" ");
		int maxUpperCaseCount = 0;
		String maxUpperCaseWord = "";
		for (int index = 0; index < wordsArray.length; index++) {
			int upperCaseCount = getUpperCaseCount(wordsArray[index]);
			if (upperCaseCount > maxUpperCaseCount) {
				maxUpperCaseCount = upperCaseCount;
				maxUpperCaseWord = wordsArray[index];
			}
		}
		return maxUpperCaseWord;

	}

	public static void main(String[] args) {
		WordHavingMaimumUpperCaseChar wordWithMaxUpperCase = new WordHavingMaimumUpperCaseChar();
		System.out.println("Word having maximum uppercase letters is "
				+ wordWithMaxUpperCase.getWordHavingMaxUpperCase("Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits"));
	}
}
