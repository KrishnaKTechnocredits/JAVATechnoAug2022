/*Assignment - 35 : 7th Oct'2022

Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18
Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
if we couldn't covert string to int for any word, it throws NumberFormatException.

Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9
Hint : Using Exception handling*/
package ankitaBarwad;

public class ExceptionHandling {

	public static void main(String[] args) {
		ExceptionHandling exceptionHandling = new ExceptionHandling();
		String str = "i have 15 years and 3 months of experience";
		System.out.println("Sum of numbers = " + exceptionHandling.sumOfNumbersInString(str));
		System.out.println("Sum of digits = " + exceptionHandling.sumOfDigitsInString(str));
	}

	private int sumOfNumbersInString(String str) {
		System.out.println("Input String : " + str);
		int sum = 0;
		String[] strArray = str.split(" ");
		for (int index = 0; index < strArray.length; index++) {
			try {
				sum = sum + Integer.parseInt(strArray[index]);
			} catch (NumberFormatException nfe) {

			}
		}
		return sum;
	}

	private int sumOfDigitsInString(String str) {
		int sum = 0;
		String[] arr = str.split(" ");

		for (int index = 0; index < arr.length; index++) {
			String str1 = arr[index];
			for (int innerIndex = 0; innerIndex < str1.length(); innerIndex++) {
				try {
					String s1 = Character.toString(str1.charAt(innerIndex));
					sum = sum + Integer.parseInt(s1);
				} catch (NumberFormatException ne) {
					innerIndex++;
				} catch (StringIndexOutOfBoundsException se) {
					innerIndex++;
				}
			}
		}
		return sum;
	}
}
