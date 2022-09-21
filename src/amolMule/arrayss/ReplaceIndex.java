package amolMule.arrayss;
import java.util.Arrays;
/*Replace current index number with 0, if index+1 number is smaller then index number.
//int [] arr = {10, 20, 30, 22, 44, 21, 92, 89};
//output : {    10, 20, 0,  22, 0,  21, 0,  89}*/

public class ReplaceIndex {
	int[] getRepalceIndexZero(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				arr[i] = 0;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		ReplaceIndex ri = new ReplaceIndex();
		int[] arr = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("Input array is" + (Arrays.toString(arr)));

		int[] out = ri.getRepalceIndexZero(arr);
		System.out.println("Output arry is" + Arrays.toString(out));
	}
}
