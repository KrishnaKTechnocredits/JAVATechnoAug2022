/*Assignment - 36 : 9th Oct'2022

Program 4 :
Return count of digits from given String without using isDigit method of Character class..

input : te1chno2cre4di6ts 
output : 4*/

package rashmiG.Assignment36ASCIIPrograms;

public class CountOfDigits {

	int getCountOfDigits(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			int ch = (int) input.charAt(index);
			//char ch =input.charAt(index);
			if (ch >= 48 && ch <= 57) {
				count++;
			}
		}
		return count;
	}

	void display(String str) {
		int count = getCountOfDigits(str);
		if (count > 0)
			System.out.println("input : " + str + "\nouput : Number of digits in given string is " + count);
		else
			System.out.println("input : " + str + "\nouput : There are no digits in given string");
	}

	public static void main(String[] args) {
		CountOfDigits digits = new CountOfDigits();
		digits.display("te1chno2cre4di6ts");
		digits.display("*()IU");
		digits.display("8910");
	}

}
