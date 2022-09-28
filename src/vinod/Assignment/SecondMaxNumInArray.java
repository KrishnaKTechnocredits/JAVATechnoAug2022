package vinod.Assignment;

import java.util.Arrays;

public class SecondMaxNumInArray {
	
	int getMaxNum(int[] num) {
		int MaxNum = num[0];
				int SecondMaxNum = num[1];
		for (int index=1; index<num.length; index++) {
			if(num[index]>MaxNum) {
				MaxNum = num[index];
			}
			else if (num[index]>SecondMaxNum && num[index] < MaxNum) {
				SecondMaxNum = num[index];
			}
			
		}
		return SecondMaxNum;
	}
	public static void main(String[] args) {
		SecondMaxNumInArray secondMaxNumInArray = new SecondMaxNumInArray();
		int[] input = {10,19,76,22,44,81,23};
		int output = secondMaxNumInArray.getMaxNum(input);
		System.out.println(Arrays.toString(input));
		System.out.println("Second Highest number in Array is :"+output);
	}

}
