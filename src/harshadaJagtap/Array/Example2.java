//sum of prime numbers from array

package harshadaJagtap.Array;

public class Example2 {
	
int sum=0;
	
	int getArraySum(int[] a) {
		for(int index=0; index<a.length;index++) {
			boolean flag=isPrime(a[index]);
			if(flag)
			sum=sum+a[index];
		}
		return sum;
	}
	
	static boolean isPrime(int num) {
		if(num>1) {
		for(int index=2; index<=num/2;index++) {
			if(num%index==0)
				return false;
		}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Example2 example2=new Example2();
		int[] arr= {10,11,13};
		System.out.println(example2.getArraySum(arr));
	}

}
