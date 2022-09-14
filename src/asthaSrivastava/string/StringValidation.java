/*Program 1 : Write a method to return reverse name
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
package asthaSrivastava.string;

public class StringValidation {

	String reverseName(String name) { // Program 1
		String reverseName = "";
		for (int index = name.length() - 1; index >= 0; index--) {
			reverseName = reverseName + name.charAt(index);
		}
		return reverseName;
	}

	String getEvenChar(String str) { // Program 2
		int length = str.length();
		String evenChar = "";
		for (int index = 0; index < length; index++) {
			if (index % 2 != 0) {
				evenChar = evenChar + str.charAt(index);
			}
		}
		return evenChar;
	}

	int getNumericValue(String name) { // Program 3

		int length = name.length();
		int count = 0;
		for (int i = 0; i < length; i++) {
			char ch = name.charAt(i);

			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				count++;
			} else {
				i++;
			}

		}
		return count;
	}

	int getSum(String name) { // Program 4
		int length = name.length();
		int sum = 0;

		for (int i = 0; i < length; i++) {
			char ch = name.charAt(i);

			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				int num = Character.getNumericValue(ch);

				sum = sum + num;
			} else {
				i++;
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		String result = new StringValidation().reverseName("Maulik");
		System.out.println("Reverse of given string is" + result);
		System.out.println("----------------");

		String result1 = new StringValidation().getEvenChar("Technocredits");
		System.out.println("Even character in Technocredits  is :" + result1);
		System.out.println("----------------");

		String result2 = new StringValidation().reverseName(result1);
		System.out.println("Reverse of above String is :" + result2);
		System.out.println("----------------");

		int result3 = new StringValidation().getNumericValue("Te8chno3cred7it9s");
		System.out.println("Count of Digits in String is :" + result3);
		System.out.println("----------------");

		int result4 = new StringValidation().getSum("Te8chno3cred7it9s");
		System.out.println("Sum of count of Digits in String is :" + result4);

	}
}
