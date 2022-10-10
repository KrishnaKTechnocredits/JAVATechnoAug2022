/* Program 6 : print unique numbers from given array (all content uniquely). 
input : {10,20,10,44,33,55,33};
output : 10 
         20
         44
		 33 
		 55*/
package gauravSahu;

import java.util.Arrays;

public class Assignment33F {

	void getUniqueNum(int[] input) {
		System.out.print("Unique Number  : ");
		for (int i = 0; i < input.length; i++) {
			boolean flag = true;
			for (int j = 0; j < input.length; j++) {
				if (input[i] == input[j] && i != j) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print("  "+ input[i]);
			}

		}
	}

	public static void main(String[] args) {
		Assignment33F a33 = new Assignment33F();
		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("Given string : " + Arrays.toString(input));
		a33.getUniqueNum(input);
	}
}
