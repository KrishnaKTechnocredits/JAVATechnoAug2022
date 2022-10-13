/*
Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst";
*/

package namratamishra.stringOpreations;

public class findOutFrequencyOfEachCharacter {

	public static void main(String[] args) {

		String str = "technocreditst";
		System.out.println("frequency of each cahracter is:-");

		while (str.length() > 0) {
			char ch = str.charAt(0);
			int originalLength = str.length();
			str = str.replace(ch, ' ');
			str = str.replaceAll("\\s", "");
			int newLength = str.length();
			System.out.println(ch + "------>" + (originalLength - newLength));

		}
	}
}
