/*Write a method to print all the words having no digits and uppercase.
String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
output : techno
         is*/

package manjiri.arrayEx;

public class ArrayEx13 {
	
	private boolean isWordHavingDigit(String input) {
		for (int index = 0; index < input.length(); index++) {
			if(Character.isDigit(input.charAt(index))) 
				return true;
		}
		return false;
	}
	
	private boolean isWordHavingUpperCase(String input) {
		for (int index = 0; index < input.length(); index++) {
			if(Character.isUpperCase(input.charAt(index))) 
				return true;
		}
		return false;
	}
	
	void getAllWordsHavingNoDigitsNoUpperCase(String input) {
		String[] inputArr = input.split(" ");
		
		for(int index = 0; index < inputArr.length; index++) {
			boolean isDigitFlag = isWordHavingDigit(inputArr[index]);
			boolean isUpperCaseFlag = isWordHavingUpperCase(inputArr[index]);
			
			if(!isDigitFlag && !isUpperCaseFlag) {
				System.out.println(inputArr[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		new ArrayEx13().getAllWordsHavingNoDigitsNoUpperCase(input);
	}

}
