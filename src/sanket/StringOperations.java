/*Assignment - 17 : 7th Sep'2022

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


package sanket;

public class StringOperations {

	//method to return reverse name

	String reverseName(String name) {

		String revName = "";
		for (int index = name.length() - 1; index >= 0; index--) {
			revName = revName + name.charAt(index);
		}
		return revName;
	}

	//method to return even position characters from given String

	String getEvenChar(String name) {

		String evenPostionChar = "";
		for (int index = 0; index <= name.length() - 1; index++) {

			if (index % 2 != 0)
				evenPostionChar = evenPostionChar + name.charAt(index);
		}
		return evenPostionChar;
	}


	//method to return even position characters from given String in reverse

	String getEvenCharReverse(String name) {

		String evenPostionChar = "";
		for (int index = name.length() - 1; index >= 0; index--) {

			if (index % 2 != 0)
				evenPostionChar = evenPostionChar + name.charAt(index);
		}
		return evenPostionChar;
	}

	//method to return count of digits in a given string

	int getCountOfDigitInString(String name) {

		int count = 0;
		for (int index = 0; index <= name.length() - 1; index++) {

			if (Character.isDigit(name.charAt(index)))
				count++;
		}
		return count;
	}

	//method to return sum of digits in a given string.

	int sumOfDigitInString(String name) {

		int sum = 0;
		char ch = 0;
		for (int index = 0; index <= name.length() - 1; index++) {

			if (Character.isDigit(name.charAt(index))) {
				ch = name.charAt(index);
				sum = sum + Character.getNumericValue(ch);
				ch++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		StringOperations stringOperations1 = new StringOperations();

		String revString = stringOperations1.reverseName("technocredits");
		System.out.println("Reverse name for 'technocredits' string are : " + revString);

		String evenString = stringOperations1.getEvenChar("technocredits");
		System.out.println("Even position chracters for 'technocredits' string are : " + evenString);

		String evenPositionStringReverse = stringOperations1.getEvenCharReverse("technocredits");
		System.out.println("Even position chracters in reverse order for 'technocredits' string are : " + evenPositionStringReverse);

		int getCountOfDigitInString = stringOperations1.getCountOfDigitInString("Te8chno3cred7it9s");
		System.out.println("Total digits in string 'Te8chno3cred7it9s' are : " + getCountOfDigitInString);

		int sumOfDigitInString = stringOperations1.sumOfDigitInString("Te8chno3cred7it9s");
		System.out.println("Total digits in string 'Te8chno3cred7it9s' are : " + sumOfDigitInString);
	}
}