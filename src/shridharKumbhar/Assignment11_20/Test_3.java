//Return middle character of maximum length string from given array
// {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
//output : c

package shridharKumbhar.Assignment11_20;

import java.util.Arrays;

public class Test_3 {
	
	char getMiddleCharacter(String name) {
		
		int nameLength = name.length();
		
		if (nameLength %2 ==0) {
			char ch = name.charAt(nameLength/2 -1 );
			return ch;
		}else {
			char ch = name.charAt(nameLength/2 );
			return ch;
		}
	}
	
	char getMaxLengthString(String[] arr ) {
		
		int maxLength = arr[0].length();
		String maxLenString = arr[0];
		
		for ( int index =1;arr.length >index  ; index++) {
			if (maxLength< arr[index].length()) {
				maxLength = arr[index].length();
				maxLenString = arr[index];
			}
		}
		return getMiddleCharacter(maxLenString);
	}
	
	public static void main(String[] args) {
		String[] input = {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		Test_3 test = new Test_3();
		
		System.out.println("input: "+Arrays.toString(input));
		System.out.println("Maximum length string middle character : "+ test.getMaxLengthString(input));
	}

}
