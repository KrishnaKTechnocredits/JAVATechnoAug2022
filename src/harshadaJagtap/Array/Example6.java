//return sum of not prime numbers from array 


package harshadaJagtap.Array;

public class Example6 {
	int sum=0;
	
	int getArraySumNotPrime(int[] a) {
		for(int index=0; index<a.length;index++) {
			boolean flag=isPrime(a[index]);
			if(flag==false)
			sum=sum+a[index];
		}
		return sum;
	}
	
	boolean isPrime(int n) {
		for(int index=2;index<=n/2;index++) {
			if(n%index==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Example6 example6=new Example6();
		int[] arr= {11,13,17,22,44};
		int noPrimesum=example6.getArraySumNotPrime(arr);
		System.out.println(noPrimesum);
	}
}
