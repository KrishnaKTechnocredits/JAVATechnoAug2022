package akankshaVyas.Arraypkg;

public class NoDigtNoUpperCase {

	boolean getStringWithNoDigit(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				return false;
		}
		return true;
	}

	boolean getStringWithNoUpperCase(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch))
				return false;
		}
		return true;
	}

	void printStringWithNoDigitAndUpperCase(String str) {
		System.out.println("The string with no digit and no upper case is - ");
		String[] str1 = str.split(" ");
		for (int index = 0; index < str1.length; index++) {
			if ((getStringWithNoDigit(str1[index]) && getStringWithNoUpperCase(str1[index]))) {
				System.out.println(str1[index]);
			}
		}
	}

	public static void main(String[] args) {
		new NoDigtNoUpperCase()
				.printStringWithNoDigitAndUpperCase("Good mor9ning techno fr3iends t2Hi2s is tEchnocredits");

	}
}
