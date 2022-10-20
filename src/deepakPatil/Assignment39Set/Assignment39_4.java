/*Assignment 39 : 15th Oct'2022 
Program 5 : Remove duplicates from array containing numbers [natural order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,11,12,13,55,66]
 */

package deepakPatil.Assignment39Set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Assignment39_4 {
	
	Set<Integer> removeDuplicateFromArray(Integer[]nums){
		
		Set<Integer> updatedSet=new TreeSet<Integer>(Arrays.asList(nums));
		return updatedSet;
	}
	
	public static void main(String[] args) {
		Integer[]nums={10,10,13,12,12,10,55,66,55,11};
		System.out.println("Given number array is:");
		System.out.println(Arrays.toString(nums));
		System.out.println("Set in natural order after removing duplicates: ");
		System.out.println(new Assignment39_4().removeDuplicateFromArray(nums));
	}
}
