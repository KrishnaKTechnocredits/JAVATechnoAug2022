/*Assignment - 35 :

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

package apurvaBabel;

public class Assignment35 {

	// Program 1 : Method to return sum of all numbers from given string
	int getSumOfNumbers(String input) {
		int sum = 0;
		int num = 0;
		System.out.println("Input : " + input);
		String[] inputArr = input.split(" ");

		for (int index = 0; index < inputArr.length; index++) {
			try {
				num = Integer.parseInt(inputArr[index]);
				sum = sum + num;
			} catch (NumberFormatException ne) {

			}
		}
		return sum;
	}

	// Program 2 : Method to return sum of all digits from given string
	int getSumOfDigits(String input) {
		int sum = 0;
		int num = 0;
		System.out.println("Input : " + input);
		String[] inputArr = input.split(" ");

		for (int index = 0; index < inputArr.length; index++) {
			for (int innerIndex = 0; innerIndex < inputArr[index].length(); innerIndex++) {
				try {
					char ch = inputArr[index].charAt(innerIndex);
					num = Integer.parseInt(String.valueOf(ch));
					sum = sum + num;
				} catch (NumberFormatException ne) {

				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment35 assignment35 = new Assignment35();
		String input = "i have 15 years and 3 months of experience.";
		int sum = assignment35.getSumOfNumbers(input);
		System.out.println("Sum of numbers from given string --> " + sum);
		System.out.println("----------------------------------------------------");
		int sum2 = assignment35.getSumOfDigits(input);
		System.out.println("Sum of digits from given string --> " + sum2);
	}
}
