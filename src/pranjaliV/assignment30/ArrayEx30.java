/*
Assignment - 30 : 28th Sep'2022

Find duplicate numbers from given array.

input : {10,12,44,12,77,67,12,44};
output : 12 44 

Hint : 

2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)

if(arr[i] == arr[j] && i!=j){ arr[j] = 0; }
*/

package pranjaliV.assignment30;

import java.util.Arrays;

public class ArrayEx30 {
	
	void getDuplicateNum(int[] input) {
		System.out.println("To find duplicate members in given array");
		System.out.println("Input :"+ Arrays.toString(input) );
		System.out.println("Output :   ");
		for(int index=0; index<input.length; index++) {//to decide the num to be compared
			int count = 0;
			for(int innerIndex=index+1; innerIndex<input.length;innerIndex++) {//to compare the num with all members of array
				//if num at outer index matches the num at inner index and index are not same and the num to be compared is not 0
				if( (input[index]==input[innerIndex]) && (index!=innerIndex) && (input[index]!=0) ) {
					count++;
					input[innerIndex]=0;
				}
			}
			if(count>0) {
				System.out.println(input[index]);
				input[index]=0;
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayEx30 ex30 = new ArrayEx30();
		int[] input = {10,12,44,12,77,67,12,44};
		ex30.getDuplicateNum(input);
	}

}
