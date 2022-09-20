package shubhamG.Assignment21to30;

/*Assignment - 22 : 15th Sep'2022

Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}
*/
import java.util.Arrays;

public class ArrayPractice4 {
	int[] getArrayWithReplacedElement(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] < arr[i]) {
				arr[i] = 0;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		ArrayPractice4 array4 = new ArrayPractice4();

		int[] arr2 = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("Given input array is : " + Arrays.toString(arr2));

		System.out.println("Array after processing is: " + Arrays.toString(array4.getArrayWithReplacedElement(arr2)));
	}
}
