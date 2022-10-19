/*Program 2: 
Increse student marks by 10 if marks is less than 35.

input : [23,55,34,88,58,81]
output : [33,55,44,88,58,81]
*/
package gauravSahu;

import java.util.ArrayList;

public class Assignment38B {

	void increaseMarks(ArrayList<Integer> array, int incMarks) {
		for (int i = 0; i < array.size(); i++) {
			int num = array.get(i);
			if (num < 35) {
				array.set(i, num += 10);
			}
		}
		System.out.println("Output Integer Array :  " + array);
	}

	public static void main(String[] args) {
		Assignment38B a38 = new Assignment38B();
		int[] input = { 23, 55, 34, 88, 58, 81 };
		ArrayList<Integer> listOfInteger = new ArrayList<Integer>();
		for (int num : input) {
			listOfInteger.add(num);
		}
		System.out.println("Program 38 : Increse student marks by 10 if marks is less than 35. ");
		System.out.println("Input Integer array : " + listOfInteger);

		int incMarks = 10;
		a38.increaseMarks(listOfInteger, incMarks);

	}

}
