package rohini.StringArrayAssignment18;

public class RearrangeString {
	//Program 1
	String rearrangeStr(String name) {
		String digit = "";
		String letter = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (Character.isLetter(ch)) {
				letter = letter + ch;
			}
		}
		return digit + letter;
	}
	//Program 2
	String rearrangeStr1(String name) {
		String upperCase = "";
		String lowerCase = "";
		String digit = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCase = upperCase + ch;
			} else if (Character.isLowerCase(ch)) {
				lowerCase = lowerCase + ch;
			} else if (Character.isDigit(ch)) {
				digit = digit + ch;
			}
		}
		return upperCase + digit + lowerCase;
	}

	public static void main(String[] args) {
		RearrangeString str = new RearrangeString();
		String input1 = "te2cH4no";
		String input2 = "t8EcHNo5Cred3iTs";
		String output1 = str.rearrangeStr(input1);
		System.out.println("Input: " + input1 + "\nOutput: " + output1);
		String output2 = str.rearrangeStr1(input2);
		System.out.println("Input: " + input2 + "\nOutput: " + output2);
	}

}
