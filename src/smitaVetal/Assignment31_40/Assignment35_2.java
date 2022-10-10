/*Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 1 + 5 + 3 - 9
Hint : Using Exception handling
*/
package smitaVetal.Assignment31_40;

public class Assignment35_2 {

	int returnSumOfAllDigits(String input) {
		String[] inputArr = input.split(" ");
		int sum = 0;
		int num = 0;
		System.out.print("Sum of Digits present in string is -  ");
		// Outer for loop to traverse through the array
		for (int index = 0; index < inputArr.length; index++) {
			// Inner for loop to find the digits in the array
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
		Assignment35_2 assignment35 = new Assignment35_2();
		String input = "I have 15 years and 3 months of experience";
		System.out.println("Input String: - " + input);
		System.out.println(assignment35.returnSumOfAllDigits(input));
	}
}
