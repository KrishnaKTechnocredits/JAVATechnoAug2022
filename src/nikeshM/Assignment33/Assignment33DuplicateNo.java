package nikeshM.Assignment33;

import java.util.Arrays;

//Program 1: print duplicate numbers from given array. 
//
//input : {10,20,10,44,33,55,33};
//output : 10
//		 33
public class Assignment33DuplicateNo {
	int[] getDuplicateNo(int[] input) {
		for (int index = 0; index < input.length; index++) {
			for (int innerindex = index + 1; innerindex < input.length; innerindex++) {
				if (input[index] == input[innerindex]) {
					
					System.out.println(input[innerindex]);
				}
			}
		}
		
		return input ;
	}
	public static void main(String[] args) {
		int [] input = {10,20,10,44,33,55,33,};
		Assignment33DuplicateNo p1 = new Assignment33DuplicateNo ();
		System.out.println("Data :" +Arrays.toString(input));
		 p1.getDuplicateNo(input);
				
	}
	
}