/*Program 3 : B) Print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8
*/

package swatiM.assignment.Assignment_33;

import java.util.Arrays;

class PrintMissingNumbers{	

	void printMissingNumbers(int[] input){
			int startR=01;
			int endR = 10;
		for(int i=startR;i<=endR;i++){
			boolean flag=true;
			for(int j=0;j<input.length;j++){
				if(i==input[j]){
					flag=false;
					break;
				}
			}
		if(flag)
			System.out.println("- > " +i);
		}
	}

	public static void main(String[] args){
		System.out.println("Program 3 : B) Print missing numbers from \ngiven array from range 1 to 10");
		System.out.println("---------------------------------------");
		int[] input = {1,3,9,5,6,10};
		System.out.println("Input Array: \n" + Arrays.toString(input));
		System.out.println("---------------------------------------");

		new PrintMissingNumbers().printMissingNumbers(input);
	}

}