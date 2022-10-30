
/**************Assignment - 32 : 30th Sep'2022

Program 1 : 
Write a method to verify number is Armstrong or not.
(if sum of cube of all digit = original num then armstrong)
input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number*************/

package mohiniA.ArrayOprationAssignments.Assignment32;

public class Armstrong {
	
	void isArmstrong(int num) {
		int sum=0;
		int originalNum = num;
		while(num>0) {
			int r = num%10; 
			sum = sum + (r*r*r);
			num = num/10;
		}
		
		if(sum==originalNum) {
			System.out.println(originalNum+" is a Armstrong number");
		}
		else {
			System.out.println(originalNum+" is not a Armstrong number");
		}
	}
	
	public static void main(String[] args) {
		Armstrong obj32 = new Armstrong();
		obj32.isArmstrong(153);
		obj32.isArmstrong(123);
		
	}

}
