/*
 
 WAP to find out frequency of each character from given input using single while loop.
String str = "technocreditst";

Output t -> 3
 
 */
package swapnilMaheshwari.StringPrograms.Assignment26;

public class FrequencyOfEachCharacter {

	static void getFrequencyOfEachCharacterInString(String str) {
		while (str.length()>0)
		{
			char ch = str.charAt(0);
			int originalLength = str.length();// 14
			str = str.replace(Character.toString(ch), "");
			int newLength = str.length(); // 11
			System.out.println(ch + "-> " + (originalLength - newLength));
		}
	}

	public static void main(String[] args) {

		String input = "technocreditst";
		FrequencyOfEachCharacter.getFrequencyOfEachCharacterInString(input);
	}
}
