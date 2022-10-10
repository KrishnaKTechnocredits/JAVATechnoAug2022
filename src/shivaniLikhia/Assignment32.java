/*Assignment - 32 : 30th Sep'2022

Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number
 
Program 2 : 
Write a method to return reverse number.
input : 123
output : 321

Program 3 : 
write a method to verify number is palindrome.

input : 1221
output : 1221 is a palindrome number

input : 1231
output : 1231 is not a palindrome number
*/

package shivaniLikhia;

public class Assignment32 {
	
	void verifyNumberIsArmStrong(int num) {
		int ans = 0;
		int orgNum = num;
		while(num>0) {
			int r = num % 10;
			ans = ans + (r*r*r);
			num = num /10; 
		}
		if(ans == orgNum) {
			System.out.println("The given number "+orgNum+" is Armstrong Number");
		}
		else {
			System.out.println("The given number "+orgNum+" is not Armstrong Number");
		}
	}
	
	void getReverseNum(int num) {
		System.out.println("The reverse number for the given number "+num+" is : ");
		while(num>0) {
			int r = num % 10;
			System.out.print(r);
			num = num/10;
		}
	}
	
	void verifyNumberPallindrome(int num) {
		String originalNum = Integer.toString(num);
		String ans = "";
		while(num>0) {
			int r = num % 10;
			ans = ans + Integer.toString(r);
			num = num/10;
		}
		if(ans.equals(originalNum)) {
			System.out.println("The given number "+ originalNum +" is a Pallindrome Number.");
		}
		else {
			System.out.println("The given number "+ originalNum +" is not a Pallindrome Number.");
		}
	}
	
	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		assignment32.verifyNumberIsArmStrong(153);
		assignment32.verifyNumberIsArmStrong(123);
		System.out.println("------------------------------------------------------");
		assignment32.getReverseNum(123);
		System.out.println(" ");
		System.out.println("------------------------------------------------------");
		assignment32.verifyNumberPallindrome(1221);
		assignment32.verifyNumberPallindrome(1231);
		
	}
}
