/*Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number
*/

package smitaVetal.Assignment20_30;

public class Assignment32_Prog3 {
	void armstrongNum(int number) {
		int originalNo = number;
		int remainder = 0;
		int answer = 0;
		while (number > 0) {
			remainder = number % 10;
			answer += (remainder*remainder*remainder);
			number = number / 10;
		}
		if (answer == originalNo)
			System.out.println(originalNo + " is armstrong number");
		else
			System.out.println(originalNo + " is not armstrong number");
	}
	public static void main(String[] args) {
		Assignment32_Prog3 prog = new Assignment32_Prog3();
		prog.armstrongNum(153);
		prog.armstrongNum(0);
		prog.armstrongNum(1);
		prog.armstrongNum(254);
	
}
}
