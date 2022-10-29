/*Program 4 : Remove duplicates from array containing numbers [insertion order].
input : {10,10,13,12,12,10,55,66,55,11}
output : [10,13,12,55,66,11]*/
package ankitaBarwad;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class A39_RemoveDuplicatesFromArray {

	Set<Integer> getUniqueNumberArray(Integer arr[]) {
		Set<Integer> setNumbers = new LinkedHashSet<Integer>();
		System.out.println("Input String : " + Arrays.toString(arr));
		for (Integer num : arr) {
			setNumbers.add(num);
		}
		return setNumbers;
	}

	public static void main(String[] args) {
		System.out.println("Program 4 : Remove duplicates from array containing numbers [insertion order]");
		Integer input[] = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		Set<Integer> newSetNumbers = new A39_RemoveDuplicatesFromArray().getUniqueNumberArray(input);
		System.out.println("Output String : " + newSetNumbers);
	}
}
