/*Assignment - 32 : 30th Sep'2022
Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number*/
package asthaSrivastava.armstrong;

public class FindArmstrongNum {

	void getArmstrongNumber(int num) {
		int originalNum = num;
		int result = 0;

		while (num > 0) {
			int remainder = num % 10;
			result = result + (remainder * remainder * remainder);
			num = num / 10;
		}
		if (result == originalNum)
			System.out.println(originalNum + " is a Armstrong Number");
		else
			System.out.println(originalNum + " is not a Armstrong Number ");
	}

	public static void main(String[] args) {
		FindArmstrongNum test = new FindArmstrongNum();
		test.getArmstrongNumber(153);

		FindArmstrongNum test1 = new FindArmstrongNum();
		test1.getArmstrongNumber(123);
	}
}
