/*
 * Assignment - 17 : 7th Sep'2022

Program 1 : Write a method to return reverse name
input : Maulik
output : kiluaM

Program 2 : Write a method to return even position characters from given String. 
input : technocredits
output : ehordt

Program 3 : Write a method to return even position characters from given String in reverse.
input : technocredits
output : tdrohe

Program 4 : Write a method to return count of digits in a given string.
input : "Te8chno3cred7it9s"
output : 4

Program 5 : Write a method to return sum of digits in a given string.
input : "Te8chno3cred7it9s"
output : 27
Hint : ch = Character.charAt(index);
Character.isDigit(ch);
int num = Character.getNumericValue(ch); '9'
 */
package rahulSaswadkar;

public class StringProgram2 {
	public static void main(String[] args) {
		StringProgram2 stringProgram2 = new StringProgram2();
		String str = "Maulik";
		String str1 = "technocredits";
		String str2 = "Te8chno3cred7it9s";

		// stringProgram2.getReverseName(str);

		// String revName = stringProgram2.getReverseName1(str);
		System.out.println("Reverse Name of Name " + str + " is : " + stringProgram2.getReverseName1(str));

		// String oddCharOfName = stringProgram2.getOddIndexCharacters(str1);
		System.out.println("\nOdd characters of Name " + str1 + " is : " + stringProgram2.getOddIndexCharacters(str1));

		// String oddCharOfNameRev =
		// stringProgram2.getOddIndexCharacters(stringProgram2.getReverseName1(str1));
		System.out.println("\nOdd characters of Name in Reverse " + str1 + " is : "
				+ stringProgram2.getOddIndexCharacters(stringProgram2.getReverseName1(str1)));

		System.out.println("\nCount of digits in a given string " + str2 + " is : " + stringProgram2.getDigitCount(str2));

		System.out.println("\nSum of digits in a given string " + str2 + " is : " + stringProgram2.getDigitSum(str2));

	}

	void getReverseName(String str) {
		for (int index = str.length() - 1; index >= 0; index--) {
			System.out.print(str.charAt(index));
		}

	}

	String getReverseName1(String str) {
		String revName = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			// System.out.print(str.charAt(index));
			revName = revName + str.charAt(index);
		}
		return revName;
	}

	String getOddIndexCharacters(String str) {
		String oddCharOfName = "";
		for (int oddIndex = 1; oddIndex <= str.length() - 1; oddIndex += 2) {
			oddCharOfName = oddCharOfName + str.charAt(oddIndex);
		}
		return oddCharOfName;
	}

	int getDigitCount(String str2) {
		int count = 0;
		char ch = 'a';
		boolean isDigitFlag = false;

		for (int index = 0; index <= str2.length() - 1; index++) {
			ch = str2.charAt(index);
			isDigitFlag = Character.isDigit(ch);
			if (isDigitFlag) {
				count += 1;
			}
        }
		return count;
	}

	int getDigitSum(String str2) {
		int sum = 0;
		char ch = 'a';
		boolean isDigitFlag = false;
		for (int index = 0; index <= str2.length() - 1; index++) {
			ch = str2.charAt(index);
			isDigitFlag = Character.isDigit(ch);
			if (isDigitFlag) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
        return sum;
	}
}
