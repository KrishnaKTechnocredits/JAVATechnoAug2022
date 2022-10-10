/*Assignment - 30 : 28th Sep'2022

Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 

Hint : 2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)


if(arr[i] == arr[j] && i!=j){
	arr[j] = 0;
}*/

package shivaniLikhia;
import java.util.Arrays;

public class Assignment30 {

	void findDuplicateNumberFromArray(int[] arr) {
		System.out.println("Input Array : "+Arrays.toString(arr));
		System.out.println("--------------------------------------------------");
		System.out.println("The duplicte numbers from given array are : ");
		for(int index=0;index<arr.length;index++){
			int count = 0;
			for(int j =0;j<arr.length;j++) {
				if(index!=j && arr[index]==arr[j] && arr[index]!=0) {
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
	
	public static void main(String[] args) {
		int[] arr = {10,12,44,12,77,67,12,44};
		new Assignment30().findDuplicateNumberFromArray(arr);
	}
	
}
