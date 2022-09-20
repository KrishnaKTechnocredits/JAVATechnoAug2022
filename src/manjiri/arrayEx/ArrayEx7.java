/*Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89*/

package manjiri.arrayEx;

public class ArrayEx7 {

	int getSecondHeighestFromArray(int[] input) {
		int maxNum = input[0];
		int secondMaxNum = 0;
		
		for(int index = 1; index < input.length; index++) {
					
			if(maxNum < input[index]) {
				secondMaxNum = maxNum;
				maxNum = input[index];		
			}
			else if(secondMaxNum < input[index]) {
				secondMaxNum = input[index];
			}
		}	
		return secondMaxNum;
	}

	public static void main(String[] args) {
		int[] intArr = { 10, 99, 33, 44, 89, 76 };
		System.out.println("Second Heighest Number from array is: " + new ArrayEx7().getSecondHeighestFromArray(intArr));
	}
}
