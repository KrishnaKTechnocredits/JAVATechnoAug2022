package ashishBramhe;

class A8_PrimeNumber{
	
	void isPrime(int number){
		boolean flag = true;
		if(number < 1)
			System.out.println(" " + number + " is not valid input");
		else{
			for(int i=2; i<(number/2); i++){
				if(number%i == 0){
					flag = false;
					System.out.println(" " + number + " is not prime");
					break;
				}
			}
			if(flag == true)
				System.out.println(" " + number + " is prime");
		}
	}
	
	public static void main(String args[]){
		A8_PrimeNumber a8_PrimeNumber = new A8_PrimeNumber();
		a8_PrimeNumber.isPrime(88);
		a8_PrimeNumber.isPrime(83);
		a8_PrimeNumber.isPrime(-10);
	}
}