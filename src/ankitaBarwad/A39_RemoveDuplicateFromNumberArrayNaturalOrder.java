/*Program 5 : Remove duplicates from array containing numbers [natural order].
input : {10,10,13,12,12,10,55,66,55,11}
output : [10,11,12,13,55,66]*/
package ankitaBarwad;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class A39_RemoveDuplicateFromNumberArrayNaturalOrder {
	Set<Integer> getUniqueNumberArray(Integer arr[]){
		System.out.println(Arrays.toString(arr));
		Set<Integer> setNumbers = new TreeSet<Integer>();
		for(Integer num : arr) {
			setNumbers.add(num);
		}
		return setNumbers;
	}

	public static void main(String[] args) {
		System.out.println("Program 5 : Remove duplicates from array containing numbers [natural order]");
		Integer input[] = {10,10,13,12,12,10,55,66,55,11};
		Set<Integer> newSetNumbers = new A39_RemoveDuplicateFromNumberArrayNaturalOrder().getUniqueNumberArray(input);
		System.out.println(newSetNumbers);
	}
}
