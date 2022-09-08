package amolMule;

public class LengthStr {

	int getNameLength(String str) {
		int strlength = str.length();
		return strlength;
	}

	char getMiddleChar(String str) {
		int index;
		int s = str.length();
		if (s % 2 == 0)
			index = s / 2 - 1;
		else
			index = s / 2;

		char ch = str.charAt(index);
		return ch;

	}

	public static void main(String args[]) {
		LengthStr length = new LengthStr();
		String ipString1 = "Maulik";
		int a = length.getNameLength(ipString1);
		System.out.println("Length of word: " + ipString1 + " is " + a);

		char cr = length.getMiddleChar(ipString1);
		System.out.println("Middle char of word: " + " " + ipString1 + " is " + cr);

		String ipString2 = "Technocredits";
		int a1 = length.getNameLength(ipString2);
		System.out.println("Length of word: " + ipString2 + " is " + a1);

		char cr1 = length.getMiddleChar(ipString2);
		System.out.println("Middle char of word: " + " " + ipString2 + " is " + cr1);

	}

}
