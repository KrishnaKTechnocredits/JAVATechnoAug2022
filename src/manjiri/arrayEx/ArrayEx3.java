/*Write a method to return max number from array.
input : {11,4,55,23,43}
output : 55*/

package manjiri.arrayEx;

public class ArrayEx3 {
	int getMaxNumFromArray(int[] arr) {
		int max = 0;
		for(int index = 0; index < arr.length; index++) {
			if (max < arr[index]) {
				max = arr[index];
			}			
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] intArr = {11,4,55,23,43};
		System.out.println("Maximum number from an array is: "+new ArrayEx3().getMaxNumFromArray(intArr));
	}
}
