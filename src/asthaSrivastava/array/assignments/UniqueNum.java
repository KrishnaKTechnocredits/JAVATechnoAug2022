/*Program 2 : print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55*/
package asthaSrivastava.array.assignments;

public class UniqueNum {
//method to print unique Numbers
	void printUniqueNum(int[] arr) {
		int count = 0;
		System.out.println("Unique numbers are :");
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 0;
					count++;
				}
			}
			if (count == 1 && arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		UniqueNum test = new UniqueNum();
		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		test.printUniqueNum(input);
	}
}
