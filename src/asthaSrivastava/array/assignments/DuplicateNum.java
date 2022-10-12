/*Program 1: print duplicate numbers from given array. 

input : {10,20,10,44,33,55,33};
output : 10
		 33
*/
package asthaSrivastava.array.assignments;

public class DuplicateNum {

	// method to print duplicate Numbers
	void printDuplicateNumber(int[] arr) {
		int count = 0;
		System.out.println("Duplicate numbers are :");
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 0;
					count++;
				}
			}
			if (count > 1 && arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		DuplicateNum num = new DuplicateNum();
		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		num.printDuplicateNumber(input);
	}
}
