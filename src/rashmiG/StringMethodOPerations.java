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
int num = Character.getNumericValue(ch); '9'*/

package rashmiG;

class StringMethodOPerations {

	String getNameReverse(String inputName) {
		String reverseName = "";
		for (int index = inputName.length() - 1; index >= 0; index--) {
			reverseName = reverseName + inputName.charAt(index);
		}
		return reverseName;
	}

	String getEvenPositionCharacters(String inputName) {
		String evenPositionName = "";
		for (int index = 1; index <= inputName.length() - 1; index++) {
			if (index % 2 != 0) {
				evenPositionName = evenPositionName + inputName.charAt(index);
			}
		}
		return evenPositionName;
	}

	String getReverseEvenPositionCharacters(String inputName) {
		String reverseEvenPosName = "";
		for (int index = inputName.length() - 2; index >= 0; index = index - 2) {
			if (index % 2 != 0) {
				reverseEvenPosName = reverseEvenPosName + inputName.charAt(index);
			}
		}
		return reverseEvenPosName;
	}

	int getDigitCount(String name) {
		int digitCount = 0;
		for (int index = 0; index <= name.length() - 1; index++) {
			char ch = name.charAt(index);
			// boolean isDigitFlag = Character.isDigit(ch);
			// if(Character.isDigit(name.charAt(index))
			if (Character.isDigit(ch)) {
				digitCount++;
			}
		}
		return digitCount;
	}

	int getSumOfDigits(String name) {
		int sum = 0;
		for (int index = 0; index <= name.length() - 1; index++) {
			if (Character.isDigit(name.charAt(index))) {
				sum = sum + Character.getNumericValue(name.charAt(index));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Reverse string : " + new StringMethodOPerations().getNameReverse("Rashmi"));
		StringMethodOPerations operations = new StringMethodOPerations();
		String evenPosName = operations.getEvenPositionCharacters("technocredits");
		System.out.println("Even position : " + evenPosName);
		System.out.println("Reverse even position : " + operations.getReverseEvenPositionCharacters("technocredits"));
		System.out.println("Number of digits : " + operations.getDigitCount("Te8chno3cred7it9s"));
		System.out.println("Sum of digits : " + operations.getSumOfDigits("Te8chno3cred7it9s"));
	}
}
