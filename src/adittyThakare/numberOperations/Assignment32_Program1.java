/*Assignment 32 : 30th Sep'2022

Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number*/
package adittyThakare.numberOperations;

public class Assignment32_Program1 {

	// check if number is Armstrong
	boolean isArmstrongNumber(int num) {
		int result = 0;
		int originalNum = num;
		while (num > 0) {
			int remainder = num % 10;
			result = result + (remainder * remainder * remainder);
			num = num / 10;
		}
		if (originalNum == result) {
			return true;
		} else
			return false;
	}

	// Print if number is ArmStrong or not
	void checkArmstrongNumber(int num) {
		if (isArmstrongNumber(num)) {
			System.out.println(num + " is an Armstrong number!");
		} else {
			System.out.println(num + " is not an Armstrong number!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment32_Program1 assignment32_Program1 = new Assignment32_Program1();
		int num1 = 153, num2 = 123;
		System.out.println("Program to check if number is Armstrong number!");
		System.out.println("\nInput number: " + num1);
		assignment32_Program1.checkArmstrongNumber(num1);
		System.out.println("\nInput number: " + num2);
		assignment32_Program1.checkArmstrongNumber(num2);
	}

}
