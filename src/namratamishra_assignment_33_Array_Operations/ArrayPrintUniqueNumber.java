/*
 Program 6 : print unique numbers from given array (all content uniquely). 
input : {10,20,10,44,33,55,33};
output : 10 
         20
         44
		 33 
		 55
 */

package namratamishra_assignment_33_Array_Operations;

public class ArrayPrintUniqueNumber {

	void getArrayPrintUniqueNumber(int[] arr)

	{
		System.out.println("Unique Number in array is: ");
		for (int i = 0; i < arr.length; i++) {
			// int count = 0;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j] && (i != j))

					arr[j] = 0;

			}
			if (arr[i] != 0)

				System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 44, 33, 53, 33 };
		ArrayPrintUniqueNumber apun = new ArrayPrintUniqueNumber();

		apun.getArrayPrintUniqueNumber(arr);

	}
}
