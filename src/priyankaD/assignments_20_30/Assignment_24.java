package priyankaD.assignments_20_30;
import java.util.Arrays;
public class Assignment_24 {
	//Write a method to replace element with sum of other elements.
	//input : {12,2,11,17}
	//output : {30,40,31,25}
		int[] getNumberReplaceWithSumOfOtherNum(int[] input) {
			int[] output=new int[input.length];
			for(int i=0;i<input.length;i++) {
				int sum=0;
				for(int j=0;j<input.length;j++) {
					if(i!=j) {
						sum=sum+input[j];
					}
					output[i]=sum;
				}
			}
		     return output;
		}
		public static void main(String[] args) {
			Assignment_24 assignment_24=new Assignment_24();
			int[] input= {12,2,11,17};
			System.out.println("input array"+Arrays.toString(input));
			int[] output=assignment_24.getNumberReplaceWithSumOfOtherNum(input);
			System.out.println("output array"+Arrays.toString(output));
		}
}
