/*Program 3 : Print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8
*/

package sagarY.Assignment_33;
import java.util.Arrays;

class PrintMissingNumber{
	
	void printMissingNumber(int[] input,int n){
		
		int originalSum = n*(n+1)/2;
		int obtainedSum = 0;
		
		for(int i=0; i<input.length;i++){			
			obtainedSum=obtainedSum+input[i];
		}
		System.out.println("Missing Number in array is: " +(originalSum-obtainedSum));
	}
	
	public static void main(String[] args){
		System.out.println("Program 3 : A) Print missing numbers from \ngiven array from range 1 to 10");
		System.out.println("---------------------------------------");
		int[] input = {1,3,9,5,6,7,2,4,10};
		System.out.println("Input Array: \n" + Arrays.toString(input));
		System.out.println("---------------------------------------");

		new PrintMissingNumber().printMissingNumber(input,10);
	}
	
}