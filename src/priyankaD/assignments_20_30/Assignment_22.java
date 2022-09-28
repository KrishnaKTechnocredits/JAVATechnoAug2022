package priyankaD.assignments_20_30;
import java.util.Arrays;
public class Assignment_22 {
//Replace current index number with 0, if index+1 number is smaller then index number.
//int[] arr = {10,20,30,22,44,21,92,89};
//output : {10,20,0,22,0,21,0,89}
		int[] getOutput(int[] arr) {
		   for(int index=0;index<arr.length-1;index++) {
				if(arr[index]>arr[index+1]) {
					arr[index]=0;
				}
			}
		   return arr;
		}
		public static void main(String[] args) {
			Assignment_22 result=new Assignment_22();
			int[] arr= {10,20,30,22,44,21,92,89};
			 System.out.println(Arrays.toString(arr));
			int[] output=result.getOutput(arr);	
			 System.out.println(Arrays.toString(output));
		}
}
