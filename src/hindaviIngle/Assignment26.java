/*
Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst";
 */

package hindaviIngle;

public class Assignment26 {

	void getFrequencyOfChar(String name) {
		name = name.toLowerCase();
		while (name.length() > 0) {
			char ch = name.charAt(0);
			int orignalLength = name.length();
			name = name.replace(ch + "", "");
			int newLength = name.length();
			System.out.println(ch + " Frequency -> " + (orignalLength - newLength));
		}
	}

	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		assignment26.getFrequencyOfChar("Technocreditst");
	}

}
