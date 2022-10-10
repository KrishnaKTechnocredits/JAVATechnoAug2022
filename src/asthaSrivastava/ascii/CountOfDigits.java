/*Program 4 :
Return count of digits from given String without using isDigit method of Character class..

input : te1chno2cre4di6ts 
output : 4*/
package asthaSrivastava.ascii;

public class CountOfDigits {

	int getCountOfDigits(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch > 48 && ch <= 57) {
				count++;
			}
		}
		System.out.println("Count of Digits from " + str + " " + count);
		return count;
	}

	public static void main(String[] args) {
		new CountOfDigits().getCountOfDigits("te1chno2cre4di6ts");
	}
}
