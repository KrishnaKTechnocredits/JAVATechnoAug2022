/*Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18
Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
if we couldn't covert string to int for any word, it throws NumberFormatException.

*/
package smitaVetal.Assignment31_40;

public class Assignment35_1 {

	int returnSumOfNumbers(String input) {
		String[] inputArr = input.split(" ");
		int sum = 0;
		int num = 0;
		System.out.print("Total sum of numbers in String -  ");
		for (int index = 0; index < inputArr.length; index++) {
			try {
				num = Integer.parseInt(inputArr[index]);

				sum = sum + num;
			} catch (NumberFormatException ne) {
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment35_1 assignment35 = new Assignment35_1();
		String input = "I have 15 years and 3 months of experience";
		System.out.println("Input String: - " + input);
		System.out.println(assignment35.returnSumOfNumbers(input));
	}
}
