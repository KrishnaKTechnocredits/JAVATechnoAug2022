package shubhamG.Assignment31to40;

/*Assignment - 32 : 30th Sep'2022

Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number*/

public class Assignment32ArmstrongNumber {
	void checkIfNumberIsArmstrongOrNot(int num) {
		int r = 0;
		int ans = 0;
		int orgNum = num;
		while (num > 0) {
			r = num % 10;
			ans = ans + (r * r * r);
			num = num / 10;
		}
		if (orgNum == ans) {
			System.out.println(orgNum + " is Armstrong Number");
		} else {
			System.out.println(orgNum + " is not Armstrong Number");
		}
	}

	public static void main(String[] args) {
		Assignment32ArmstrongNumber armstrong = new Assignment32ArmstrongNumber();

		armstrong.checkIfNumberIsArmstrongOrNot(153);
		armstrong.checkIfNumberIsArmstrongOrNot(123);
	}
}
