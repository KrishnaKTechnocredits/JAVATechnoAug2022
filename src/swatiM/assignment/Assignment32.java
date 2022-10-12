/*
 * Assignment - 32 : 30th Sep'2022

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

 */

package swatiM.assignment;

public class Assignment32 {

	void isArmstrong(int num) {
		int sum=0;
		int originalNum = num;
		while(num>0) {//run the loop until the number becomes 0
			int r = num%10; // to get the remainder/last digit
			sum = sum + (r*r*r);// to store sum of cube
			num = num/10;// to reduce the number by 1 digit
		}

		if(sum==originalNum) {//if sum of cube of all digit = original num then armstrong
			System.out.println(originalNum+" is a Armstrong number");
		}
		else {
			System.out.println(originalNum+" is not a Armstrong number");
		}
	}

	int getReverseNum(int num) {
		int originalNum=num;
		int revNum=0;
		while(num>0) {
			int r = num%10;
			revNum = (revNum * 10)+ r;
			num = num/10;
		}
		return revNum;
	}

	void isNumPalindrome(int num) {
		int revNum = getReverseNum(num);
		if(num==revNum) {
			System.out.println(num +" is Palindrome");
		}
		else {
			System.out.println(num +" is not a Palindrome");
		}
	}

	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		assignment32.isArmstrong(153);
		assignment32.isArmstrong(123);
		int input1 = 123 ;
		System.out.println("Reverse num of "+input1 + " is: "+assignment32.getReverseNum(input1));
		assignment32.isNumPalindrome(1221);
		assignment32.isNumPalindrome(1231);
	}

}

