/*
 * Assignment - 35 : 7th Oct'2022

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
package hindaviIngle;

public class Assignment35 {
//	Program 1 : return sum of all the numbers from given String.

	int sumOfNumFromString(String name) {
		int sum = 0;
		String strArry[] = name.split(" ");
		for (int index = 0; index < strArry.length; index++) {
			try {
				sum = sum + Integer.parseInt(strArry[index]);
			} catch (NumberFormatException ae) {
				// System.out.println("test");
			}
		}
		return sum;
	}

//	Program 2: return sum of all the digits from given String.
	int sumOfAllDigit(String name) {
		int sum = 0;
		String strArry[] = name.split(" ");
		for (int index = 0; index < strArry.length; index++) {
			for (int j = 0; j < strArry[index].length(); j++) {
				try {
					char ch = strArry[index].charAt(j);
					sum = sum + Integer.parseInt(String.valueOf(ch));
				} catch (NumberFormatException ae) {
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment35 a35 = new Assignment35();
		String input = "i have 15 years and 3 months of experience";
		System.out.println(input);
		int output = a35.sumOfNumFromString(input);
		System.out.println("sumOfNumFromString : " + output);
		System.out.println("----------------------------------------------");
		String str = "i have 15 years and 3 months of experience";
		System.out.println(str);
		int sum = a35.sumOfAllDigit(str);
		System.out.println("sumOfAllDigit : " + sum);
	}

}
