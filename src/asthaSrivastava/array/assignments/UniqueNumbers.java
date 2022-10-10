/*Program 6 : print unique numbers from given array (all content uniquely). 
input : {10,20,10,44,33,55,33};
output : 10 
         20
         44
		 33 
		 55*/
package asthaSrivastava.array.assignments;

public class UniqueNumbers {
	// method to print unique numbers
	void getUniqueNumbers(int[] arr) {
		System.out.println("Unique Numbers are: ");
		for (int index = 0; index < arr.length; index++) {
			int num = arr[index];
			boolean uniqueNumFlag = true;
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (num == arr[innerIndex] && index != innerIndex) {
					uniqueNumFlag = false;
					break;
				}
			}
			if (uniqueNumFlag) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		new UniqueNumbers().getUniqueNumbers(input);
	}
}
