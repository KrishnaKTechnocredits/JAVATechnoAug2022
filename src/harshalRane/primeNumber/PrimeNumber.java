package harshalRane.primeNumber;

class PrimeNumber{
	
	void isPrime(int num){
		boolean status = true;
		
		for(int index=2;index<=Math.sqrt(num);index++){
			if(num%index == 0){ 
				System.out.println(num + " is not a prime number");
				status = false;
				break;
			}
		}
		if(status == true){
			System.out.println(num + " is a prime number");
		}
	}
	
	public static void main(String[] args){
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrime(17);
		primeNumber.isPrime(80);
	}
}