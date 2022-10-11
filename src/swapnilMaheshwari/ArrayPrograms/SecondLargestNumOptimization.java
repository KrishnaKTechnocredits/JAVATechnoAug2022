/*
 Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89 
 
 */

package swapnilMaheshwari.ArrayPrograms;

public class SecondLargestNumOptimization {
	int max = 0, smax = 0;
	int getSecondLarNumFromArrayList(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			if (arr[i]<arr[i+1]) {
				max=arr[i+1];
				smax=arr[i];
			}
			else if (smax<arr[i]) {
				smax=arr[i];
			}
		}
		return smax;
	}
	public static void main(String[] args) {
		int[] input = { 10, 99, 33, 44, 89, 76 };
		System.out.println("Second largest number is :" + new SecondLargestNumOptimization().getSecondLarNumFromArrayList(input));

	}
}
