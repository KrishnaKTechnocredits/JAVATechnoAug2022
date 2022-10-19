/*Program 2: Increase student marks by 10 if marks is less than 35.

input : [23,55,34,88,58,81]
output : [33,55,44,88,58,81]*/


package sagarY.Assignment_38;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IncreaseStudMarksBy10 {
	
	void increaseStudMarksBy10(ArrayList<Integer> listOfNum) {
		ArrayList<Integer> output = new ArrayList<Integer>(listOfNum);
		
		for(int index=0;index<listOfNum.size();index++) {
			int num=listOfNum.get(index);
			if(num<35)
				output.set(index, (num+10));
		}
		System.out.println("\nOutput after addind 10 if element is less than 35: ");
		System.out.println(": "+output);
	}

	
	public static void main(String[] args) {
		System.out.println("Program 2: Increase student marks by 10 if marks is less than 35.");
		System.out.println("-----------------------------------------------------------------");
		int[] input = {23,55,34,88,58,81};
		ArrayList<Integer> listOfNum = new ArrayList<Integer>();
		for(int index=0;index<input.length;index++) {
			listOfNum.add(input[index]);
		}
		System.out.println("Input: "+listOfNum);
		IncreaseStudMarksBy10 num = new IncreaseStudMarksBy10();
		num.increaseStudMarksBy10(listOfNum);
		
	}
}
