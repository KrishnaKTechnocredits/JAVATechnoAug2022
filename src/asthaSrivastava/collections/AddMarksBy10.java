/*Program 2: 
Increse student marks by 10 if marks is less than 35.

input : [23,55,34,88,58,81]
output : [33,55,44,88,58,81]
*/
package asthaSrivastava.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class AddMarksBy10 {

	void getMarksByAdding10(ArrayList<Integer> numOfMarks) {
		System.out.println("Input Array is " + numOfMarks);
		for (int index = 0; index < numOfMarks.size(); index++) {
			int targetIndex = numOfMarks.get(index);
			if (targetIndex < 35) {
				numOfMarks.set(index, (targetIndex + 10));
			}
		}
	}

	public static void main(String[] args) {
		Integer[] numofList = {23,55,34,88,58,81};
		ArrayList<Integer> numOfMarks = new ArrayList<>(Arrays.asList(numofList));
		new AddMarksBy10().getMarksByAdding10(numOfMarks);
		System.out.println("Output array is : " + numOfMarks);
	}
}
