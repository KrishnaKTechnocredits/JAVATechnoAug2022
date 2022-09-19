/*Program 3: Write a method to return word having maximum uppercase.

String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs			 
*/

package asthaSrivastava.arrayBasics;

public class WordWithUpperCase {

	int getUpperCaseCount(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}

		return count;
	}
	
	String getUpperCaseWord(String str) {
		String[] arr = str.split(" ");
		int maxCount = 0;
		int tempCount =0;
		String temp = " ";
		for (int index=0; index<arr[index].length();index++) {
			maxCount = getUpperCaseCount(arr[index]);
			if(maxCount > tempCount) {
				maxCount = tempCount;
				temp = arr[index];
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		WordWithUpperCase test = new WordWithUpperCase();
		
		String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println("Word with Max Upper case is" + test.getUpperCaseWord(input));
	}
}
