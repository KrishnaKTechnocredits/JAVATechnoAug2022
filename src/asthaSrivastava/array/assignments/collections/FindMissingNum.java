/*Program 2 : Find missing numbers from give array from 50 to 60.
input : {60,54,51,57}
output : [50,52,53,55,56,58,59]*/
package asthaSrivastava.array.assignments.collections;

import java.util.*;

public class FindMissingNum {
//method to find missing number
	void findMissingNumFromArrayList(ArrayList<Integer> listOfNum) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (int i = 50; i <= 60; i++) {
			newList.add(i);
			newList.removeAll(listOfNum);
		}
		System.out.println("Missing number are :" + newList);
	}

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(60, 54, 51, 57));
		new FindMissingNum().findMissingNumFromArrayList(numList);
	}
}