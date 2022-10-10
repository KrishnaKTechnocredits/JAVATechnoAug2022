/*Assignment - 32 : 30th Sep'2022

Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number
*/

package deepakPatil.Assignment32ArmstrongPalindromeNumber;

public class Assignment32_1 {
	
	//Find if number is Armstrong
	void findIfNumberArmstrong(int num) {
		int originalNum = num;
		int ans = 0;

		while (num > 0) {

			int remainder = num % 10;
			System.out.println(remainder);
			ans = ans + (remainder * remainder * remainder);
			num = num / 10;
		}

		if (ans == originalNum)
			System.out.println("Number " + originalNum + " is an Armstrong number");
		else
			System.out.println("Number " + originalNum + " is not an Armstrong number");
		System.out.println("------------------------------------------");
	}

	public static void main(String[] args) {
		Assignment32_1 assignment32_1 = new Assignment32_1();
		int num1 = 153;
		int num2 = 123;
		assignment32_1.findIfNumberArmstrong(num1);
		assignment32_1.findIfNumberArmstrong(num2);
	}

}
