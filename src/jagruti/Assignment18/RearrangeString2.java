package jagruti.Assignment18;

public class RearrangeString2 
{
	static String rearrangeNewString(String name) {
		String uppercase = "";
		String lowercase = "";
		String digit = "";
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isUpperCase(ch)) {
				uppercase = uppercase + ch;
			} else if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (Character.isLowerCase(ch)) {
				lowercase = lowercase + ch;
			}
		}
		return uppercase + digit + lowercase;
	}

	public static void main(String[] args) {
		System.out.println(RearrangeString2.rearrangeNewString("t8EcHNo5Cred3iTs"));
	}
}
