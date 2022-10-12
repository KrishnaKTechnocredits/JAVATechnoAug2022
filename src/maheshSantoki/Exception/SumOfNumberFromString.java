/*Program 1 : return sum of all the numbers from given String.
	input : i have 15 years and 3 months of experience.
	output : 18
	Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
	if we couldn't covert string to int for any word, it throws NumberFormatException.
*/
package maheshSantoki.Exception;

public class SumOfNumberFromString {
	int getsumnumbers(String str) {
		String[] strsplit = str.split(" ");
		int sum = 0;
		for (int index = 0; index < strsplit.length; index++) {

			try {
				sum += Integer.parseInt(strsplit[index]);

			} catch (NumberFormatException nfe) {
				nfe.getMessage();
			}

		}
		return sum;
	}

//Program 2: return sum of all the digits from given String.
	int getsumalldigit(String str) {
		String[] strsplit = str.split(" ");
		int sum = 0, num = 0;
		for (int index = 0; index < strsplit.length; index++) {

			try {
				num = Integer.parseInt(strsplit[index]);

			} catch (NumberFormatException nfe) {
				nfe.getStackTrace();
			}

			while (num > 0) {
				sum += (num % 10);
				num = (num / 10);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfNumberFromString sum1 = new SumOfNumberFromString();
		String str = "I have 15 years and 3 months of experience.";
		System.out.println("Given String : " + str);
		System.out.println("Sum of all numbers from given string : " + sum1.getsumnumbers(str));

		System.out.println("Sum of all digit from given string : " + sum1.getsumalldigit(str));
	}
}
