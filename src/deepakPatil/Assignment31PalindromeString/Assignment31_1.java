/*
Assignment - 31 : 29th Sep'2022

Program 1 :
Write a method to find whether given String is pallindrome.

input : radar
output : radar is pallindrom

input : aabcbaa
output : aabcbaa is pallindrom

input : abcabc
output : abcabc is not a pallindrom
*/

package deepakPatil.Assignment31PalindromeString;

public class Assignment31_1{
	//Code to find if string is pallindrom by reverse string method
	
	String getReverseSting(String input){
		String output="";
		
		for(int index=input.length()-1; index>=0; index--){
			output = output + input.charAt(index);
		}
		return output;
	}
	
	String findIfStringIsPallindrom1(String input){
		
		String reverseString = getReverseSting(input);
		
		if(input.equals(reverseString))
			return("Given input string '"+input+"' is pallindrom string");
		else
			return("Given input string '"+input+"' is not pallindrom string");
	}
	
	public static void main(String[]args){
		
		Assignment31_1 assignment31_1 =  new Assignment31_1();
		System.out.println("This code is to find if string is pallindrom by using reverse string method\n");
		
		String input1= "radar";
		System.out.println("Given input string is: " +input1);
		System.out.println(assignment31_1.findIfStringIsPallindrom1(input1));
		System.out.println("--------------------------------------------------------------");
		
		String input2= "aabcbaa";
		System.out.println("Given input string is: " +input2);
		System.out.println(assignment31_1.findIfStringIsPallindrom1(input2));
		System.out.println("--------------------------------------------------------------");
		
		String input3= "abcabc";
		System.out.println("Given input string is: " +input3);
		System.out.println(assignment31_1.findIfStringIsPallindrom1(input3));
		System.out.println("--------------------------------------------------------------");
	}
}
