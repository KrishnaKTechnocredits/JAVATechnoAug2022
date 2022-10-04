
/*
 * Assignment - 22 : 15th Sep'2022

Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}

 */
package hindaviIngle;

import java.util.Arrays;

public class Assignment22 {

	int[] placeZeroForIndexPlusOne(int[] arry) {
		for (int index = 0; index < arry.length - 1; index++) {
			if (arry[index] > arry[index + 1]) {
				arry[index] = 0;
			}
		}
		return arry;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment22 arry = new Assignment22();
		int[] intputArr = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("Input arry is" + Arrays.toString(intputArr));
		int[] output = arry.placeZeroForIndexPlusOne(intputArr);
		System.out.println("Arrays is " + Arrays.toString(output));
	}

}
