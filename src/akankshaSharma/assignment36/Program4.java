/*Program 4 :
//Return count of digits from given String without using isDigit method of Character class..
//input : te1chno2cre4di6ts 
//output : 4*/
package akankshaSharma.assignment36;

public class Program4 {
	int stringCount(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch >= 48 && ch <= 57) {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		Program4 test = new Program4();
		String str = "te1chno2cre4di6ts ";
		int count = test.stringCount(str);
		System.out.println("Total Count of characters in " + str + " is " + count);
	}

}
