package shraddhaRekhate.Assignment19;

public class MinNumber {
//	Write a method to return min number from array.
//			input : {11,4,55,23,43}
//			output : 4

	int minNumber(int[] arr) {
		int min=arr[0];
		for(int index=0;index<arr.length;index++) {
			if(arr[index] < min) {
			min=arr[index];
			} 
		}
		return min;
	}
	public static void main(String[] args) {
		MinNumber obj=new MinNumber();
		int[] arr= {11,4,55,23,43};
		System.out.println(obj.minNumber(arr));
	}

}
