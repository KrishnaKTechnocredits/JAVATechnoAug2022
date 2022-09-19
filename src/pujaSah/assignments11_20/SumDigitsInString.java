package pujaSah.assignments11_20;

public class SumDigitsInString {
	
	int getSumOfDigitsInString(String name) {
		int length = name.length();
		int sum = 0;
		for (int i = 0; i <= length - 1; i++) {
			char ch = name.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String str = "te8chno3cred7it9s";
		int sum = new SumDigitsInString().getSumOfDigitsInString(str);
		System.out.println("The sum of digits in String " + str + " is " + sum);
	}
}

