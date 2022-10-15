package shraddhaRekhate.Assignment20;

public class SumOfNonPrimeNumber {
//Write a method to return sum of all not prime numbers from given array.
//	input : {11,13,17,22,44}
//	output : 66
//	Hint : (22+44 = 66)
	boolean checkPrime(int num) {
		boolean flag=false;
		for(int index=2;index<num/2;index++) {
			if(num%index==0) {
				flag=true;
			}
		}
		return flag;
	}
	int suOfAllNonPrimeNumFromGivenArray(int[] arr) {
		int sum=0;
		for(int index=0;index<arr.length;index++) {
		 boolean flag=checkPrime(arr[index]);
		 if(flag==true) {
		   sum =sum+arr[index];
		 }
	    }
		return sum;
	}
	public static void main(String[] args) {
		int[] arr= {11,13,17,22,44};
		SumOfNonPrimeNumber obj1=new SumOfNonPrimeNumber();
		System.out.println("Sum of all non prime number in given array is "+ obj1.suOfAllNonPrimeNumFromGivenArray(arr));
	}
}
