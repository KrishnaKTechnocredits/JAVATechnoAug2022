package pujaSah.assignments20_30;

public class CountDigitsInString {

	int getCountOfDigitsInString(String name) {
		int count = 0;
		int length = name.length();
		for (int i = 0; i <= length - 1; i++) {
			char ch = name.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "te8chno3cred7it9s";
		int count = new CountDigitsInString().getCountOfDigitsInString(str);
		System.out.println("The count of digits in String " + str + " is " + count);
	}
}
