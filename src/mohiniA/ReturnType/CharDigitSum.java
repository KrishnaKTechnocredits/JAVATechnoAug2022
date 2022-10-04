/******Assignment - 17 :06092022*******/

/*****To print the sum of Digits in given string*****/

package mohiniA.ReturnType;

public class CharDigitSum {

	int stringDigitSum(String name) {
		int digitSum = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {

				digitSum = digitSum + Character.getNumericValue(ch);

			}

		}
		return (digitSum);

	}

	public static void main(String[] args) {

		int ln = new CharDigitSum().stringDigitSum("Mo2hi4ni9");

		System.out.println("Sum of the digit in given string is : " + ln);
	}
}
