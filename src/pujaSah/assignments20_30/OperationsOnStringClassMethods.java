package pujaSah.assignments20_30;

public class OperationsOnStringClassMethods {

	String getArrangedStringFormat1(String input) {
		int length = input.length();
		String str1 = "", str2 = "";
		for (int i = 0; i <= length - 1; i++) {
			if (Character.isDigit(input.charAt(i))) {
				str1 = str1 + input.charAt(i);
			} else if (Character.isLetter(input.charAt(i))) {
				str2 += input.charAt(i);
			}
		}
		return str1 + str2;
	}

	String getArrangedStringFormat2(String input) {
		int length = input.length();
		String str1 = "", str2 = "", str3 = "";
		for (int i = 0; i <= length - 1; i++) {
			if (Character.isLetter(input.charAt(i))) {
				if (Character.isUpperCase(input.charAt(i))) {
					str1 += input.charAt(i);
				} else if (Character.isLowerCase(input.charAt(i))) {
					str3 += input.charAt(i);
				}
			} else if (Character.isDigit(input.charAt(i))) {
				str2 += input.charAt(i);
			}
		}
		return str1 + str2 + str3;
	}

	void displayArrangedStringOutput(String type, String name) {
		if (type == "AllDigitAllCharacter") {
			System.out.println("The arranged String in the format AllDigitAllCharacter for input " + name + " is "
					+ new OperationsOnStringClassMethods().getArrangedStringFormat1(name));
		}
		if (type == "UpperCaseLettersDigitsLoweCaseLetters") {
			System.out.println("The arranged String in the format UpperCaseLettersDigitsLoweCaseLetters for input "
					+ name + " is " + new OperationsOnStringClassMethods().getArrangedStringFormat2(name));
		}
	}

	public static void main(String[] args) {
		String type1 = "AllDigitAllCharacter";
		String type2 = "UpperCaseLettersDigitsLoweCaseLetters";

		String name1 = "te2cH4no";
		String name2 = "t8EcHNo5Cred3iTs";

		new OperationsOnStringClassMethods().displayArrangedStringOutput(type1, name1);
		new OperationsOnStringClassMethods().displayArrangedStringOutput(type2, name2);
	}
}
