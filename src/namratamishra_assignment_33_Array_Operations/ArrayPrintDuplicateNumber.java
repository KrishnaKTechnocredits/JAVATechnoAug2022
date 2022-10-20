/* Assignment - 33 : 10th Oct'2022

Program 1: print duplicate numbers from given array. 

input : {10,20,10,44,33,55,33};
output : 10
		 33
		 */
package namratamishra_assignment_33_Array_Operations;

public class ArrayPrintDuplicateNumber {

	void getArrayStringRepeatedWordsPrint(int[] arr)

	{
		System.out.println("The number of repeated number in given array is: ");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j] && i != j) {
					arr[j] = 0;
					count++;

				}

			}
			if (count >= 1 && arr[i] != 0)
				System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		int[] arr = {10,20,10,44,33,55,33};
		ArrayPrintDuplicateNumber asrwc = new ArrayPrintDuplicateNumber();

		asrwc.getArrayStringRepeatedWordsPrint(arr);

	}
}
