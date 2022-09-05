package aditiIngle;

public class PrimeReturn {

	int prime(int n){ 
		int num=2;
		int count=1;
		int sum=0;
		System.out.println("Sum of first " +n +" prime numbers is: ");
		while(count<=n) {
			boolean flag = true;
			for(int index=2; index<=num/2;index++){
				if(num%index==0){
					flag = false;
				}
			}
			
			if(flag == true) {
				sum=sum+num;
				count++;
			}
			num++;
		}
		return sum;
	}
	public static void main(String[] args) {
		int primeSum;
		PrimeReturn primeReturn = new PrimeReturn();
		primeSum = primeReturn.prime(5);
		System.out.println(primeSum);
	}
}
