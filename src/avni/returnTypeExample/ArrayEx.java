package avni.returnTypeExample;

public class ArrayEx {
	boolean checkNotprime(int num) {
		boolean flag=true;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					flag=false;
					break;
				}else
					flag=true;
			}
		return flag;
	}
	int getSumOfNotPrime(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			boolean flag1=checkNotprime(arr[i]);
			if(flag1==false)
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		ArrayEx notprimesum=new ArrayEx();
		int[] input = {11,13,17,22,44};
		System.out.println("Sum of not Prime numbers : "+notprimesum.getSumOfNotPrime(input));
	}
}
