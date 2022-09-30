/*Program 1 : Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number
*/

package sagarY.Assignment_32;

public class ArmstrongNum {

	boolean isArmstrongNum(int num) {
		int originalNum = num;
		int armStrongNum = 0;

		while (num > 0) {

			int remainder = num % 10;

			num = num / 10;

			armStrongNum = armStrongNum + (remainder * remainder * remainder);

		}
		if (armStrongNum == originalNum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println("Program 1 : Write a method to verify \nnumber is Armstrong or not.");
		System.out.println("-------------------------------------");

		int num1 = 153;	int num2 = 999;	int num3 = 407;

		boolean flag = new ArmstrongNum().isArmstrongNum(num1);
		System.out.println("Is " + num1 + " Armstrong number ? \n" + ":" + flag + "\n");

		boolean flag1 = new ArmstrongNum().isArmstrongNum(num2);
		System.out.println("Is " + num2 + " Armstrong number ? \n" + ":" + flag1 + "\n");

		boolean flag2 = new ArmstrongNum().isArmstrongNum(num3);
		System.out.println("Is " + num3 + " Armstrong number ? \n" + ":" + flag2);
	}

}
