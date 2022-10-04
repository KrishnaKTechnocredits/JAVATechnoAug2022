
/*
 * Program 6 : print unique numbers from given array (all content uniquely). 
input : {10,20,10,44,33,55,33};
output : 10 
         20
 */
package hindaviIngle;

import java.util.Arrays;

public class Assignment33_uniqueNumFromArray {
	
	void printUniqueNumbers(int[] input){

		for(int i=0; i<input.length;i++){
			for(int j=i+1;j<input.length;j++){				
				if(input[i]==input[j])
					input[j]=0;
			}
			if(input[i]!=0)
			System.out.println(input[i]);
		}
	}

	public static void main(String[] args){
		Assignment33_uniqueNumFromArray a=new Assignment33_uniqueNumFromArray();
		System.out.println("print unique numbers from given array (all content uniquely)");
		int[] input = {10,20,10,44,33,55,33};
		System.out.println("Input:" +Arrays.toString(input));
		a.printUniqueNumbers(input);
	}
	

}
