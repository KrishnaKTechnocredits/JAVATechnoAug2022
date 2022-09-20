/*Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits*/

package manjiri.arrayEx;

public class ArrayEx9 {

	String getMaximumLengthWord(String input) {
		int maxLength = 0;
		String maxString = "";

		String[] inputArr = input.split(" ");
		for (int index = 0; index < inputArr.length; index++) {
			int wordLength = inputArr[index].length();
			if (maxLength < wordLength) {
				maxLength = wordLength;
				maxString = inputArr[index];
			}
		}
		return maxString;
	}

	String getLastMaximumLengthWord(String input) {
		int maxLength = 0;
		String maxString = "";

		String[] inputArr = input.split(" ");
		for (int index = 0; index < inputArr.length; index++) {
			int wordLength = inputArr[index].length();
			if (maxLength <= wordLength) {
				maxLength = wordLength;
				maxString = inputArr[index];
			}
		}
		return maxString;
	}
	
	private int getMaximumWordLength(String[] inputArr) {
		int maxLength = 0;
		
		for (int index = 0; index < inputArr.length; index++) {
			if (maxLength <= inputArr[index].length()) {
				maxLength = inputArr[index].length();
			}
		}
		return maxLength;
	}

	String getnthMaximumLengthWordFromString(String input, int num) {
		int maxLength = 0;
		int count = 0;
		String maxString = "";

		String[] inputArr = input.split(" ");
		maxLength = getMaximumWordLength(inputArr);
		for (int index = 0; index < inputArr.length; index++) {
			if (inputArr[index].length() == maxLength) {
				maxString = inputArr[index];
				count++;
				if (count == num)
					break;
			}
		}
		return maxString;
	}

	public static void main(String[] args) {
		String input = "Good morning friends this is technocredits";
		System.out.println("Maximum Length String: " + new ArrayEx9().getMaximumLengthWord(input));

		String input1 = "Good morning friends this is technocredits this is august22batch which is awesome!!!!!!";
		System.out.println("Last Maximum Length String: " + new ArrayEx9().getLastMaximumLengthWord(input1));
		System.out.println("Second Maximum Length String: " + new ArrayEx9().getnthMaximumLengthWordFromString(input1, 2));
	}
}
