package harshalRane.Assignments.assignment17MultipleStringOperations;

public class Assignment17 {

	static String reverseName(String name) {
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

	static String reverseEvenChar(String evenStr) {
		String str = evenChar(evenStr);
		String reverseEvenString = reverseName(str);
		return reverseEvenString;
	}

	int getDigitCount(String name) {
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
		Assignment17 assignment17 = new Assignment17();
		String name1 = "Harshal";
		String name2 = "technocredits";
		String name3 = "Te8chno3cred7it9s";

		System.out.println("Reverse String of " + name1 + " is: \n" + Assignment17.reverseName(name1));
		System.out.println("------------------------------------");
		System.out.print("Even position characters from " + name2 + " are: \n" + Assignment17.evenChar(name2));
		System.out.println("\n------------------------------------");
		System.out.print("Reverse of " + name2 + " are: \n" + Assignment17.reverseEvenChar(name2));
		System.out.println("\n------------------------------------");
		System.out.println("Digits Count in " + name3 + " are: \n" + assignment17.getDigitCount(name3));
		System.out.println("------------------------------------");
		System.out.println("Sum of Digits in " + name3 + " are: \n" + assignment17.sumOfDigits(name3));
	}
}
