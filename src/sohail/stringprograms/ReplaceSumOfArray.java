//Assignment - 24 : 17th Sep'2022 
//[program complexity : medium, expected time : 30 mins]
//Write a method to replace element with sum of other elements.
//input : {12,2,11,17}
//output : {30,40,31,25}
package sohail.stringprograms;

public class ReplaceSumOfArray {
	void processData(int[] inputArray) {
		int[] arr = new int[inputArray.length];
		for (int outerIndex = 0; outerIndex < inputArray.length; outerIndex++) {
			int sum = 0;
			for (int innerIndex = 0; innerIndex < inputArray.length; innerIndex++) {
				if (outerIndex != innerIndex) {
					sum = sum + inputArray[innerIndex];
				}
				arr[outerIndex] = sum;
			}
			System.out.print(" " + arr[outerIndex]);
		}
	}

	public static void main(String[] args) {
		ReplaceSumOfArray replacesumofarray = new ReplaceSumOfArray();
		int[] inputArray = { 12, 2, 11, 17 };
		replacesumofarray.processData(inputArray);
	}
}
