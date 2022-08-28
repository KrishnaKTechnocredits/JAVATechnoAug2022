package pankajBhatt;

class PrimeNumber{

	void isPrime(int number){
		int flag = 0;
		for(int i =2; i < number / 2; i++){
			if( number % i == 0 ){
				System.out.println(number + ", is not prime");
				flag=1;
				break;
			}
		}
		
		if(flag == 0){
			System.out.println(number + ", is prime");
		}
	}
	
	public static void main(String[] args){
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrime(25);
	}
}