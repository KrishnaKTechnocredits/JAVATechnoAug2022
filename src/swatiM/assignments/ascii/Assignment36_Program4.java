/*Program 4 :
Return count of digits from given String without using isDigit method of Character class..
input : te1chno2cre4di6ts 
output : 4*/

package swatiM.assignments.ascii;

public class Assignment36_Program4 {

	int getCountOfDigitsFromGivenString(String str) {
		int countOfDigits = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int chNew = ch;
			if (chNew >= 48 && chNew <= 57) {
				countOfDigits++;
			}
		}
		return countOfDigits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment36_Program4 assignment36_Program4 = new Assignment36_Program4();
		String str = "te1chno2cre4di6ts";
		System.out.println("Input String --> " + str);
		System.out.println("Count of digits: " + assignment36_Program4.getCountOfDigitsFromGivenString(str));
		String str1 = "tc8om90pu2t6e8r";
		System.out.println("\nInput String --> " + str1);
		System.out.println("Count of digits --> " + assignment36_Program4.getCountOfDigitsFromGivenString(str1));
	}

}
