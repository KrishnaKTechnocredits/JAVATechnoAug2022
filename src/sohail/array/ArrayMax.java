//3) Write a method to return max number from array.
//input : {11,4,55,23,43}
//output : 55

package sohail.array;

public class ArrayMax {
	int getArrayMax(int[] arr) {
		int max = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max) {
				max = arr[index];
			}
		}
		System.out.println(max);
		return max;
	}

	public static void main(String[] args) {
		ArrayMax arraymax = new ArrayMax();
		int[] arr1 = { 11, 4, 55, 23, 43 };
		arraymax.getArrayMax(arr1);

	}

}
