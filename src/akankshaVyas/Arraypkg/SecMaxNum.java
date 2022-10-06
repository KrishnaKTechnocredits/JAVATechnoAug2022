/*
Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89
*/

package akankshaVyas.Arraypkg;

public class SecMaxNum {

	int getSecondHighestNumFromArray(int[] arr) {
		int max = arr[1];
		int secMax = arr[0];

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max)
				max = arr[index];
			else if (arr[index] > secMax)// && max>secMax)
				secMax = arr[index];
		}
		return secMax;
	}

	public static void main(String[] args) {
		int[] input = { 10, 99, 33, 44, 89, 76 };
		// new SecMaxNum().getSecondHighestNumFromArray(input);
		System.out.println(new SecMaxNum().getSecondHighestNumFromArray(input));
	}
}
