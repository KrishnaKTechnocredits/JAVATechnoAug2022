/*
 * Program 4 :
Return count of digits from given String without using isDigit method of Character class..

input : te1chno2cre4di6ts 
output : 4
 */
package hindaviIngle;

public class Assignment36_countDigitString {

	int countOfDigitInString(String name) {
		System.out.println("Input : " + name);
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) >= 48 && name.charAt(index) <= 57) {//check ascii of numbers 
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment36_countDigitString a36 = new Assignment36_countDigitString();
		int count = a36.countOfDigitInString("te1chno2cre4di6ts");
		System.out.println("Output : " + count);
	}

}
