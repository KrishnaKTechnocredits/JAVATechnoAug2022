/*Assignment - 38 : 14th Oct'2022

Program 2: 
Increse student marks by 10 if marks is less than 35.

input : [23,55,34,88,58,81]
output : [33,55,44,88,58,81]*/

package rashmiG.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListStudentMarks {

	ArrayList<Integer> getListOfMarks(ArrayList<Integer> listOfMarks) {
		for (int index = 0; index < listOfMarks.size(); index++) {
			if (listOfMarks.get(index) < 35 && listOfMarks.get(index) >= 0) {
				listOfMarks.set(index, listOfMarks.get(index) + 10);
			}
		}
		return listOfMarks;
	}

	public static void main(String[] args) {
		Integer[] input = { 23, 55, 34, 88, 58, 81, 0, -90 };
		List<Integer> list = Arrays.asList(input);
		ArrayList<Integer> listOfMarks = new ArrayList<Integer>(list);
		System.out.println("Original Marksheet\n" + listOfMarks);
		ArrayList<Integer> output = new ArrayListStudentMarks().getListOfMarks(listOfMarks);
		System.out.println("\nUpdated Marksheet\n" + output);
	}
}