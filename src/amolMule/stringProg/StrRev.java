package amolMule.stringProg;

public class StrRev {
	String name = "";

	String getReverse(String str) {
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			name = name + ch;
		}
		return name;
	}

	String getEvenChar(String str) {
		String evenchar = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 != 0) {
				char ch = str.charAt(i);
				evenchar = evenchar + ch;
			}
		}

		return evenchar;
	}

	String getEvenReverse(String str) {

		String evenRevWord = "";
		String evenWord = getEvenChar(str);
		for (int i = evenWord.length() - 1; i >= 0; i--) {
			evenRevWord = evenRevWord + evenWord.charAt(i);
		}
		return evenRevWord;
	}

	int getCountDigit(String str) {
		int cnt = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			boolean digitFlag = Character.isDigit(ch);
			if (digitFlag)
				cnt++;
		}

		return cnt;
	}

	public static void main(String args[]) {
		StrRev rev = new StrRev();

		String a = rev.getReverse("Amol");
		
		System.out.print("Reverse word is: " + a);
		System.out.println();
		System.out.println("************");

		String b = rev.getEvenChar("SHARADA");
	
		System.out.print("Get even characters from word are: " + b);
		System.out.println();
		System.out.println("************");

		String c = rev.getEvenReverse("SHARADA");
		
		System.out.print("Reverse of even character series: " + c);
		System.out.println();
		System.out.println("************");

		int d = rev.getCountDigit("Am0ol77mol39pu51");
		
		System.out.print("Total count of digits are: " + d);
		System.out.println();
		System.out.println("************");

	}
}
