/*
 * Assignment - 31 : 29th Sep'2022

Program 1 :
Write a method to find whether given String is pallindrome.

input : radar
output : radar is pallindrom

input : aabcbaa
output : aabcbaa is pallindrom

input : abcabc
output : abcabc is not a pallindrom


Program 2 :
Write a method to print all pallindrome input from given array.

input : {"radar","c","madam","maulikkilum"};
output : radar
         madam
 */
package akankshaVyas.Arraypkg;

public class PallindromeString {

	boolean getPalindromeString(String str) {
		for(int index=0,backIndex=str.length()-1; index<backIndex;index++,backIndex--) {
				if(str.charAt(index) != str.charAt(backIndex)){
							return false;
						}
				
		}return true;
	}
	
	void display(String str) {
		
		boolean bool = getPalindromeString(str);
		if(bool==true) {
		System.out.println(str + " is a pallindrome");}
		else {
			System.out.println(str + " is not a pallindrome" + "\n");
			}
		
		}
	
	void getPalindromeStringAraay(String[] arr) {
		System.out.println("Below are string which are palindrome String form given array : ");
		boolean bool1 = false;
		for (int index = 0; index < arr.length; index++) {
			bool1 = getPalindromeString(arr[index]);
			if (bool1) {
				System.out.println(arr[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		PallindromeString palindromeString =new PallindromeString();
		palindromeString.display("radar");
		palindromeString.display("aabcbaa");
		palindromeString.display("abcabc");
		String[] input = {"radar","techhpet","madam","maulikkilum"};
		palindromeString.getPalindromeStringAraay(input);
		
	}
	
	
	
}
