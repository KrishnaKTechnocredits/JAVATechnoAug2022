package shraddhaRekhate.Assignment21_26_29_30;
//Assignment21
//Return second highest from given array.
//input : {10,99,33,44,89,76}
//output : 89

public class SecondDhIghestFromArray {
	int secondHighestNumFromArray(int[] arr) {
		int max=arr[0];
		int secondMax=arr[1];
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>max) {
				secondMax=max;
				max=arr[index];
			}else if(secondMax<arr[index] && max>arr[index]){
				secondMax=arr[index];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		SecondDhIghestFromArray secondDhIghestFromArray=new SecondDhIghestFromArray();
		int arr[]={10,99,33,44,89,76};
		int secondMax=secondDhIghestFromArray.secondHighestNumFromArray(arr);
		System.out.println("Second max index is: "+secondMax);

	}

}
