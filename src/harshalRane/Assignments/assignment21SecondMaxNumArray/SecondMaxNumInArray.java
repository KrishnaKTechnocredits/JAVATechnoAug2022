package harshalRane.Assignments.assignment21SecondMaxNumArray;

import java.util.Arrays;

public class SecondMaxNumInArray {
	
	int getMaxNum(int[] num) {
		int maxNum=num[0];
		int secondMaxNum=num[1];
		
		for(int index=1;index<num.length;index++) {
			if(num[index]>maxNum) {
				secondMaxNum= maxNum;
				maxNum = num[index];
			}
			else if(num[index] > secondMaxNum && num[index] < maxNum) {
				secondMaxNum = num[index];
			}		
		}
		return secondMaxNum;
	}
	
	public static void main(String[] args) {
		SecondMaxNumInArray a = new SecondMaxNumInArray();
		int[] input = {10,19,76,22,44,81,23};
		int output = a.getMaxNum(input);
		System.out.println(Arrays.toString(input));
		System.out.println("Second highest number in given array is: " +output);
	}
}
