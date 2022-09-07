package sagarY.returnType;

public class ReturnType2 {
	static String name = "";
	static int count = 0;

	String returnReverseName(String name) {
		this.name = name;
		System.out.println("Given String is : " + name);
		String revName = "";
		for (int index = name.length() - 1; index >= 0; index--) {
			revName = revName + name.charAt(index);
		}
		return revName;

	}

	String returnEven(String name) {
		String revName = "";
		for (int index = 1; index <= name.length() - 1; index = index + 2) {
			revName = revName + name.charAt(index);
		}
		return revName;
	}

	String returnEvenFromLast(String name) {
		String revName = "";
		for (int index = name.length() - 2; index >= 0; index = index - 2) {
			revName = revName + name.charAt(index);
		}
		return revName;
	}

	int getDigitCount(String name) {

		for (int index = 0; index <= name.length() - 1; index++) {
			if (Character.isDigit(name.charAt(index)))
				count++;
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
		String output1 = new ReturnType2().returnReverseName("TechnoCredits");
		System.out.println("Reverse  of the String is : " + output1);
		System.out.println("******************************************");
		String output2 = new ReturnType2().returnEven(name);
		System.out.println("Even numbered chars of the string " + name + " are : \n" + output2);
		System.out.println("*********************************************");
		String output3 = new ReturnType2().returnEvenFromLast(name);
		System.out.println("Reverse even numbered chars of the string " + name + " are : \n" + output3);
		System.out.println("*********************************************");
		int output4 = new ReturnType2().getDigitCount("Te8chno3cred7it9s");
		System.out.println("Count of the digits in the given String \"Te8chno3cred7it9s\" is: \n" + output4);
		System.out.println("*********************************************");
		int output5 = new ReturnType2().sumOfDigits("Te8chno3cred7it9s");
		System.out.println("Sum of the numeric values from the String \"Te8chno3cred7it9s\" is : \n" + output5);
	}
}
