
/********Assignment - 32 : 30th Sep'2022

Program 3 : 
write a method to verify number is palindrome.

input : 1221
output : 1221 is a palindrome number

input : 1231
output : 1231 is not a palindrome number
*******/


package mohiniA.ArrayOprationAssignments.Assignment32;

public class PalindromNum {
	
	void isNumPalindrome(int num) {
		int revNum = ReverseNum.getReverseNum(num);
		if(num==revNum) {
			System.out.println(num +" is Palindrome");
		}
		else {
			System.out.println(num +" is not a Palindrome");
		}
	}
	public static void main(String[] args) {
		PalindromNum obj32 = new PalindromNum();
		obj32.isNumPalindrome(1221);
		obj32.isNumPalindrome(1231);
	}

}
