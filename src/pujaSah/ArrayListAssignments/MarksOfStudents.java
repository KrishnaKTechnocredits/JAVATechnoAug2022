/*/*Assignment - 38 : 14th Oct'2022
Program 2: 
Increase student marks by 10 if marks is less than 35.

input : [23,55,34,88,58,81]
output : [33,55,44,88,58,81]*/

package pujaSah.ArrayListAssignments;

import java.util.ArrayList;
import java.util.Arrays;

public class MarksOfStudents {

	// method to increase student marks by 10 if marks is less than 35
	void displayUpdatedMarks(ArrayList<Integer> listOfMarks) {
		System.out.println("Original list of marks of students: " + listOfMarks);
		ArrayList<Integer> newListOfMarks = new ArrayList<Integer>();
		for (int marks : listOfMarks) {
			if (marks < 35) {
				newListOfMarks.add(marks + 35);
			} else {
				newListOfMarks.add(marks);
			}
		}
		System.out.println("Updated list of marks: " + newListOfMarks);
	}

	public static void main(String[] args) {
		Integer[] intArr = { 23, 55, 34, 88, 58, 81 };
		ArrayList<Integer> stuMarks = new ArrayList<Integer>(Arrays.asList(intArr));

		new MarksOfStudents().displayUpdatedMarks(stuMarks);
	}
}
