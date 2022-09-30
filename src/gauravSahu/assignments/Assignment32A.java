/*Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number*/
package gauravSahu.assignments;

import java.util.Arrays;

public class Assignment32A {

	 int cube = 0;
	 
	
	void getArmstrongNum(int num) {
		int num2 = num;
		int remain = 0;	
		while (num > 0) {
			remain = num % 10;
			num = num / 10;
			cube = cube +  (remain * remain * remain);
		}
		if (cube == num2) {
			System.out.println(num2 + " is an armstrong number");
		}else {
			System.out.println(num2 + " is not an armstrong number");
		}
	}

	public static void main(String[] args) {
		Assignment32A a32 = new Assignment32A();
		int[] arr = { 153, 123 };
		System.out.println("Given number array is : " + Arrays.toString(arr));
		for (int num : arr) {
			a32.getArmstrongNum(num);
		}
	}
}
