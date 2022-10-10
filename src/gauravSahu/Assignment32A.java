/*Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number*/
package gauravSahu;

import java.util.Arrays;

public class Assignment32A {
	
	int cube ;
	void getArmNum(int num) {
		int tempNum= num;
		int remain = 0;
		while(num>0) {
			
			remain = num%10;
			num = num/10;
			cube = cube + (remain*remain*remain);
		}
		if(cube==tempNum) {
			System.out.println("It is an armstrong num : "+ tempNum);
		}else {
			System.out.println("It is not an armstrong num : "+ tempNum);
		}
	}
	
	public static void main(String[] args) {
		Assignment32A a32 = new Assignment32A();
		int[] arr = {153,123};
		System.out.println("Given array is : " + Arrays.toString(arr));
		for(int num : arr) {
			a32.getArmNum(num);
		}
	}
}
