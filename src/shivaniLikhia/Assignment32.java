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
		System.out.println("The reverse number is : ");
		while(num>0) {
			int r = num % 10;
			System.out.print(r);
			num = num/10;
		}
	}
	
	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		assignment32.verifyNumberIsArmStrong(153);
		assignment32.verifyNumberIsArmStrong(123);
		System.out.println("----------------------------------------------");
		assignment32.getReverseNum(123);
	}
}
