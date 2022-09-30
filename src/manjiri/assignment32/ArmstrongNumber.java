/*Write a method to verify number is Armstrong or not.
input : 153
output : 153 is an Armstrong number
input : 123
output : 123 is not an Armstrong number*/

package manjiri.assignment32;

public class ArmstrongNumber {
	
	boolean isArmstrongNumber(int num) {
		//Store the original number
		int number = num;
		int sum = 0;
		
		//Calculate sum of cube of each digit
		while(num > 0) {
			int remainder = num % 10;
			sum += (remainder*remainder*remainder);
			num = num / 10;
		}	
		
		//Check if original number is same as sum calculated above
		if (sum ==  number)
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		int input = 153;
		boolean armstrongNumFlag = armstrongNumber.isArmstrongNumber(input);
		if(armstrongNumFlag)
			System.out.println(input +" "+ "is Armstrong number");	
		else
			System.out.println(input + " " + "is not an Armstrong number");
	}
}
