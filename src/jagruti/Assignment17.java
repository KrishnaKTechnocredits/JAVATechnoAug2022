package jagruti;
public class Assignment17
{
	static String revName(String name) {
		String revName = "";
		for (int index = name.length() - 1; index >= 0; index--) {
			revName = revName + name.charAt(index);
		}
		return revName;
	}

	static String evenChar(String evenStr) {
		int len = evenStr.length();
		String str = "";

		for (int index = 1; index < len; index = index + 2) {
			str = str + evenStr.charAt(index);
		}
		return str;
	}

	static String revEvenChar(String evenStr) {
		String str = evenChar(evenStr);
		String reverseEvenString = revName(str);
		return reverseEvenString;
	}

	int getCountOfDigit(String name) {
		int count = 0;
		for (int index = 0; index <= name.length() - 1; index++) {
			if (Character.isDigit(name.charAt(index))) {
				count++;
			}
		}
		return count;
	}

	int sumOfDigits(String name) {
		int sum = 0;
		for (int index = 0; index <= name.length() - 1; index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment17 ass17 = new Assignment17();
		String strName1 = "Jagruti";
		String strName2 = "technocredits";
		String strName3 = "Te8chno3cred7it9s";

		System.out.println("Reverse String of " + strName1 + " is: " + Assignment17.revName(strName1));
		System.out.println();
		System.out.println("Even position characters from " + strName2 + " are: " + Assignment17.evenChar(strName2));
		System.out.println();
		System.out.println("Reverse of even position " + strName2 + " are: " + Assignment17.revEvenChar(strName2));
		System.out.println();
		System.out.println("Digits Count in " + strName3 + " are: " + ass17.getCountOfDigit(strName3));
		System.out.println();
		System.out.println("Sum of Digits in " + strName3 + " are: " + ass17.sumOfDigits(strName3));
	}
}
