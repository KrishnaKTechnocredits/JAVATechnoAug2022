/*
 * Program 3 : 
write a method to verify number is palindrome.

input : 1221
output : 1221 is a palindrome number

input : 1231
output : 1231 is not a palindrome number
 */
package harshalRane.Assignments.assignment32;

public class Pallindrome {
	void pallindromeNumber(int number) {
		int originalNum = number;
		int revNum = 0;
		int remainder=0;
		
		System.out.println("Given Number is: " + number);
		
		while (number>0) {
			remainder = number % 10;
			revNum = revNum * 10 + remainder;
			number = number/10;
		}
		if(revNum == number) 
			System.out.println(originalNum + " Number is a Pallindrome Number");
		else
			System.out.println(originalNum + " Number is not a Pallindrome Number");
	}
	
	public static void main(String[] args) {
		Pallindrome pallindrome = new Pallindrome();
		pallindrome.pallindromeNumber(1221);
		System.out.println("----------------");
		pallindrome.pallindromeNumber(1231);
	}
}
 