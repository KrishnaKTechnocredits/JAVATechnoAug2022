//1) Write a method to return sum of all numbers in given array.
//input : {10,11,15}
//output : 36
package shivaniLikhia;

public class SumOfNumInArray {

	int getSumOfNumInArray(int[] arr) {
		int sum = 0;
		int length = arr.length;
		for(int index=0;index<length;index++) {
			sum = sum + arr[index];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = {10,20,30};
		System.out.println(new SumOfNumInArray().getSumOfNumInArray(arr));
	}
}
