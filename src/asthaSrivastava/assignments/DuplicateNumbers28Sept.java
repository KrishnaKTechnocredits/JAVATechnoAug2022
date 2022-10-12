/*Assignment - 30 : 28th Sep'2022

Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 

Hint : 2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)


if(arr[i] == arr[j] && i!=j){
	arr[j] = 0;
}
*/
package asthaSrivastava.assignments;

public class DuplicateNumbers28Sept {

	// print Duplicate Numbers
	void getDuplicateNum(int[] arr) {
		System.out.println("Duplicate Numbers from given array is");
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j] && i != j) {
					arr[j] = 0;
					count++;

				}
			}
			if (count > 1 && arr[i] != 0)
				System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		DuplicateNumbers28Sept num = new DuplicateNumbers28Sept();
		int[] input = { 10, 12, 44, 12, 77, 67, 12, 44 };
		num.getDuplicateNum(input);
	}

}
