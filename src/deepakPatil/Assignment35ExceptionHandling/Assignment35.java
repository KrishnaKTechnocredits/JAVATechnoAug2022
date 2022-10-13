/*Assignment - 35 : 7th Oct'2022

Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18
Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
if we couldn't covert string to int for any word, it throws NumberFormatException.

Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9
Hint : Using Exception handling
*/

package deepakPatil.Assignment35ExceptionHandling;

public class Assignment35 {

	int getSumOfAllNumbersFromString(String input) {

		String[] inputArray = input.split(" ");
		int sum = 0;
		for (int index = 0; index < inputArray.length; index++) {
			try {
				sum = sum + Integer.parseInt(inputArray[index]);
			} catch (NumberFormatException ne) {

			}
		}
		return sum;
	}

	int getSumOfAllDigitFromString(String input) {
		String[] inputArray = input.split(" ");
		int sum = 0;
		for (int index = 0; index < inputArray.length; index++) {
			String str = inputArray[index];
			for (int innerIndex = 0; innerIndex < str.length(); innerIndex++) {
				try {
					String str1 = Character.toString(str.charAt(innerIndex));
					sum = sum + Integer.parseInt(str1);
				} catch (NumberFormatException ne) {

				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment35 assignment35 = new Assignment35();
		String input = "i have 15 years and 3 months of experience";
		System.out.println("Input String is: '" + input + "'");
		System.out.println("------------------------------------------------------");
		System.out.println(
				"Sum of all numbers from given string is: " + assignment35.getSumOfAllNumbersFromString(input));
		System.out.println("-----------------------------------------------------");
		System.out.println("Sum of all digit from given string is: " + assignment35.getSumOfAllDigitFromString(input));
	}
}
