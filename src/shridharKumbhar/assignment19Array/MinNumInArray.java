package shridharKumbhar.assignment19Array;

public class MinNumInArray {
	
	int getminNum(int[] array) {
		
		int minnum = array[0];
		
		for (int index=1; index < array.length; index++) {
			if (minnum > array[index])
				minnum = array[index];
		}
		return minnum;
	}
	
	public static void main(String[] args) {
		int [] inputArray = {11,4,55,23,43};
		System.out.println("Min num in given array is: " + new MinNumInArray().getminNum(inputArray));
	}
}
