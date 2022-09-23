/*Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst";*/

package asthaSrivastava.assignments;

public class FrequencyOfChar {

	void getFrequencyOfEachChar(String str) {
		while (str.length() > 0) {
			
			char ch = str.charAt(0);
			int originalLength = str.length();
			str = str.replace(Character.toString(ch), "");
			int newLength = str.length();
			System.out.println(ch + "->" + (originalLength - newLength));

		}
	}

	public static void main(String[] args) {
		FrequencyOfChar freq = new FrequencyOfChar();
		String str = "technocreditst";
		freq.getFrequencyOfEachChar(str);
	}
}
