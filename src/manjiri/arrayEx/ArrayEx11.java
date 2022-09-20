/*Write a method to print all the words having atleast one digit.

String input = "Good mor9ning fr3iends t2hi2s is technocredits";
output : mor9ning
         fr3iends
         t2hi2s	*/

package manjiri.arrayEx;

public class ArrayEx11 {

	private boolean isWordHavingDigit(String word) {

		for (int index = 0; index < word.length(); index++) {
			if (Character.isDigit(word.charAt(index))) {
				return true;
			}
		}
		return false;
	}

	void getWordsHavingDigits(String input) {
		String[] inputArr = input.split(" ");

		for (int index = 0; index < inputArr.length; index++) {
			boolean flag = isWordHavingDigit(inputArr[index]);
			if(flag) {
				System.out.println(inputArr[index]);
			}
		}
	}

	public static void main(String[] args) {
		String input = "Good mor9ning fr3iends t2hi2s is technocredits";
		new ArrayEx11().getWordsHavingDigits(input);
	}
}
