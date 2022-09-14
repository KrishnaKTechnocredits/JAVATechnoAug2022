
/*Assignment - 21 : 14th Sep'2022

Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89*/

package nilamP;

public class ArrayOperations1 {
	int FindSecMax(int[] arr) {
		int max = arr[1];
		int secmax = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
			} else if (arr[i] >= secmax) {
				secmax = arr[i];
			}
		}
		return secmax;

	}

	public static void main(String args[]) {
		ArrayOperations1 ao = new ArrayOperations1();
		int[] arr = { 10, 99, 33, 44, 89, 76 };
		System.out.println("The second highest element from given array is : " + ao.FindSecMax(arr));
	}
}
