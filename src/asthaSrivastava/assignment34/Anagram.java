/*Program 1 : How to check if two given String is the anagram of each other (using scanner class)?

Input1: catc
Input2: actc

Output: anagram
*/
package asthaSrivastava.assignment34;

public class Anagram {
	// method to find Anagram String
	void findAnagramString(String str1, String str2) {
		if (str1.length() != str2.length()) {
			System.out.println("Not an Anagram String");
		}
		while (str1.length() > 0) {
			char ch = str1.charAt(0);
			str1 = str1.replaceFirst(String.valueOf(ch), "");
			str2 = str2.replaceFirst(String.valueOf(ch), "");
		}
		if (str1.length() == str2.length()) {
			System.out.println("Anagram String");
		} else
			System.out.println("Not an Anagram String");
	}

	public static void main(String[] args) {
		String str1 = "catc";
		String str2 = "actc";
		new Anagram().findAnagramString(str1, str2);
	}

}
