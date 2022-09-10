//3) Write a method to return max number from array.
//input : {11,4,55,23,43}
//output : 55

//4) Write a method to return min number from array.
//input : {11,4,55,23,43}
//output : 4

package shivaniLikhia;

public class FindMaxAndMinInArray {
	int index;
	int getMaxNumInArray(int[] arr) {
		int max = 0;
		for(index=0;index<arr.length;index++)
			if(max<arr[index]) {
			max = arr[index];
			}
		return max;
	}
	
	int getMinNumInArray(int[] arr) {
		int min = arr[0];
		for(index=0;index<arr.length;index++) {
			if(arr[index]<min) {
				min = arr[index];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		FindMaxAndMinInArray findMaxAndMinInArray = new FindMaxAndMinInArray();
		int[] arr = {11,4,55,23,43};
		System.out.println(findMaxAndMinInArray.getMaxNumInArray(arr));
		System.out.println(findMaxAndMinInArray.getMinNumInArray(arr));
	}
}
