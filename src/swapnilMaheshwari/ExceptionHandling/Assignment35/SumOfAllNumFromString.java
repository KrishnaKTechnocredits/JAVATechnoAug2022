/*
 Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18
Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
if we couldn't covert string to int for any word, it throws NumberFormatException.

 */

package swapnilMaheshwari.ExceptionHandling.Assignment35;

public class SumOfAllNumFromString {
	int getSumOfAllNumFromString(String str) {
		int sum = 0;
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			try {
				int c = Integer.parseInt(strArr[i]);
				sum = sum + c;
			} catch (NumberFormatException nb) {
				// System.out.println("String is not converted into integer , please try again");
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		String input = "i have 15 years and 3 months of experience.";
		System.out.println(" Sum of All digits in the String is:" + new SumOfAllNumFromString().getSumOfAllNumFromString(input));
	}
}
