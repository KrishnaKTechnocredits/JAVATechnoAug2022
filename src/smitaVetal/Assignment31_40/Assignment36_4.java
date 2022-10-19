/*Return count of digits from given String without using isDigit method of Character class..

input : te1chno2cre4di6ts 
output : 4
*/
package smitaVetal.Assignment31_40;

public class Assignment36_4 {

	int getCountOfDigits(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {

			int ch = (int) input.charAt(index);
			if (ch >= 48 && ch <= 57) {
				count++;
			}
		}
		return count;
	}

	void display(String str) {
		int count = getCountOfDigits(str);
		if (count > 0)
			System.out.println("Count of all Digits in " + str + " is " + count);
		else
			System.out.println("no digits present in string ");

	}

	public static void main(String[] args) {
		Assignment36_4 prog = new Assignment36_4();
		prog.display("te1chno2cre4di6ts");
		
	}

}
