package priyankaD.arrayType;

public class MinAndMaxNumberInString {
//Assignment_19_3_4: Write a method to return max/min number from array.
//input : {11,4,55,23,43}
//output : 55/4
	int maxNumberInArray(int[] arr) {
		int max=0;
		for(int index=0;index<arr.length;index++) {
			if(max<arr[index]) {
				max=arr[index];
			}
		}return max;
	}
	int minNumberInArray(int[]arr) {
		int min=arr[0];
		for(int index=0;index<arr.length;index++) {
			if(min>arr[index]) {
				min=arr[index];
			}
		}return min;
	}
	public static void main(String[]args) {
		int[] arr= {11,4,55,23,43};
		int num=new MinAndMaxNumberInString().maxNumberInArray(arr);
		int num1=new MinAndMaxNumberInString().minNumberInArray(arr);
		System.out.println(num);
		System.out.println(num1);
	}
}
