//2) Write a method to return sum of all prime numbers from given array.
//input : {11,14,17,22,44}
//output : 28
//Hint : (11+17 = 28)

package shivaniLikhia;

public class SumOfPrimeNumInArray {
	
	int getSumOfPrimeNumInArray(int[] arr) {
		int sum = 0;
		for(int index=0;index<arr.length;index++) {
			boolean isPrimeFlag = true;
			for(int j=2;j<arr[index];j++) {
				if(arr[index]%j==0) {
					isPrimeFlag = false;
					break;
				}
			}
			if(isPrimeFlag){
				sum = sum + arr[index];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = {11,14,17,22,44};
		System.out.println(new SumOfPrimeNumInArray().getSumOfPrimeNumInArray(arr));
	}
	
}
