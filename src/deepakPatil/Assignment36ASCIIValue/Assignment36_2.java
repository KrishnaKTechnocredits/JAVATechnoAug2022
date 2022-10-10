/*
Assignment - 36 : 9th Oct'2022
Program 4 :
Return count of digits from given String without using isDigit method of Character class..

input : te1chno2cre4di6ts 
output : 4

Program 5 : 
Return character holding given Ascii value.

input : 69
output : E

Program 6 : 
Print all characters having ascii value 91 ot 96.

output : 91 -> [
         92 -> \
         93 -> ]		
*/

package deepakPatil.Assignment36ASCIIValue;

public class Assignment36_2 {

	int getCountOfDigitFromString(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int asciiValue = ch;
			if (asciiValue >= 48 && asciiValue <= 57)
				count++;
		}
		return count;
	}

	char getCharacterFromAsciiValue(int value) {
		char ch = (char) value;
		return ch;
	}

	void printCharacterFromAsciiValue() {
		for (int index = 91; index <= 96; index++) {
			char ch = (char) index;
			System.out.println(index + "---" + ch);
		}
	}

	public static void main(String[] args) {
		Assignment36_2 assignment36_2 = new Assignment36_2();

		String input = "te1chno2cre4di6ts";
		System.out.println("Given input string is: '" + input);
		System.out.println(
				"Digit count from String '" + input + "' is '" + assignment36_2.getCountOfDigitFromString(input) + "'");
		System.out.println("----------------------------------");

		int asciiValue = 69;
		System.out.println("Character holding Ascii value " + asciiValue + " is '"
				+ assignment36_2.getCharacterFromAsciiValue(asciiValue) + "'");
		System.out.println("----------------------------------");

		assignment36_2.printCharacterFromAsciiValue();
	}
}
