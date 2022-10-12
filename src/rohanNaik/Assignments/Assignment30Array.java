/*Assignment - 30 : 28th Sep'2022

Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 

Hint : 2 for loop, think about replacement stretagy (the number you compare,
 replace that number with other number)


if(arr[i] == arr[j] && i!=j){
	arr[j] = 0;
}
*/
package rohanNaik.Assignments;

public class Assignment30Array {

	void duplicateNum(int[] input) {
		int arr[] = input;
		int innerIndex = 0;

		for (int index = 0; index < input.length; index++) {
			int flag = 0;
			for (innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if (arr[index] == arr[innerIndex] && index != innerIndex) {
					flag = 1;
					break;
				}
			}
			if (flag == 1)
				if (index < innerIndex)
					System.out.println(arr[index]);
		}
	}

	public static void main(String[] args) {

		Assignment30Array obj = new Assignment30Array();
		int[] input = { 10, 12, 44, 12, 77, 67, 12, 44 ,67};
		obj.duplicateNum(input);

	}

}
