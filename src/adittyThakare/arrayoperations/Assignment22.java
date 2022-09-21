package adittyThakare.arrayoperations;
import java.util.Arrays;

/*Assignment - 22 : 15th Sep'2022

Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}
*/

public class Assignment22 {
	
	int[] processArray(int[] inputArray) {
		
		for(int i=0;i<inputArray.length-1;i++) {
			if(inputArray[i]>inputArray[i+1]) {
				inputArray[i]=0;
			}
		}
		return inputArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment22 assignment22 = new Assignment22();
		
		System.out.println("Program to replace current index number with 0, if index+1 number is smaller then index number.");
		int[] input = {10,20,30,22,44,21,92,89}, input1 = {10,8,48,55,44,51,92,89};;
		
		System.out.println("\nInput Array: "+Arrays.toString(input));
		int[] output = assignment22.processArray(input);
		System.out.println("Output Array: "+Arrays.toString(output));
		
		System.out.println("\nInput Array: "+Arrays.toString(input1));
		int[] output1 = assignment22.processArray(input1);
		System.out.println("Output Array: "+Arrays.toString(output1));
	}

}
