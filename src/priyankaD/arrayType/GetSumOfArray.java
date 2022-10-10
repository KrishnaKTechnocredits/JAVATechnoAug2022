package priyankaD.arrayType;

public class GetSumOfArray {
	//Assignment_19_1: Write a method to return sum of all numbers in given array.
	//input : {10,11,15}
	//output : 36
	int getSumOfArray(int[] arr) {
		int sum=0;
		for(int index=0;index<arr.length;index++) {
			sum=sum+arr[index];
		}return sum;
	}
//Assignment_19_2: Write a method to return sum of all prime numbers from given array.
//input : {11,14,17,22,44}
//output : 28
	boolean isPrime(int arr1) {
		boolean flag=true;
		for(int index=2;index<arr1;index++) {
			if(arr1%index==0) {
				flag=false;
				break;
			}if(flag) {}
		}return flag;
	}
	int getPrimeSum(int[] arr1) {
		int sum=0;
		for(int index=0;index<arr1.length;index++) {
			boolean primeFlag=isPrime(arr1[index]);
			if(primeFlag==true)
				sum=sum+arr1[index];
		}return sum;
	}
	public static void main(String[]args) {
		int[] arr= {10,11,15};
		int[]arr1= {11,14,17,22,44};
		int sum=new GetSumOfArray().getSumOfArray(arr);
		int primeSum=new GetSumOfArray().getPrimeSum(arr1);
		System.out.println(sum);
		System.out.println(primeSum);
	}
}
