//4) Write a method to return min number from array.
//input : {11,4,55,23,43}
//output : 4


package sohail.array;

public class ArrayMin {
	int getArrayMax(int[] arr) {
		int min = arr[0];
		for (int index = 0; index<arr.length; index++) {
			if (arr[index] < min) {
				min = arr[index];
			}
		}
		System.out.println(min);
		return min;
	}

	public static void main(String[] args) {
		ArrayMax arraymax = new ArrayMax();
		int[] arr1 = { 11, 4, 55, 23, 43 };
		arraymax.getArrayMax(arr1);
		
	}

}
