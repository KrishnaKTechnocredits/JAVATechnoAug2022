/*Program 7 : Remove duplicates from array containing numbers using List.
input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]*/

package manjiri.assignment39;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateNumbersFromArrayUsingList {
	
	ArrayList<Integer> getDuplicateNumbers(Integer[] numArr){
		System.out.println(Arrays.toString(numArr));
		System.out.println("---------------------------------------------");
		
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
		Integer numArr[] = {10,10,13,12,12,10,55,66,55,11,11};
		ArrayList<Integer> newSetNumbers = new DuplicateNumbersFromArrayUsingList().getDuplicateNumbers(numArr);
		System.out.println(newSetNumbers);
	}
}
