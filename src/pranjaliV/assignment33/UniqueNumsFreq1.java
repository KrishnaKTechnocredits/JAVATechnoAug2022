/*

Assignment - 33 : 10th Oct'2022

Program 2 : print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55
*/

package pranjaliV.assignment33;

import java.util.Arrays;

public class UniqueNumsFreq1 {
	
	void printUniqueNumFreq1(int[] input) {
		for(int index=0; index<input.length; index++) {
			boolean flag = true;
			for(int innerIndex=index+1; innerIndex<input.length; innerIndex++) {
				if(input[index]==input[innerIndex] && index!=innerIndex) {
					input[innerIndex] = 0;// make the inner index zero so that we stop considering that num
					flag=false;
				}
			}
			if (flag && input[index]!=0) {//check if the flag is not changed and if the num is not 0 i.e if it has been 0 for being repeated
				System.out.println(input[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		UniqueNumsFreq1 ex33 = new UniqueNumsFreq1();
		System.out.println("------------------------------");
		System.out.println("Program 2 : print unique numbers from given array (having freq 1). ");
		int[] input2 = {10,20,10,44,33,55,33};
		System.out.println("Input = "+Arrays.toString(input2));
		System.out.println("Output:");
		ex33.printUniqueNumFreq1(input2);
		System.out.println("");

	}

}
