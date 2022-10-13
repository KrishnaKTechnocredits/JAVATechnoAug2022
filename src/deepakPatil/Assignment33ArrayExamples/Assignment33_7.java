/*
Assignment - 33 : 10th Oct'2022
program 7 : print each number with its frequency. 
input : {10,11,11,10,5,6,5,6,5,5,4}
output : 10 -> 2
         11 -> 2
          5 -> 4
         6 -> 2
         4 -> 1
 */

package deepakPatil.Assignment33ArrayExamples;

import java.util.Arrays;

public class Assignment33_7 {
	
	void printNumbersFrequency(int[]num) {
		
		Assignment33_1 assignement33_1 = new Assignment33_1();
		int replaceNum = assignement33_1.getReplaceNum(num);
		
		for(int index=0; index<num.length;index++) {
			int count=1;
			if(num[index]!=replaceNum) {
				for(int innerIndex=index+1;innerIndex<num.length;innerIndex++) {
					if(num[index]==num[innerIndex]) {
						num[innerIndex]=replaceNum;
						count++;
					}
				}
				System.out.println(num[index]+"-->"+count);
			}
		}
	}
	
	public static void main(String[] args) {
		int[]num={10,11,11,10,5,6,5,6,5,5,4};
		System.out.println("Given input string array is: ");
		System.out.println(Arrays.toString(num));
		System.out.println("Printing number with its frequency from given array:");
		new Assignment33_7().printNumbersFrequency(num);
	}
}
