/*1) Write a method to return sum of all numbers in given array.
input : {10,11,15}
output : 36*/

package manjiri.arrayEx;

public class ArrayEx1 {
	
	int getSumOfAllNumbersInArray(int[] arr) {
		int sum = 0;
		for(int index = 0; index < arr.length; index++) {
			sum += arr[index];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int[] intArr = {10,11,15};
		System.out.println("Sum of all numbers in an array is: "+new ArrayEx1().getSumOfAllNumbersInArray(intArr));
	}
}
