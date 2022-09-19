/*Assignment - 23 : 16th Sep'2022

Program 2: Write a method to print all the words having atleast one digit.

String input = "Good mor9ning fr3iends t2hi2s is technocredits";
output : mor9ning
         fr3iends
         t2hi2s*/

package rashmiG.assignment23StringSplitMethodPrograms;

class AllWordsHavingAtleast1Digit {

	/*
	 * private boolean isWordContainsDigit(String word){ boolean flag=false; for(int
	 * index=0;index<word.length();index++){
	 * 
	 * if(Character.isDigit(word.charAt(index))){ flag= true; break; } }
	 * 
	 * return flag; }
	 */

	private boolean isWordContainsDigit(String word) {
		for (int index = 0; index < word.length(); index++) {
			if (Character.isDigit(word.charAt(index))) {
				return true;
			}
		}
		return false;
	}

	public void displayWordsWithAtleast1Digit(String input) {
		System.out.println("Words having atleast one digit ::");
		String[] wordsArray = input.split(" ");
		for (int index = 0; index < wordsArray.length; index++) {
			boolean wordContainsDigitFlag = isWordContainsDigit(wordsArray[index]);
			if (wordContainsDigitFlag) {
				System.out.println(wordsArray[index]);
			}
		}
	}

	public static void main(String[] args) {
		AllWordsHavingAtleast1Digit allwordsHavingDigit = new AllWordsHavingAtleast1Digit();
		allwordsHavingDigit.displayWordsWithAtleast1Digit("Good mor9ning fr3iends t2hi2s is technocredits");
		System.out.print("\n");
		allwordsHavingDigit.displayWordsWithAtleast1Digit("Good 8;'[['[kl technocredits");

	}
}
