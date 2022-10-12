package shubhamG.Assignment31to40;

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
public class Assignment35ExceptionHandelling1 {
   //Program 1 : return sum of all the numbers from given String.
	int getSumOfAllNumberFromString(String str) {
		int sum = 0;
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			try {
				sum = sum + Integer.parseInt(arr[i]);
				return sum;
			} catch (NumberFormatException ae) {
			}
		}
		return sum;
	}
    //Program 2: return sum of all the digits from given String.

	int getSumOfAlldigitsPresentInString(String str) {
		int sum1 = 0;
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				try {
					char ch = arr[i].charAt(j);
					sum1 = sum1 + Integer.parseInt(String.valueOf(ch));

				} catch (NumberFormatException ae) {
				}
			}
		}
		return sum1;
	}

	public static void main(String[] args) {
		Assignment35ExceptionHandelling1 exception = new Assignment35ExceptionHandelling1();
		String input = "I have 15 years and 3 months of experience";
		System.out.println("Input String is : " + input);
		System.out.println(
				"\nSum of numbers present in given string is : " + exception.getSumOfAllNumberFromString(input));
		System.out.println(
				"Sum of all digits present in given string is : " + exception.getSumOfAlldigitsPresentInString(input));

	}
}
