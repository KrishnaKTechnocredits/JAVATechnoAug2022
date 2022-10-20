/*Assignment 39 : 15th Oct'2022
Program 6 : Remove duplicates from array containing numbers using Set.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11] 
 */

package deepakPatil.Assignment39Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment39_5 {

	Set<Integer>removeDuplicateUsingSet(Integer[]numArr){
		Set<Integer>returnSet = new HashSet<Integer>();
		Set<Integer> result= new LinkedHashSet<Integer>();
		
		for(int num:numArr) {
			
			if(!returnSet.add(num))
				result.add(num);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Integer[]nums={10,10,13,12,12,10,55,66,55,11,11};
		System.out.println("Given number array is:");
		System.out.println(Arrays.toString(nums));
		System.out.println("Set after removing duplicates: ");
		System.out.println(new Assignment39_5().removeDuplicateUsingSet(nums));
	}

}
