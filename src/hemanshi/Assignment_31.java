/*
 * Program 1 :
Write a method to find whether given String is pallindrome.
input : radar
output : radar is pallindrom
input : aabcbaa
output : aabcbaa is pallindrom
input : abcabc
output : abcabc is not a pallindrom
Program 2 :
Write a method to print all pallindrome input from given array.
input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam*/

package hemanshi;
import java.util.Arrays;

public class Assignment_31 {
	
	void Pallindrome(String str) {
		
		//output variable to store reverse string
		String output = "";
		
		//for reverse the input String
		for(int index = str.length() - 1; index >= 0; index--) {
			   output += str.charAt(index);
		}
		
		//to check if both are equal or not
		if(str.equals(output))
			System.out.println(output + " is Pallindrome");
		else
			System.out.println(output + " is not Pallindrome");
		
	}
	
	void getPallindromArray(String[] str) {
		//loop to iterate all names in input Array
        for(int index=0; index<str.length; index++) {
        	  Pallindrome(str[index]);
        }
	}
	
	public static void main(String[] args) {
		new Assignment_31().Pallindrome("radar");
		new Assignment_31().Pallindrome("aabcbaa");
		new Assignment_31().Pallindrome("abcabc");
		System.out.println("----------------------------");

		String[] input = {"radar","techhpet","madam","maulikkilum"};
		System.out.println("Input String " +Arrays.toString(input) + "\n");
		new Assignment_31().getPallindromArray(input);
	}
}
