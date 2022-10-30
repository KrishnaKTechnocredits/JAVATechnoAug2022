/*Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18
Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
if we couldn't covert string to int for any word, it throws NumberFormatException.

Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9
Hint : Using Exception handling
*/
package rohanNaik.Assignments;

public class Assignment35Exception {

	int getSum(String input) {
		int sum = 0;

		String[] arr = input.split(" ");

		for (int index = 0; index < arr.length; index++) {

			try {
				int n = Integer.parseInt(arr[index]);
				sum = sum + n;
			} catch (NumberFormatException nfe) {

			}
		}

		return sum;
	}

	public static void main(String[] args) {
		String input = "i have 15 years and 3 months of experience";
		Assignment35Exception obj = new Assignment35Exception();
		int sum = obj.getSum(input);
		System.out.println(sum);
	}

}
