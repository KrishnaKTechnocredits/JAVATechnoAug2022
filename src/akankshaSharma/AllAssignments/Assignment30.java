//Find duplicate numbers from given array.
//input : {10,12,44,12,77,67,12,44};
//output : 12
//        44 

package akankshaSharma.AllAssignments;

public class Assignment30 {
	public static void main(String[] args) {

		int[] arr = new int[] { 10, 12, 44, 12, 77, 67, 12, 44 };

		System.out.println("Duplicate elements in given array: ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}
}
