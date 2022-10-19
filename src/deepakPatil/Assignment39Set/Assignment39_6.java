/*Assignment 39 : 15th Oct'2022
Program 7 : Remove duplicates from array containing numbers using List.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]
 */

package deepakPatil.Assignment39Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment39_6 {
	
	List<Integer> removeDuplicatesUsingList(Integer[]arr){
		
		List<Integer> numList= new ArrayList<Integer>(Arrays.asList(arr));
		List<Integer> output= new ArrayList<Integer>();
		
		for(int num:arr) {
			
			if(numList.indexOf(num)!= numList.lastIndexOf(num) &&!output.contains(num))
				output.add(num);
		}
		return output;
	}
	
	public static void main(String[] args) {
		Integer[]nums={10,10,13,12,12,10,55,66,55,11,11};
		System.out.println("Given number array is:");
		System.out.println(Arrays.toString(nums));
		System.out.println("List after removing duplicates: ");
		System.out.println(new Assignment39_6().removeDuplicatesUsingList(nums));
	}
	
}
