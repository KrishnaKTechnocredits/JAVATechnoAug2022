/*
 Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9
Hint : Using Exception handling

 */

package swapnilMaheshwari.ExceptionHandling.Assignment35;

public class SumOfAllDigitsFromString {
	int getSumOfAllDigitsFromString(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			try {
				char ch = str.charAt(i);
				int c = Integer.parseInt(str.valueOf(ch));
				sum = sum + c;
			} catch (NumberFormatException nb) {

			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String input = "i have 15 years and 3 months of experience.";
		System.out.println(" Sum of All digits in the String is:"+ new SumOfAllDigitsFromString().getSumOfAllDigitsFromString(input));
	}

}
