/*program 3 : print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8
	   */
package namratamishra_assignment_33_Array_Operations;

public class ArrayPrintMissingNumber1to10InArray {

	void getArrayStringRepeatedWordsPrint(int[] arr)

	{

		System.out.println("Missing Number in array is: ");
		for (int i = 1; i <= 10; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(i);
			}

		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 9, 5, 6, 10 };
		ArrayPrintMissingNumber1to10InArray asrwc = new ArrayPrintMissingNumber1to10InArray();
		asrwc.getArrayStringRepeatedWordsPrint(arr);

	}
}
