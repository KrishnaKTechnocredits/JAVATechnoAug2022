package rohanNaik.Assignments;

public class Assignment17String {

	String reverseName(String name) {

		String str = "";

		for (int index = name.length() - 1; index >= 0; index--) {
			// System.out.print(name.charAt(index));
			str = str + name.charAt(index);
		}

		return str;
	}

	String nameEven(String name) {

		String str = "";

		for (int index = 0; index <= name.length() - 1; index++) {
			if (index % 2 == 1)
				str = str + name.charAt(index);
		}

		return str;
	}

	String reverseOfNameEven(String name) {

		String str = "";
		String rstr = "";

		for (int index = 0; index <= name.length() - 1; index++) {
			if (index % 2 == 1)
				str = str + name.charAt(index);
		}

		for (int index = str.length() - 1; index >= 0; index--) {

			rstr = rstr + str.charAt(index);
		}
		return rstr;
	}

	int getCountOfDigits(String name) {

		String str = name;
		int count = 0;
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			boolean isDigitFlag = Character.isDigit(ch);
			if (isDigitFlag == true)
				count++;
		}

		return count;

	}
	
	int getSumofDigits(String name) {
		
		String str = name;
		int sum = 0;
		
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			boolean isDigitFlag = Character.isDigit(ch);
			if (isDigitFlag == true) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		Assignment17String reverse = new Assignment17String();
		String outputA = reverse.reverseName("technocredits");
		System.out.println(outputA);

		String outputB = reverse.nameEven("technocredits");
		System.out.println(outputB);

		String outputC = reverse.reverseOfNameEven("technocredits");
		System.out.println(outputC);

		int outputd = reverse.getCountOfDigits("Te8chno3cred7it9s");
		System.out.println(outputd);
		
		int outpute = reverse.getSumofDigits("Te8chno3cred7it9s");
		System.out.println(outpute);

	}
}
