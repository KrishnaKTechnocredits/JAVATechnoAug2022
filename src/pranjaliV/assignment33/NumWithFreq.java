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

package pranjaliV.assignment33;
import java.util.Arrays;

public class NumWithFreq {
	
	void printNumWithFreq(int[] input) {
		for(int index=0; index<input.length; index++) {
			int count=1;
			for(int innerIndex=0; innerIndex<input.length; innerIndex++) {
				if(input[index]==input[innerIndex] && index!=innerIndex) {
					count++;
					input[innerIndex]=0;
				}
			}
			if(count>=1 && input[index]!=0) {
				System.out.println(input[index] + " -> " + count);
			}
		}
	}
	
	public static void main(String[] args) {
		NumWithFreq ex33 = new NumWithFreq();
		
		System.out.println("------------------------------");
		System.out.println("Program 7 : print each number with its frequency. ");
		int[] input7 = {10,11,11,10,5,6,5,6,5,5,4};
		System.out.println("Input = "+Arrays.toString(input7));
		System.out.println("Output:");
		ex33.printNumWithFreq(input7);
		System.out.println("");
	}

}
