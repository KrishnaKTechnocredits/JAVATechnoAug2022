/*Program 1: print duplicate numbers from given array. 
input : {10,20,10,44,33,55,33};
output : 10
		 33*/

package vinod.Assignment;

import java.util.Arrays;

public class Assignment33A {
	void getDupNum(int[] input) {
		System.out.println("Given array : " + Arrays.toString(input));
		for (int index = 0; index<input.length; index++) {
			int count = 0;
			for (int innerindex = index+1; innerindex<input.length; innerindex++) {
				if (input[index]== input [innerindex]) {
					count++;
					input[innerindex]= 0;
				}
			}
			if (count>=1) {
				System.out.println("Duplicate number in given array are :"+ input[index]);
			}
		} 
	}
	public static void main(String[] args) {
		Assignment33A assign = new Assignment33A();
		int[] input = {10,20,10,44,33,55,33};
		assign.getDupNum(input);
	}

}
