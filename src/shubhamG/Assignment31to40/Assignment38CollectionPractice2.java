package shubhamG.Assignment31to40;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Program 2: 
Increse student marks by 10 if marks is less than 35.

input : [23,55,34,88,58,81]
output : [33,55,44,88,58,81]
*/		
public class Assignment38CollectionPractice2 {

	ArrayList<Integer> increaseMarksOfStudent(ArrayList<Integer> marks) {
		for (int num : marks) {
			if (num < 35) {
				int i = marks.indexOf(num);
				marks.set(i, num + 10);
			}
		}
		return marks;
	}

	public static void main(String[] args) {
		Assignment38CollectionPractice2 increaseMarks = new Assignment38CollectionPractice2();

		Integer[] marks = { 23, 55, 34, 88, 58, 81 };
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(marks));
		System.out.println("Given Input Array List is :\n" + marksList);
		ArrayList<Integer> output = increaseMarks.increaseMarksOfStudent(marksList);
		System.out.println("\nList after adding 10 marks for marks less then 35 is \n" +output);
	}

}
