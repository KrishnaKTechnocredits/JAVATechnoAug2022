/*Program 2 : print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55
*/
package namratamishra_assignment_33_Array_Operations;

public class ArrayPrintUniqueNumberHavingFreq1 {

	void getArrayStringRepeatedWordsPrint(int[] arr)

	{
		System.out.println("Unique Number in array is: ");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] != arr[j] && i != j)

					count++;

			}
			if (count == arr.length - 1)

				System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 10,20,10,44,33,55,33 };
		ArrayPrintUniqueNumberHavingFreq1 asrwc = new ArrayPrintUniqueNumberHavingFreq1();

		asrwc.getArrayStringRepeatedWordsPrint(arr);

	}
}
