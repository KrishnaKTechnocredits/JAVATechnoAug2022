/*Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 */

package manjiri.arrayEx.assignment30;

import java.util.Arrays;

public class SearchDuplicateNumbers {
	
	void printDuplicateNumbersFromArray(int[] input){
		int count = 0;
		
		System.out.println("Input Array is: " + Arrays.toString(input));
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Duplicate Numbers are: ");
		
		//Check if input array contains 0
		for (int index = 0;  index < input.length; index++) {
			if (input[index] == 0)
				count++;
		}
		
		//if zeros are not present in input array, check for duplicate elements
		if (count == 0) {
			for (int index = 0; index < input.length; index++) {
				boolean flag = false;
				//after replacing array element with zero, no need to check again for 0
				if (input[index] != 0 ) { 
					for (int innerIndex = index+1; innerIndex < input.length; innerIndex++) {
						if((input[index] == input[innerIndex]) && (index != innerIndex )) {
							input[innerIndex] = 0;
							flag = true;
						}
					}
					if(flag) {
						System.out.println(input[index]);
					}
				}	
			}
		}
	}
	
	public static void main(String[] args) {
		int[] inputArr = {10,12,44,12,77,67,12,44};
		
		new SearchDuplicateNumbers().printDuplicateNumbersFromArray(inputArr);
	}
}
