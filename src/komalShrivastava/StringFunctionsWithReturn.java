//Assignment 17 

package komalShrivastava;

public class StringFunctionsWithReturn {

	// method to return reverse name

	String reverseString(String stringInput) {
		String rev = "";
		for (int index = stringInput.length() - 1; index >= 0; index--) {
			rev = rev + stringInput.charAt(index);
		}
		return rev;
	}

	// method to return even position characters from given String

	String evenChar(String stringInput) {
		String var = "";
		for (int index = 0; index < stringInput.length(); index++) {
			if (index % 2 != 0)
				var = var + stringInput.charAt(index);
		}
		return var;
	}

	// method to return even position characters from given String in reverse

	String revEvenChar(String stringInput) {
		String revVar = "";
		for (int index = stringInput.length() - 1; index >= 0; index--) {
			if (index % 2 != 0)
				revVar = revVar + stringInput.charAt(index);
		}
		return revVar;
	}

	// method to return count of digits in a given string

	int getDigitCount(String stringInput) {
		int count = 0;
		for (int index = 0; index < stringInput.length(); index++) {
			char ch = stringInput.charAt(index);
			if (Character.isDigit(ch))
				count++;
		}
		return count;

	}

	// method to return sum of digits in a given string

	int getSumOfDigitsInString(String stringInput) {
		int sum = 0;
		for (int index = 0; index < stringInput.length(); index++) {
			char ch = stringInput.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		StringFunctionsWithReturn stringFunctionsWithReturn = new StringFunctionsWithReturn();
		
		String input1 = "TechnoCredits";
		System.out.println("Reverse of " + input1 + " is : " + stringFunctionsWithReturn.reverseString(input1));
		System.out.println("Characters at Even position in " + input1 + " are : " + stringFunctionsWithReturn.evenChar(input1));
		System.out.println("Reverse of Characters at Even position in " + input1 + " are : " + stringFunctionsWithReturn.revEvenChar(input1));
		
		String input2 = "Tec1hno290Cre99dits08";
		System.out.println("Digit count in " + input2 + " is : " + stringFunctionsWithReturn.getDigitCount(input2));
		System.out.println("Sum of Digits in " + input2 + " is : " + stringFunctionsWithReturn.getSumOfDigitsInString(input2));
	}
}
