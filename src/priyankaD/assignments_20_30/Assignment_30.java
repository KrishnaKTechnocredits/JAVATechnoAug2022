package priyankaD.assignments_20_30;

import java.util.Arrays;

public class Assignment_30 {
		/*Assignment - 30 :Find duplicate numbers from given array.
		input : {10,12,44,12,77,67,12,44};
		output : 12
		         44*/
		void getDuplicateNumFromArray(int[]arr) {
			for(int index=0;index<arr.length;index++) {
				int count=0;
				for(int j=index+1;j<arr.length;j++) {
					if(arr[index]==arr[j]&& arr[index]!=0) {
						count++;
						arr[j]=0;
						}
				  }
				if(count>0) {
					System.out.println(arr[index]);
					arr[index]=0;
				}
			}
		}
		public static void main(String[]args) {
			Assignment_30 assignment=new Assignment_30();
			int[] arr= {10,12,44,12,77,67,12,44};
			System.out.println("Input->"+Arrays.toString(arr));
			System.out.println("Duplicate Numbers in given array are->");
			assignment.getDuplicateNumFromArray(arr);
		}
		
}
