/*Assignment - 30 : 28th Sep'2022
 Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 
*/

package namratamishra.Array;

public class ArrayDuplicateNumberCount {

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
		int[] arr = { 10, 12, 44, 12, 77, 67, 12, 44 };
		ArrayDuplicateNumberCount asrwc = new ArrayDuplicateNumberCount();

		asrwc.getArrayStringRepeatedWordsPrint(arr);

	}
}
