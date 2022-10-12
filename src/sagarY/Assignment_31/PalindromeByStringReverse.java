/*Assignment 31:Program 1 : Write a method to find whether given String is pallindrome.
                by reversing String.
input : radar
output : radar is pallindrom

input : aabcbaa
output : aabcbaa is pallindrom

input : abcabc
output : abcabc is not a pallindrom
*/


package sagarY.Assignment_31;

public class PalindromeByStringReverse {
	
	static{
		System.out.println("Program 1:Write a method to find whether given \nStrings are pallindrome by 'Reversing String'..");
		System.out.println("--------------------------------------------------");
	}
	
	void printPalindrom(String str){		
		
		String reversString="";
		for(int i=str.length()-1;i>=0;i--) {
			reversString=reversString+str.charAt(i);
		}
		if(str.equals(reversString))
			System.out.println("Output"+str + " is palindrome\n");
		else
			System.out.println("Output: "+str + " is not palindrome\n");		
	}


	public static void main(String[] args){
		String str1="radar"; String str2="aabcbaa"; String str3="abcabc";
		PalindromeByStringReverse check = new PalindromeByStringReverse();
		System.out.println("Input: "+str1);
		check.printPalindrom(str1);
		System.out.println("Input: "+str2);
		check.printPalindrom(str2);
		System.out.println("Input: "+str3);		
		check.printPalindrom(str3);		
	}

}
