package vibhaS.Assignment;

public class Assignment26 {

	void printAllFrequency(String str) {

		while (str.length() > 0) {
			int count = 0;
			char ch = str.charAt(0);
			int olength = str.length();
			str = str.replace(String.valueOf(ch), "");
			int nlength = str.length();
			count = olength - nlength;
			System.out.println(count + " " + ch);
		}

	}

	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		String str = "technocreditst";
		assignment26.printAllFrequency(str);
	}
}
