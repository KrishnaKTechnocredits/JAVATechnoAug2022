package nikeshM.StringCode;

public class StringRearrange {
	String getRearrangeString(String input) {
		int length = input.length();
		String tempLowerCase = "";
		String tempDigit = "";
		String tempUpperCase = "";

		for (int index = 0; index < length; index++) {
			char ch = input.charAt(index);

			if (Character.isUpperCase(ch)) {
				tempUpperCase = tempUpperCase + ch;
			} else if (Character.isDigit(ch)) {
				tempDigit = tempDigit + ch;
			}

			else if (Character.isLowerCase(ch)) {
				tempLowerCase = tempLowerCase + ch;
			}

		}
		return tempUpperCase + tempDigit + tempLowerCase;
	}
	public static void main(String[] args) {
		StringRearrange rearrange = new  StringRearrange();
		String output =   rearrange.getRearrangeString("t8EcHNo5Cred3iTs");
		System.out.print("StringRearrange are "+ output);
	}
}
