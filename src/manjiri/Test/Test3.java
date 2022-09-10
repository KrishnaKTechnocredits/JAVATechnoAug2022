/*Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c*/

package manjiri.Test;

public class Test3 {
	String getMaxLengthString(String[] input) {
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
	
	char getMiddleChar(String[] inputArr) {
		String input = getMaxLengthString(inputArr);
		
		if (input.length() % 2 == 0) {
			return input.charAt(input.length()/2-1);		
		}
		else {
			return input.charAt(input.length()/2);
		}		
	}
	
	public static void main(String[] args) {
		Test3 test3 = new Test3();
		String[] stringArray = {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		System.out.println(test3.getMiddleChar(stringArray));
	}
}
