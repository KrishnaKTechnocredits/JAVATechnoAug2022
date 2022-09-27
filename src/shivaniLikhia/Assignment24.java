/*Assignment - 24 : 17th Sep'2022 [program complexity : medium, expected time : 30 mins]
Write a method to replace element with sum of other elements.
input : {12,2,11,17}
output : {30,40,31,25}*/

package shivaniLikhia;
import java.util.Arrays;

public class Assignment24 {

	int[] sumOfAllExceptOne(int[] arr) {
		int[] output = new int[arr.length];
		for(int i =0;i<arr.length;i++) {
			int sum =0;
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					sum = sum + arr[j];
				}
			}
			output[i] = sum;
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		int[] input = {12,2,11,17};
		System.out.println("Input Array : " +Arrays.toString(input));
		int[] output = assignment24.sumOfAllExceptOne(input);
		System.out.println("Output Array : " +Arrays.toString(output));
	}
}
