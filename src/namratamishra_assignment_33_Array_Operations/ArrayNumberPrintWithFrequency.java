/*
program 7 : print each number with its frequency. 
input : {10,11,11,10,5,6,5,6,5,5,4}
output : 10 -> 2
         11 -> 2
          5 -> 4
         6 -> 2
         4 -> 1
*/
package namratamishra_assignment_33_Array_Operations;

public class ArrayNumberPrintWithFrequency {

	void getArrayStringRepeatedWordsPrint(int[] arr)

	{
		System.out.println("Unique Number in array is: ");
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j] && i != j) {
					arr[j] = 0;
					count++;
				}
			}
			if (arr[i] != 0)
				System.out.println(arr[i] + ".......>" + count);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 10, 11, 11, 10, 5, 6, 5, 6, 5, 5, 4 };
		ArrayNumberPrintWithFrequency asrwc = new ArrayNumberPrintWithFrequency();

		asrwc.getArrayStringRepeatedWordsPrint(arr);

	}
}
