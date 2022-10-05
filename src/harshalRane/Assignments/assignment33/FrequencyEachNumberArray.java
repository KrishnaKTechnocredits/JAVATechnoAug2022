/*
 * program 7 : print each number with its frequency. 
input : {10,11,11,10,5,6,5,6,5,5,4}
output : 10 -> 2
         11 -> 2
          5 -> 4
         6 -> 2
         4 -> 1
 */
package harshalRane.Assignments.assignment33;

import java.util.Arrays;

public class FrequencyEachNumberArray {
	void getFrequencyOfEachNumberInArray(int[] input) {
		System.out.println("Frequency of each number is: ");
		for(int index=0;index<input.length;index++) {
			int count=1;
			for(int innerIndex=index+1;innerIndex<input.length;innerIndex++) {
				if(input[index]==input[innerIndex] && input[index]!=0) {
					count++;
					input[innerIndex] = 0;
				}
			}
			if(input[index]!=0) {
				System.out.println(input[index]+ "-->" + count);
			}
		}
	}
	
	public static void main(String[] args) {
		FrequencyEachNumberArray f = new FrequencyEachNumberArray();
		int[] input = {10,11,11,10,5,6,5,6,5,5,4};
		System.out.println("Input Array "+ Arrays.toString(input));
		f.getFrequencyOfEachNumberInArray(input);
	}
}
