/*Assignment - 30 : 28th Sep'2022
Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 
*/

package deepakPatil.Assignment30ArrayDuplicateNumber;

import java.util.Arrays;

public class Assignment30{
	
	void findDuplicateNumber(int[]arr){
		
		for(int index=0;index<arr.length;index++){
			boolean flag=false;
			for(int innerIndex=index+1; innerIndex<arr.length;innerIndex++){
				if(arr[index]!=0 && arr[index]==arr[innerIndex]){
					arr[innerIndex]=0;
					flag=true;
				}
			}
			if(flag) {
				System.out.println(arr[index]);
			}
		}
	}
	
	public static void main(String[]args){
		int[]input ={10,12,44,12,77,67,12,44};
		System.out.println("Given input array is :"+Arrays.toString(input));
		System.out.println("Duplicate numbers from given array is as below :");
		new Assignment30().findDuplicateNumber(input);
	}
}	