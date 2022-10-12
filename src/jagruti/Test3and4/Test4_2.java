package jagruti.Test3and4;

import java.util.Arrays;

public class Test4_2 
{
	int returnCount(int[] number) {
		int count = 1;
		int maxNum = number[0];
		for (int index = 1; index < number.length; index++) {
			if (maxNum < number[index]) {
				maxNum = number[index];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Test4_2 test4 = new Test4_2();
		int[] input1 = { 3, 7, 5 };
		int[] input2 = { 3, 5, 11, 9, 10, 13 };
		System.out.println(Arrays.toString(input1)+ "\n" +test4.returnCount(input1));
		System.out.println(" ");
		System.out.println(Arrays.toString(input2)+ "\n" +test4.returnCount(input2));
	}

}
