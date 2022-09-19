//max number in given array {11,4,55,23,43}

package shridharKumbhar.assignment19Array;

public class MaxNumArray {
	
	int getMaxNum(int [] array) {
		
		int maxNum = array[0];
		
		for( int index = 1 ; index < array.length ; index++) {
			if(maxNum < array[index]) {
				maxNum = array[index];
			}
		}return maxNum;
	}
	
	
	
	public static void main(String[] args) {
		int [] inputArray = {11,4,55,23,43};
		System.out.println("Max num in given array is: " + new MaxNumArray().getMaxNum(inputArray));
	}
}
