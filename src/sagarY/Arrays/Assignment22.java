/*Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89} */

package sagarY.Arrays;
import java.util.Arrays;

public class Assignment22 {

	int[] assignment22ReplaceNumWith0(int[] inputArray) {

		for (int i = 0; i < inputArray.length - 1; i++) {
			if (inputArray[i] > inputArray[i + 1]) {
				inputArray[i] = 0;
			}
		}
		return inputArray;
	}

	public static void main(String[] args) {
		System.out.println("**Replace current index number with 0, if \nindex+1 number is smaller then index number**");
		Assignment22 a22 = new Assignment22();
		int[] inputArray = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("\nInput Array is: \n" + Arrays.toString(inputArray));
		int[] outputArray = a22.assignment22ReplaceNumWith0(inputArray);
		System.out.println("Output processed Array is: \n" + Arrays.toString(outputArray));
	}



}
