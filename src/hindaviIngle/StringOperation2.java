package hindaviIngle;

public class StringOperation2 {
	String rearrangeString(String name) {
		String str1 = "";
		String str2 = "";
		String str3 = "";
		for (int index = 0; index <= name.length() - 1; index++) {
			// str1=str1+name.charAt(index);
			if (Character.isDigit(name.charAt(index))) {
				str1 = str1 + Character.getNumericValue(name.charAt(index));
			} else {
				str2 = str2 + name.charAt(index);
			}
		}
		str3 = str1 + str2;
		System.out.println("Rearranged string is  : " + str3 + "\n");

		return str3;
	}

	String strFormat(String name) {
		String str1 = "";
		String str2 = "";
		String str3 = "";
		String str4 = "";
		for (int index = 0; index <= name.length() - 1; index++) {
			if (Character.isUpperCase(name.charAt(index))) {
				str1 = str1 + name.charAt(index);
			} else if (Character.isLowerCase(name.charAt(index))) {
				str2 = str2 + name.charAt(index);
			} else if (Character.isDigit(name.charAt(index))) {
				str3 = str3 + Character.getNumericValue(name.charAt(index));
			}
		}
		str4 = str1 + str3 + str2;
		System.out.println("Formatted string is  : " + str4 + "\n");
		return str4;
	}

	int frequencyOfChar(String name, char targetChar) {
		int count = 0;
		name = name.toLowerCase();
		targetChar = Character.toLowerCase(targetChar);
		for (int index = 0; index <= name.length() - 1; index++) {
			char ch = name.charAt(index);
			if (ch == targetChar) {
				count++;
			}
		}
		System.out.println("Frequency of given character" + targetChar + "is : " + count);
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOperation2 strOp = new StringOperation2();

		// strOp.rearrangeString("te2ch4no");
		strOp.rearrangeString("te2ch4no");
		strOp.strFormat("t8EcHNo5Cred3iTs");
		strOp.frequencyOfChar("TechnoTtcredits", 't');
	}

}
