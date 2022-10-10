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

package sanket;

public class Assignment35ExceptionHandlingEx1 {

	int getSumOfNumbersInString(String str) {

		String[] arr = str.split(" ");
		int num = 0;
		int sum = 0;

		for (int index = 0; index < arr.length; index++) {
			try {
				num = Integer.parseInt(arr[index]);
				if (num > 0) {
					sum = sum + num;
					num = 0;
				}
			} catch (NumberFormatException nf) {

			}
		}
		return sum;
	}

	int getSumOfDigitsInString(String str) {

		String[] arr = str.split(" ");
		int num = 0;
		int sum = 0;
		int reminder = 0;

		for (int index = 0; index < arr.length; index++) {
			try {
				num = Integer.parseInt(arr[index]);
				if (num > 0) {
					while (num > 0) {
						reminder = num % 10;
						sum = sum + reminder;
						num = num / 10;
					}
				}
			} catch (NumberFormatException nf) {

			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String input = "i have 15 years and 3 months of experience";

		System.out.println("***Program 1 Solution***");
		System.out.println("The input string is : " + input);
		System.out.println(
				"The addition of numbers in above string : " + new Assignment35ExceptionHandlingEx1().getSumOfNumbersInString(input));

		System.out.println("\n");

		System.out.println("***Program 2 Solution***");
		System.out.println("The input string is : " + input);
		System.out.println(
				"The addition of digit in above string : " + new Assignment35ExceptionHandlingEx1().getSumOfDigitsInString(input));
	}
}
