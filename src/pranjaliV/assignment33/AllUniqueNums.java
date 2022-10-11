/*

Assignment - 33 : 10th Oct'2022
Program 6 : print unique numbers from given array (all content uniquely). 
input : {10,20,10,44,33,55,33};
output : 10 
         20
         44
		 33 
		 55

*/

package pranjaliV.assignment33;

import java.util.Arrays;

public class AllUniqueNums {
	
	void printAllUniqueNum(int[] input) {
		for(int index=0; index<input.length; index++) {
			int count = 1;
			for(int innerIndex=0; innerIndex<input.length; innerIndex++) {
				if(input[index]==input[innerIndex] && index!=innerIndex) {
					input[innerIndex] = 0;// make the inner index zero so that we stop considering  that num to be printed again
					count++;
				}
			}
			if (count>=1 && input[index]!=0) {//print the nums whose count is increased & is not 0 
				System.out.println(input[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		AllUniqueNums ex33 = new AllUniqueNums();
		System.out.println("------------------------------");
		System.out.println("Program 6 : print all unique numbers from given array. ");
		int[] input3 = {10,20,10,44,33,55,33};
		System.out.println("Input = "+Arrays.toString(input3));
		System.out.println("Output:");
		ex33.printAllUniqueNum(input3);
		System.out.println("");

	}
}