/*
 Assignment - 33 : 10th Oct'2022
		 
program 3 : print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8
*/
package pranjaliV.assignment33;
import java.util.Arrays;

public class MissingNum {

	void printMissingNum(int start, int end, int[] input) {
		for(int num=start; num<=end; num++) {
			boolean isMissingNum = true;
			for(int index=0; index<input.length; index++) {
				if(num==input[index]) {
					isMissingNum = false;
					break;
				}
			}
			if(isMissingNum) {
				System.out.println(num);	
			}
		}
	}
	
	public static void main(String[] args) {
		MissingNum ex33 = new MissingNum();
		
		System.out.println("------------------------------");
		System.out.println("Program 3 : print missing numbers from given array from range 1 to 10.");
		int[] input3 = {1,3,9,5,6,10};
		System.out.println("Input = "+Arrays.toString(input3));
		System.out.println("Output:");
		ex33.printMissingNum(1,10,input3);
		System.out.println("");
	}

}
