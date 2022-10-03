/*Program 2 : 
Write a method to return reverse number.
input : 123
output : 321

*/
package smitaVetal.Assignment20_30;

public class Assignment32_Prog2 {

	int getReverseNum(int number) {

		int remainder = 0;
		int revNum = 0;

		while (number > 0) {
			remainder = number % 10;
			revNum = revNum * 10 + remainder;
			number = number / 10;
		}

		return revNum;
	}

	public static void main(String[] args) {
		Assignment32_Prog2 prog = new Assignment32_Prog2();
		int input = 36589;
		int output = prog.getReverseNum(input);
		System.out.println("Original Number is :" + input + "\nreverse number is : " + output);

		int input1 = 123;
		int output1 = prog.getReverseNum(input1);
		System.out.println("======================================");
		System.out.println("Original Number is :" + input1+ "\nreverse number is : " + output1);
	}
}
