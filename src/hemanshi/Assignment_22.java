package hemanshi;
import java.util.Arrays;

public class Assignment_22 {
	
	 int[] dataArray(int[] inputArray) {
		 
		 for(int i=0; i<inputArray.length-1; i++) {
			 if(inputArray[i]>inputArray[i+1]) {
					inputArray[i]=0;
		 }
		 
	 }
		 return inputArray;

}
	 public static void main(String args[]) {
		 Assignment_22 assignment_22 = new Assignment_22();
		

			System.out.println("Program to replace current index number with 0.");
			int[] input = {10,20,30,22,44,21,92,89};
			System.out.println("\nInput Array: "+Arrays.toString(input));
			int[] output = assignment_22.dataArray(input);
			System.out.println("Output Array: "+Arrays.toString(output));

	 }
}
