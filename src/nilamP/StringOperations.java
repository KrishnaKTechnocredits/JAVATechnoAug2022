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
int num = Character.getNumericValue(ch); '9
*/
package nilamP;

import java.util.Iterator;

public class StringOperations {

	String getReverseString(String name) {
		String reverseName = " ";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverseName = reverseName + name.charAt(i);

		}
		return reverseName;

	}

	String getEvenPositions(String evenchar) {

		int len = evenchar.length();
		String s = " ";
		for (int i = 1; i < len; i = i + 2) {
			s = s + evenchar.charAt(i);
		}

		return s;
	}

	String getReverseEvenPosition(String evencharrev) {
		String str = getEvenPositions(evencharrev);
		String reverseEvenString = getReverseString(str);
		return reverseEvenString;
	}

	int getCount(String name) {
		int count = 0;
		for (int i = 0; i <= name.length() - 1; i++) {
			if (Character.isDigit(name.charAt(i))) {
				count++;

			}

		}
		return count;
	}

	int getSumOfDigits(String name) {
		int sum = 0;
		for (int i = 0; i <= name.length() - 1; i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}

	public static void main(String args[]) {
		StringOperations so = new StringOperations();
		System.out.println("Reverse String : " + so.getReverseString("Nilam"));
		System.out.println("Even Position of characters : " + so.getEvenPositions("technocredits"));
		System.out.println("Reverse Even Position of characters : " + so.getReverseEvenPosition("technocredit"));
		System.out.println("Digit Count in String : " + so.getCount("Te8chno3cred7it9s"));
		System.out.println("Sum Of Digit Count in String : " + so.getSumOfDigits("Te8chno3cred7it9s"));
	}
}

