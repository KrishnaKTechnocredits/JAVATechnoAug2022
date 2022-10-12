/*
 * Assignment - 30 : 28th Sep'2022

Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 

Hint : 2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)


if(arr[i] == arr[j] && i!=j){
	arr[j] = 0;
}
 */

package swatiM.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment30_DuplicateNumbers {

	// Method to display duplicate numbers from given array.
		void displayDuplicateNumbers(int[] inArr) {
			System.out.println("Input Array: " + Arrays.toString(inArr));
			System.out.println("Duplicate numbers in the array are: ");
			for (int index = 0; index < inArr.length; index++) {
				int count = 0;
				for (int innerIndex = 0; innerIndex < inArr.length; innerIndex++) {
					if (inArr[index] == inArr[innerIndex] && index != innerIndex && inArr[index] != 0) {
						count++;
						inArr[innerIndex] = 0;
					}
				}
				if (count > 0) {
					System.out.println(inArr[index]);
					inArr[index] = 0;
				}
			}
		}
		public static void main(String[] args) {
			//int[] arr = { 10, 12, 44, 12, 77, 67, 12, 44, 44, 33, 44, 12 };
			Scanner sc = new Scanner(System.in); 
			System.out.println("How many numbers you want to enter :");
			int length = sc.nextInt();
			int[] arr = new int[length];
			for(int index = 0 ; index < arr.length ; index++ ) {
				System.out.println("Please enter numbers :");
				arr[index] = sc.nextInt();				
			}
			new Assignment30_DuplicateNumbers().displayDuplicateNumbers(arr);
			//12System.out.println(Arrays.toString(arr));
		}
}
