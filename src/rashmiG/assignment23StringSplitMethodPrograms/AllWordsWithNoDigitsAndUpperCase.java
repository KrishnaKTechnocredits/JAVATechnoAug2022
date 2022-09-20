/*Assignment - 23 : 16th Sep'2022

Program 4: Write a method to print all the words having no digits and uppercase.
String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
output : techno
         is*/

package rashmiG.assignment23StringSplitMethodPrograms;

class AllWordsWithNoDigitsAndUpperCase {

	boolean isWordContainsNoDigitsAndUpperCase(String word) {
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isDigit(ch) || Character.isUpperCase(ch)) {
				return false;
			}
		}
		return true;
	}

	void printAllWordsHavingNoDigitsAndUpperCase(String input) {
		// System.out.println("Words having no digits and uppercase characters are :");
		String[] wordsArray = input.split(" ");
		boolean flag = true;
		for (int index = 0; index < wordsArray.length; index++) {
			boolean wordContainsNoDigitAndUpperCaseFlag = isWordContainsNoDigitsAndUpperCase(wordsArray[index]);
			if (wordContainsNoDigitAndUpperCaseFlag) {
				System.out.println(wordsArray[index]);
				flag = false;
			}
		}
		if (flag) {
			System.out.println(
					input + " :: In given input there are no words which are not having digits and uppercases");
		}
	}

	public static void main(String[] args) {
		System.out.println("Output 1: ");
		new AllWordsWithNoDigitsAndUpperCase()
				.printAllWordsHavingNoDigitsAndUpperCase("Good mor9ning techno fr3iends t2Hi2s is tEchnocredits");
		System.out.print("\n");
		AllWordsWithNoDigitsAndUpperCase wordsHavingNoDigitsAndUpperCase = new AllWordsWithNoDigitsAndUpperCase();
		System.out.println("Output 2: ");
		new AllWordsWithNoDigitsAndUpperCase().printAllWordsHavingNoDigitsAndUpperCase("()O unj camel ;'>< 90*");
		System.out.print("\n");
		wordsHavingNoDigitsAndUpperCase.printAllWordsHavingNoDigitsAndUpperCase("Fan t78u");
	}
}
