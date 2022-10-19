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

package deepakPatil.Assignment33ArrayExamples;

import java.util.Arrays;

public class Assignment33_6 {
	
	void printNumberOnes(int[]num) {
		
		Assignment33_1 assignement33_1 = new Assignment33_1();
		int replaceNum = assignement33_1.getReplaceNum(num);
		
		for(int index=0; index<num.length;index++) {
			if(num[index]!=replaceNum) {
				for(int innerIndex=index+1;innerIndex<num.length;innerIndex++) {
					if(num[index]==num[innerIndex]) {
						num[innerIndex]=replaceNum;
					}
				}
				System.out.println(num[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[]num={10,20,10,44,33,55,33};
		System.out.println("Given input string array is: ");
		System.out.println(Arrays.toString(num));
		System.out.println("Printing names once from given array:");
		new Assignment33_6().printNumberOnes(num);
	}

}
