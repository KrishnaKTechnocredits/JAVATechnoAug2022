/*Program 2 :Write a method to print all pallindrome input from given array
 			by reversing String.
input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam
 */

package sagarY.Assignment_31;
import java.util.Arrays;

public class PalindromeArrayCheckByStringReverse {
	
	static {
		System.out.println("Program 2 :Write a method to print all pallindrome \ninput from given array by 'Reversing String'.");
		System.out.println("----------------------------------------------");
	}
	
	void printPalindrom(String[] str){
		
		for(String str1 : str) {			
			String reversString="";
			for(int j=str1.length()-1;j>=0;j--) {
				reversString=reversString+str1.charAt(j);
			}			
			if(str1.equals(reversString)) {
				System.out.println(str1 +" is a palindrome");
				reversString="";
			}	
		}
	}

	public static void main(String[] args) {
		PalindromeArrayCheckByStringReverse check = new PalindromeArrayCheckByStringReverse();
		String[] input = { "radar", "techhpet", "madam", "maulikkilum" };
		System.out.println("Input: " +Arrays.deepToString(input));
		check.printPalindrom(input);
	}

}
