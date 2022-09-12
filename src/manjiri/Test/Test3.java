/*Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c*/

package manjiri.Test;

public class Test3 {
	private String getMaxLengthString(String[] input) {
		int maxLength = input[0].length();
		String maxString = input[0];
		
		for(int index = 1; index < input.length;index ++) {
			int length = input[index].length();
			if (maxLength < length) {
				maxLength = length;
				maxString = input[index];				
			}
		}
		return maxString;
	}
	
	private char getMiddleChar(String input) {
		if (input.length() % 2 == 0) {
			return input.charAt(input.length()/2-1);		
		}
		else {
			return input.charAt(input.length()/2);
		}	
	}
	
	char getMiddleCharFromMaxLengthString(String[] inputArr) {
		String input = getMaxLengthString(inputArr);
		return getMiddleChar(input);
	}
}
