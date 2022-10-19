/*Assignment 39 : 15th Oct'2022
Program 4 : Remove duplicates from array containing numbers [insertion order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,13,12,55,66,11]
*/

package deepakPatil.Assignment39Set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment39_3 {
	
	Set<Integer> removeDuplicatesFromArray(Integer[]nums){
		
		Set<Integer>updatedSet=new LinkedHashSet<Integer>(Arrays.asList(nums));
		return updatedSet;
	}

	public static void main(String[] args) {
		Integer[]nums={10,10,13,12,12,10,55,66,55,11};
		System.out.println("Given number array is:");
		System.out.println(Arrays.toString(nums));
		System.out.println("Set after removing duplicates: ");
		System.out.println(new Assignment39_3().removeDuplicatesFromArray(nums));
	}

}
