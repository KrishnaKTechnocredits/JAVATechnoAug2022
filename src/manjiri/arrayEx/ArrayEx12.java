/*Write a method to return word having maximum uppercase.

String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs*/


package manjiri.arrayEx;

public class ArrayEx12 {
	
	private int getMaxUpperCase(String input) {
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			if(Character.isUpperCase(input.charAt(index))) {
				count++;
			}
		}
		return count;
	}
	
	String getWordHavingMaximumUpperCase(String input) {
		int maxLength = 0;
		String maxUpperCaseLengthWord = "";
		String[] inputArr = input.split(" ");
		for(int index = 0; index < inputArr.length; index++) {
			int upperCaseCount = getMaxUpperCase(inputArr[index]);
			if(maxLength < upperCaseCount) {
				maxLength = upperCaseCount;
				maxUpperCaseLengthWord = inputArr[index];
			}
		}
		return maxUpperCaseLengthWord;
	}
	
	
	public static void main(String[] args) {		
		String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println(new ArrayEx12().getWordHavingMaximumUpperCase(input));
	}
}
