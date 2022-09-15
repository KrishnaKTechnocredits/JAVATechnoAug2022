/*Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89*/

package shivaniLikhia;

public class SecondLargestNum {

	int getSecondLargestNum(int[] arr) {
		int max=arr[0];
		int secondMax=max;
		for(int index=1;index<arr.length;index++) {
			if(max<arr[index]) {
				max = arr[index];
				System.out.println(max);
			}
			else if(secondMax<arr[index]) {
				secondMax=arr[index];
			}
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,99,33,44,89,76};
		System.out.println(new SecondLargestNum().getSecondLargestNum(arr));
	}
}
