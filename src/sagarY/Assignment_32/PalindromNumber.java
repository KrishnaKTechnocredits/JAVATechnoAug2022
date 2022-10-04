//Program 3 : write a method to verify number is palindrome.

package sagarY.Assignment_32;

public class PalindromNumber {

	boolean isPalindrome(int num) {
		int originalNum = num;
		int reversNum = 0;

		while (num > 0) {
			int remainder = num % 10;
			num = num / 10;
			reversNum = reversNum * 10 + remainder;
		}
		if (originalNum == reversNum)
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Program 3 : Write a method to return \nPalindrome number.");
		System.out.println("-------------------------------------");
		
		int num1=1221;	int num2=1234; int num3 = 12455421;	
		
		boolean flag = new PalindromNumber().isPalindrome(num1);
		System.out.println("Is "+num1 +" palindrome number? \n"+flag+"\n");
	
		boolean flag1 = new PalindromNumber().isPalindrome(num2);
		System.out.println("Is "+num2 +" palindrome number? \n"+flag1+"\n");
	
		boolean flag2 = new PalindromNumber().isPalindrome(num3);
		System.out.println("Is "+num3 +" palindrome number? \n"+flag2);
	}

	

}
