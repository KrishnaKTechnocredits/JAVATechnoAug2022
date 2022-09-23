/*
 * Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst";
 */

package rahulSaswadkar.arrayPrograms;

public class ArrayProgram10 {
	public static void main(String[] args) {
		ArrayProgram10 arrayProgram10 = new ArrayProgram10();
		String str1 = "technocreditst";
		
		arrayProgram10.printRepeatWordInStr2(str1);
	}
	
	void printRepeatWordInStr2(String str) {
		System.out.println("Given word \"" + str + "\"" );
		System.out.println("Frequency of each character in given word \"" + str + "\" is as follows :" );
		
		int index = 0, oldLen = 0, newLen = 0,occurence = 0;
		
		while(str.length() > 0) {
			oldLen = str.length();
			System.out.print("\n" +str.charAt(index) + " --> ");
			str = str.replace(Character.toString(str.charAt(index)), "");
			newLen = str.length();
			occurence = oldLen - newLen;
			System.out.print(occurence);
		}
	}
}