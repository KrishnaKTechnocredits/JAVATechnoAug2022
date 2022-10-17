/*program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello
         ptc
*/

package namratamishra_assignment_33_Array_Operations;

public class ArrayStringDuplicateWordsPrint {

	void getArrayStringRepeatedWordsPrint(String[] arr)

	{
		System.out.println("The duplicates name in given array is: ");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equalsIgnoreCase(arr[j]))

				{
					count++;
					arr[j] = " ";

				}

			}
			if (count >= 1 && arr[i] != " ")
				System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		String[] arr = { "Hi", "Hello", "Techno", "Globant", "ptc", "ptc", "Hello" };
		ArrayStringDuplicateWordsPrint asrwc = new ArrayStringDuplicateWordsPrint();

		asrwc.getArrayStringRepeatedWordsPrint(arr);

	}
}
