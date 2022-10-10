package avni.returnTypeExample;
import java.util.Arrays;
public class Replace {
	//Write a method to replace element with sum of other elements.
		int[] getSumOfDigits(int[] input) {
			int[] output = new int[input.length];
			for(int i=0;i<input.length;i++) 
			{
				int sum=0;
				for(int j=0;j<input.length;j++) 
				{
					if(i!=j) {
						sum = sum + input[j];
					}
					output[i] = sum;
				}
			}
			return output;
		}
		public static void main(String[] args) {
			Replace rep = new Replace();
			
			int input[] = {12,8,15};
			System.out.println("Original Array : "+Arrays.toString(input));
			
			int output[] = rep.getSumOfDigits(input);
			System.out.println("Replaced sum of other elements : "+Arrays.toString(output));
		}
	}


