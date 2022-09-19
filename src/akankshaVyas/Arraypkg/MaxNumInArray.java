package akankshaVyas.Arraypkg;

public class MaxNumInArray {

	int getMaxNUm(int[] arr) {
		int max = arr[0];
		
		for (int index = 0; index < arr.length; index++) {
			
			if (max <= arr[index]) {
				max = arr[index];
			}
		}
		return max;
	}

	int getMinNum(int[] arr) {
		int min =arr[ 0];
		for (int index = 0; index < arr.length; index++) {

			if (arr[index] <= arr[0]) {
				min = arr[index];
			}

		}
		return min;
	}

	public static void main(String[] args) {

		int[] arr = { 11, 4, 55, 23, 43 };
		System.out.println("The max num in given array is " + new MaxNumInArray().getMaxNUm(arr));
		System.out.println("The min num in given array is " + new MaxNumInArray().getMinNum(arr));
	}
}

/*3) Write a method to return max number from array.
input : {11,4,55,23,43}
output : 55

4) Write a method to return min number from array.
input : {11,4,55,23,43}
output : 4
*/