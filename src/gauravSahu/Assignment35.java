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

package gauravSahu;

public class Assignment35 {

	int getSum(String str) {
		int sum = 0;
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++)
			try {
				sum = sum + Integer.parseInt(str1[i]);
				return sum;
			} catch (NumberFormatException ae) {

			}

		return sum;

	}

	public static void main(String[] args) {
		Assignment35 a35 = new Assignment35();
		String input = "i have 15 years and 3 months of experience";
		System.out.println("Given String is : " + input);
		int sum = a35.getSum(input);
		System.out.println(" Sum of all integer in given array is :  " + sum);
	}
}
