package amolMule.stringProg;

public class SumDigitStr {

	int getSum(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int numericValue = Character.getNumericValue(ch);
				sum = sum + numericValue;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumDigitStr digit = new SumDigitStr();
		int a = digit.getSum("Tech2No7crEDI85t");
		System.out.println("Sum of digit in given numbers are: " + a);
	}
}
