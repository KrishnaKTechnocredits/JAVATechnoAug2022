package shraddhaRekhate.Assignment20;

public class SumOfNonPNoDIvBy5and7 extends SumOfNonPrimeNumber{
	//Time required 12minues
//	2. Write a method to return sum of all non prime numbers 
//			and should be divisible by 5 & 7 from given array.
//			input : {11,35,17,105,44}
//			output : 140
//			Hint : (35+105 = 28)

	int suOfAllNonPrimeNumFromGivenArrayandDivBy7and5(int[] arr) {
		int sum=0;
		for(int index=0;index<arr.length;index++) {
		 boolean flag=checkPrime(arr[index]);
		 if(flag==true) {
			 if( arr[index]%7==0 && arr[index]%5==0)
		       sum =sum+arr[index];
		 }
	    }
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {11,35,17,105,44};
		SumOfNonPNoDIvBy5and7 obj2=new SumOfNonPNoDIvBy5and7();
		System.out.println("Sum of all non prime number divisible by 5 and 7 in given array is "+obj2.suOfAllNonPrimeNumFromGivenArrayandDivBy7and5(arr));
	}
}
