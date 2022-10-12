/* Assignment - 35 : 7th Oct'2022

Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18
Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
if we couldn't covert string to int for any word, it throws NumberFormatException.

Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9
Hint : Using Exception handling */
package pujaSah.assignments31_40;

public class ExceptionHandling {

	// method to return sum of all the numbers from given String.
	int getSumOfNumbersInString(String str) {
		String[] arr = str.split(" ");
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			try {
				sum += Integer.parseInt(arr[index]);
			} catch (NumberFormatException ne) {
				ne.getMessage();
			}
		}
		return sum;
	}

	// method to return sum of all the digits from given String.
	int getSumOfDigitsInstring(String str) {
		String[] arr = str.split(" ");
		int sum = 0;
		int num = 0;
		for (int index = 0; index < arr.length; index++) {
			try {
				num = Integer.parseInt(arr[index]);
			} catch (NumberFormatException ne) {
				ne.getMessage();
			}
			while (num > 0) {
				sum += (num % 10);
				num = num / 10;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		ExceptionHandling demo = new ExceptionHandling();

		String str = "i have 15 years and 3 months of experience.";
		System.out.println("Input String: " + str);

		System.out.println("Sum of numbers in the given string: " + demo.getSumOfNumbersInString(str));

		System.out.println("Sum of digits in the string: " + demo.getSumOfDigitsInstring(str));
	}
}
