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

package deepakPatil;

public class StringClassExample1 {

	static String getReverseName(String name) {
		String reverseName = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			reverseName = reverseName + ch;
		}
		return reverseName;
	}

	static String getEvenPositionChar(String name) {

		String evenPositionChar = "";

		for (int i = 1; i < name.length(); i = i + 2) {
			evenPositionChar = evenPositionChar + name.charAt(i);
		}
		return evenPositionChar;
	}

	String getEvenPostitionCharInReverse(String name) {

		String evenChar = getEvenPositionChar(name);
		String reverseChar = getReverseName(evenChar);
		return reverseChar;
	}

	int getCountOfDigit(String name) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch))
				count++;
		}
		return count;
	}

	int getSumOfDigitInStirng(String name) {
		int sum = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch))
				sum = sum + Character.getNumericValue(ch);
		}
		return sum;
	}

	public static void main(String[] args) {
		StringClassExample1 stringClassExample1 = new StringClassExample1();

		String name = "Deepak";
		System.out.println("Reverse of " + name + " is " + getReverseName("Deepak"));

		name = "technocredits";
		System.out.println("Even position characters in '" + name + "' is : " + getEvenPositionChar(name));
		System.out.println("Reverse of even position charactres in '" + name + "' is : "
				+ stringClassExample1.getEvenPostitionCharInReverse(name));

		name = "Te8chno3cred7it9s";
		System.out.println("Count of digit in '" + name + "' is : " + stringClassExample1.getCountOfDigit(name));
		System.out.println("Sum of digit present in '" + name + "' is : " + stringClassExample1.getSumOfDigitInStirng(name));
	}
}
