/*
 Program 6 : 
Print all characters having ascii value 91 ot 96.

output : 91 -> [
         92 -> \
         93 -> ]		 
 */

package swapnilMaheshwari.AsciiValuePrograms;

public class PrintAllCharacterHavingAsciiValue {
	void printCharacterOfAsciiValue(int ascValue) {
		char ch = 0;
		if (ascValue >= 65 && ascValue <= 122) {
			ch = (char) ascValue;
			System.out.println(ascValue + " -> " + ch);
		} else
			System.out.println("Invalid Ascii number");
	}

	public static void main(String[] args) {
		for (int i = 91; i <= 96; i++) {
			new PrintAllCharacterHavingAsciiValue().printCharacterOfAsciiValue(i);
		}
	}

}
