/*Write a method to return min number from array.
input : {11,4,55,23,43}
output : 4*/

package manjiri.arrayEx;

public class ArrayEx4 {
	int getMinNumFromArray(int[] arr) {
		int min = arr[0];
		for(int index = 0; index <arr.length;index++) {
			if(arr[index] < min) {
				min = arr[index];
			}
		}
		return min;
	}	

	public static void main(String[] args) {
		int[] intArr = { 11, 4, 55, 23, 43 };
		System.out.println(new ArrayEx4().getMinNumFromArray(intArr));
	}

}
