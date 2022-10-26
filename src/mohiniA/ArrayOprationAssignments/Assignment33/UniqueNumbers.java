/*Program 2 : Print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55*/

package mohiniA.ArrayOprationAssignments.Assignment33;

import java.util.Arrays;

public class UniqueNumbers {
	
	void getUniqueNum(int[] input) {
		System.out.println("Unique numbers from given array");

		for (int i = 0; i < input.length; i++) {
			int count = 0;
			for (int j = 0; j < input.length; j++) {
				if (input[i] == input[j] && i != j) {
					count++;
				}
			}
			if (count == 0 && i != 0)
				System.out.println(input[i]);
		}
	}

	
	/*Program 6 : print unique numbers from given array (all content uniquely). *******/
	
	void printUniqueNum(int[] input){
		System.out.println("Output:Unique numbers from array are: ");
		
		for(int i=0; i<input.length;i++){
			for(int j=i+1;j<input.length;j++){				
				if(input[i]==input[j])
					input[j]=0;
			}
			if(input[i]!=0)
			System.out.println(input[i]);
		}
	}
	public static void main(String[] args) {
		System.out.println("Print unique numbers from given array (having freq 1)");
		System.out.println("------------------------------------------------");

		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("Input Array: \n" + Arrays.toString(input));
		System.out.println("-----------------------------------------------------");

		new UniqueNumbers().getUniqueNum(input);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Print unique numbers from given array (all content uniquely)");
		System.out.println("-------------------------------------------------------------");
		

		new UniqueNumbers().printUniqueNum(input);
		
	}

}
