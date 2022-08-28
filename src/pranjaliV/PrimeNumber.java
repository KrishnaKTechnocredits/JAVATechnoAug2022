package pranjaliV;

class PrimeNumber{
	
	void isPrime(int num){
		if(num>0){
			boolean flag = true;
			for(int index=2; index<=num/2; index++){
				if(num%index==0){
					System.out.println(num + " is not a Prime Number");
					flag = false;
					break;
				}
			}
			if(flag==true){
				System.out.println(num+" is a Prime Number");
			}
		}
		else{
			System.out.println(num + " is an Invalid number");
		}
	}
	
	public static void main(String[] args){
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrime(8);
		primeNumber.isPrime(31);
		primeNumber.isPrime(-108);
		primeNumber.isPrime(15);
		primeNumber.isPrime(17);
		primeNumber.isPrime(-90);
	}
}