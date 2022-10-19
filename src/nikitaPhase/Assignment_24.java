package nikitaPhase;

import java.util.Arrays;

public class Assignment_24 {
	void getArrayOfOtherElements(int[] input){
		int[] output= new int[input.length];//to create array to store members other than give index
		for(int i=0; i<input.length; i++){ // to traverse within the array
			int sum =0;
			for (int j=0;j<input.length;j++){//to store other members of input array in output array
				if(i!=j){
					sum= sum + input[j];
				}
			}
			output[i] = sum;
		}
		System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		Assignment_24 arr = new Assignment_24();
		int[] input = {12,2,11,17};
		arr.getArrayOfOtherElements(input);
	}
}
