package smitaVetal;

import java.util.Arrays;

class VisibleTrees{

	int getCountOfTrees(int[] input){
		int count =0;
		int max = 0;
		for(int index= 0;index<input.length;index++){
			if(max<input[index]){
			max=input[index];
			count++;
			}
		}
	return count;
	}
	public static void main(String[] args){
		VisibleTrees array = new VisibleTrees();
		
		int[] input1 = {3,7,5};
		int count1 = array.getCountOfTrees(input1);
		System.out.println("Trees visible in given array " + Arrays.toString(input1) + " are " + count1);
		
		int[] input2 = {3,5,11,9,10,13};
		int count2 = array.getCountOfTrees(input2);
		System.out.println("Trees visible in given array " + Arrays.toString(input2) + " are " + count2);
		
	}

}