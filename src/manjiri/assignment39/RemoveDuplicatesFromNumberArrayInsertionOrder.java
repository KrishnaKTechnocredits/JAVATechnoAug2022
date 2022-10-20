/*Program 4 : Remove duplicates from array containing numbers [insertion order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,13,12,55,66,11]*/

package manjiri.assignment39;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromNumberArrayInsertionOrder {
		
		Set<Integer> getUniqueNumberArray(Integer arr[]){
			System.out.println(Arrays.toString(arr));
			System.out.println("-----------------------------------------");
			Set<Integer> setNumbers = new LinkedHashSet<Integer>();
			for(Integer num : arr) {
				setNumbers.add(num);
			}
			return setNumbers;
		}
	
	public static void main(String[] args) {
		Integer input[] = {10,10,13,12,12,10,55,66,55,11};
		Set<Integer> newSetNumbers = new RemoveDuplicatesFromNumberArrayInsertionOrder().getUniqueNumberArray(input);
		System.out.println(newSetNumbers);
	}
}
