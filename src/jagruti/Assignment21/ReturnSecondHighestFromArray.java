package jagruti.Assignment21;

import java.util.Arrays;

public class ReturnSecondHighestFromArray 
{
	int getMaxNum(int[] num) {
		int bigNum=num[0];
		int secondbigNum=num[1];
		
		for(int index=1;index<num.length;index++) {
			if(num[index]>bigNum) {
				secondbigNum= bigNum;
				bigNum = num[index];
			}
			else if(num[index] > secondbigNum && num[index] < bigNum) {
				secondbigNum = num[index];
			}		
		}
		return secondbigNum;
	}
	
	public static void main(String[] args) {
		ReturnSecondHighestFromArray a = new ReturnSecondHighestFromArray();
		int[] input = {10,19,76,22,44,81,23};
		int output = a.getMaxNum(input);
		System.out.println("Given Array : " +Arrays.toString(input));
		System.out.println("Second highest number in given array is: " +output);
	}
}
