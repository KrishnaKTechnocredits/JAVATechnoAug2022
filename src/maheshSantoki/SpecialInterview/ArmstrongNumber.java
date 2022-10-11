//Program 1 : 

//Write a method to verify number is Armstrong or not.
//
//input : 153
//output : 153 is an Armstrong number
//
//input : 123
//output : 123 is not an Armstrong number
package maheshSantoki.SpecialInterview;

public class ArmstrongNumber {
	int armstrong(int num) {
		int armNum = 0;
		while (num > 0) {
			int rem = 0;
			rem = num % 10;
			armNum = armNum + rem * rem * rem;
			num = num / 10;
		}
		return armNum;
	}

	void display(int originalNumber) {
		int armNum = armstrong(originalNumber);
		if (armNum == originalNumber)
			System.out.println(originalNumber + " is ArmStrong Number");
		else
			System.out.println(originalNumber + " is not ArmStrong Number");
	}

	public static void main(String[] args) {
		ArmstrongNumber armstrong = new ArmstrongNumber();

		int input1 = 153;
		armstrong.display(input1);
		int input2 = 123;
		armstrong.display(input2);
	}
}
