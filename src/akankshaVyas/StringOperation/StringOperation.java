package akankshaVyas.StringOperation;

public class StringOperation {

	String getReverseName(String str) {
		String reverseName = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			reverseName = reverseName + str.charAt(index);
		}
		return reverseName;
	}

	String getOddPositionString(String str) {
		String oddName = "";

		for (int index = 0; index <= str.length() - 1; index++) {
			if (index % 2 == 0) {
				oddName = oddName + str.charAt(index);
			}
		}
		return oddName;
	}

	String getEvenPositionString(String str) {
		String evenName = "";

		for (int index = 1; index <= str.length() - 1; index = index + 2) {
			if (index % 2 != 0) {
				evenName = evenName + str.charAt(index);
			}
		}
		return evenName;
	}

	String getEvenPositionStringByAdding2(String str) {
		String evenName = "";

		for (int index = 1; index <= str.length() - 1; index = index + 2) {
			evenName = evenName + str.charAt(index);
		}
		return evenName;
	}

	String getReverseEvenPositionString(String str) {
		String evenReverseName = "";

		for (int index = str.length() - 1; index >= 0; index--) {
			if (index % 2 != 0) {
				evenReverseName = evenReverseName + str.charAt(index);
			}
		}
		return evenReverseName;
	}

	int getCountOfDigit(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch) == true) {
				count++;
			}
			;
		}
		return count;

	}

	int getSumOfDigitFromString(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch) == true) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		System.out.print(new StringOperation().getReverseName("MAULIK"));
		System.out.print("\n" + new StringOperation().getOddPositionString("technocredits"));
		System.out.print("\n" + new StringOperation().getEvenPositionString("technocredits"));
		System.out.print("\n" + new StringOperation().getEvenPositionStringByAdding2("technocredits"));
		System.out.print("\n" + new StringOperation().getReverseEvenPositionString("technocredits"));
		System.out.print("\n" + new StringOperation().getCountOfDigit("Te8chno3cred7it9s"));
		System.out.print("\n" + new StringOperation().getSumOfDigitFromString("Te8chno3cred7it9s"));
	}

}
