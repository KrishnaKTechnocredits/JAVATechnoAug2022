package ankitaBarwad;

class PrimeNumber{
		
	void isPrimeNumber(int number){
		boolean status = true;
		
		if(number <= 0){
			System.out.println(number + " is not a valid number");
		}else{
			for(int index=2;index<number/2;index++){
				if(number%index == 0){
					status = false;
					System.out.println(number + " is not a prime number");
					break;
				}
			}
			if(status == true){
				System.out.println(number + " is a prime number");
			}
		}
	}
	
	public static void main(String[] args){
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrimeNumber(21);
		primeNumber.isPrimeNumber(17);
		primeNumber.isPrimeNumber(-9);
		primeNumber.isPrimeNumber(179);
	}
}