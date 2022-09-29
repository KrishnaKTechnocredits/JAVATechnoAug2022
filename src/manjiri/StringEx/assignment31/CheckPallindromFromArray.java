/*Write a method to print all pallindrome input from given array.

input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam*/

package manjiri.StringEx.assignment31;

import java.util.Arrays;

public class CheckPallindromFromArray {
	
	void getPallindromString(String[] input){
		
		System.out.println("Input Array is: " + Arrays.toString(input));
		System.out.println("-------------------------------------------------------");
		
		CheckPallindromWithoutReversingString checkPallindrome = new CheckPallindromWithoutReversingString();
		for (int index = 0; index < input.length; index++) {
			checkPallindrome.CheckPallindromWithoutStringReverse(input[index]);
		}	
	}
	
	public static void main(String[] args) {
		String[] inputArr = {"radar","techhpet","madam","maulikkilum"};
		new CheckPallindromFromArray().getPallindromString(inputArr);
	}

}
