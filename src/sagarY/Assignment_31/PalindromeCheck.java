/*Assignment - 31 : 29th Sep'2022

Program 1 :
Write a method to find whether given String is pallindrome.

input : radar
output : radar is pallindrom

input : aabcbaa
output : aabcbaa is pallindrom

input : abcabc
output : abcabc is not a pallindrom
*/

package sagarY.Assignment_31;

public class PalindromeCheck{
	
	static{
		System.out.println("Program 1: Write a method to find \n whether given String is pallindrome.");
		System.out.println("------------------------------------");
	}
	
	boolean isPalidrome(String str){
		boolean flag=true;
		for(int i=0,j=str.length()-1;i<j;i++,j--){
			if(str.charAt(i)!=str.charAt(j))
				return false;
		}
		return flag;
	}
	
	void printPalindrom(String str){
		boolean flag = isPalidrome(str);
		if(flag){
			System.out.println("Output"+str + " is palindrome\n");
		}
		else
			System.out.println("Output: "+str + " is not palindrome\n");
	}

	public static void main(String[] args){
		String str1="radar"; String str2="aabcbaa"; String str3="abcabc";		
		PalindromeCheck check = new PalindromeCheck();
		System.out.println("Input: "+str1);
		check.printPalindrom(str1);
		System.out.println("Input: "+str2);
		check.printPalindrom(str2);
		System.out.println("Input: "+str3);		
		check.printPalindrom(str3);		
	}
}
