/*
 * Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number
 */

package harshalRane.Assignments.assignment32;

public class ArmstrongNumber {
	void armStrongNum(int num) {
		int answer=0;
		int originalNum = num;
		
		while(num>0) {
			int remainder = num % 10;
			answer += (remainder*remainder*remainder);
			num = num / 10;
		}
		if(answer == originalNum)
			System.out.println(originalNum + " Number is an Armstrong Number");
		else
			System.out.println(originalNum + " Number is not an Armstrong Number");
	}
	
	public static void main(String[] args) {
		new ArmstrongNumber().armStrongNum(153);
		new ArmstrongNumber().armStrongNum(123);
	}
}
