/*Program 7 : Remove duplicates from array containing numbers using List.
input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]*/
package ankitaBarwad;

import java.util.ArrayList;
import java.util.Arrays;

public class A39_DuplicateNumbersFromArrayUsingList {
	ArrayList<Integer> getDuplicateNumbers(Integer[] numArr){
		System.out.println(Arrays.toString(numArr));
		ArrayList<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(numArr));
		ArrayList<Integer> listNumbers = new ArrayList<Integer>();

		for(Integer num : listOfNum) {
			if(listOfNum.indexOf(num)!= listOfNum.lastIndexOf(num)&& !listNumbers.contains(num)) {
				listNumbers.add(num);
			}
		}
		return listNumbers;
	}

	public static void main(String[] args) {
		System.out.println("Program 7 : Remove duplicates from array containing numbers using List");
		Integer numArr[] = {10,10,13,12,12,10,55,66,55,11,11};
		ArrayList<Integer> newSetNumbers = new A39_DuplicateNumbersFromArrayUsingList().getDuplicateNumbers(numArr);
		System.out.println(newSetNumbers);
	}
}
