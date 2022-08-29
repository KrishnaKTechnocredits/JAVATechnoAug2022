package rashmiG;

class PrimeNumber{
	
	void isPrime(int num){
		if(num>0){
			boolean flag = true;
			for(int index=2; index<=num/2; index++){
				if(num%index==0){
					System.out.println(num+" is not a prime number");
					flag=false;
					break;
				}
			}
			if(flag==true){
				System.out.println(num+" is a prime number");
			}
		}
		else{
			System.out.println("Invalid Number...");
		}
		
	}
	
	public static void main(String[] args){
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrime(5);
		primeNumber.isPrime(1);
		primeNumber.isPrime(10);
		primeNumber.isPrime(-9);
		primeNumber.isPrime(0);
		primeNumber.isPrime(21);
		primeNumber.isPrime(35);
		
	}
}
		
			
		
				
				