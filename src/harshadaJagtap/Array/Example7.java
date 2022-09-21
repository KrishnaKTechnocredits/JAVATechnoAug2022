//sum of no prime plus divisibe by 5 and 7

package harshadaJagtap.Array;

public class Example7 {
	
	int sum=0;
	
	boolean isPrime(int n) {
		if(n>1) {
			for(int index=2;index<=n/2;index++) {
				if(n%index==0) {
					return false;
			}
		}		
	}
		return true;
	}
	
	int getSumNoPrime5and7(int[] num){
		for(int index=0;index<num.length;index++) {
			boolean primeFlag=isPrime(num[index]);
			if(primeFlag==false) {
				if(num[index]%5==0&&num[index]%7==0) {
					sum=sum+num[index];
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Example7 example7=new Example7();		
		int[] arr= {11,35,105,17,44};
		int sumNonPrime=example7.getSumNoPrime5and7(arr);
		System.out.println(sumNonPrime);
		
	}
	
	
}
