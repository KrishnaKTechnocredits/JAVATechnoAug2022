/*Assignment 17 :-
 * Program 1 : Write a method to return reverse name
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
package ankitaBarwad;

public class ReverseStringExample {

	// method to return reverse string
	String getReverseString(String str) {
		String reverseStr = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			reverseStr = reverseStr + str.charAt(index);
		}
		return reverseStr;
	}

	// method to return even position characters from given String
	String getEvenCharactersString(String str) {
		String evenChar = "";
		for (int index = 0; index <= str.length() - 1; index++) {
			if (index % 2 != 0)
				evenChar = evenChar + str.charAt(index);
		}
		return evenChar;
	}

	// method to return even position characters from given String in reverse
	String getEvenReverseString(String str) {
		String evenReverse = "";
		String evenString = getEvenCharactersString(str);
		evenReverse = getReverseString(evenString);
		return evenReverse;
	}

	// method to return count of digits in a given string
	int getDigitCount(String str) {
		int count = 0;
		boolean flag;
		for (int index = 0; index <= str.length() - 1; index++) {
			flag = Character.isDigit(str.charAt(index));
			if (flag == true)
				count++;
		}
		return count;
	}

	// method to return sum of digits in a given string
	int getDigitSum(String str) {
		int sum = 0, digit = 0;
		char ch;
		boolean isDigit = true;
		for (int index = 0; index <= str.length() - 1; index++) {
			ch = str.charAt(index);
			isDigit = Character.isDigit(ch);
			if (isDigit) {
				digit = Character.getNumericValue(ch);
				sum = sum + digit;
			}
		}
		return sum;
	}

	// main method
	public static void main(String[] args) {

		String str = "";

		ReverseStringExample reverseStringExample = new ReverseStringExample();

		str = "Java";
		System.out.println("String : " + str + ", Reverse String : " + reverseStringExample.getReverseString(str));

		str = "Interesting";
		System.out.println("String : " + str + ", Even Characters String : " + reverseStringExample.getEvenCharactersString(str));

		str = "Hardwork";
		System.out.println(	"String : " + str + ", Even Reverse String : " + reverseStringExample.getEvenReverseString(str));

		str = "Digits12sum34";
		System.out.println("String : " + str + ", Digit Count : " + reverseStringExample.getDigitCount(str));

		str = "Assignment17On7_9_2022";
		System.out.println("String : " + str + ", Digit Sum : " + reverseStringExample.getDigitSum(str));
	}
}
