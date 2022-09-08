package pujaSah.assignments11_20;

public class OperationsOnStringClassMethods {

	String getArrangedStringFormat1(String input) {
		int length = input.length();
		char ch = 'p';
		String str1 = "", str2 = "";
		boolean flag = true;
		for (int i = 0; i <= length - 1; i++) {
			ch = input.charAt(i);
			flag = Character.isDigit(ch);
			if (flag) {
				str1 = str1 + input.charAt(i);
			} else {
				flag = Character.isLetter(ch);
				if (flag) {
					str2 += input.charAt(i);
				}
			}
		}
		return (str1 + str2);
	}

	String getArrangedStringFormat2(String input) {
		int length = input.length();
		String str1 = "", str2 = "", str3 = "";
		for (int i = 0; i <= length - 1; i++) {
			boolean flag = Character.isLetter(input.charAt(i));
			if (flag) {
				if (Character.isUpperCase(input.charAt(i))) {
					str1 += input.charAt(i);
				} else {
					str3 += input.charAt(i);
				}
			} else if (Character.isDigit(input.charAt(i))) {
				str2 += input.charAt(i);
			}
		}
		return (str1 + str2 + str3);
	}

	void displayArrangedStringOutput(String type, String name) {
		if (type == "AllDigitAllCharacter") {
			String str1 = new OperationsOnStringClassMethods().getArrangedStringFormat1(name);
			System.out.println(
					"The arranged String in the format AllDigitAllCharacter for input " + name + " is " + str1);
		} else if (type == "UpperCaseLettersDigitsLoweCaseLetters") {
			String str2 = new OperationsOnStringClassMethods().getArrangedStringFormat2(name);
			System.out.println("The arranged String in the format UpperCaseLettersDigitsLoweCaseLetters for input "
					+ name + " is " + str2);
		} else {
			System.out.println("Invalid Format");
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
