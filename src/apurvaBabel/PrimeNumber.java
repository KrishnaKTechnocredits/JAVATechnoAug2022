package apurvaBabel;

class PrimeNumber{
	
	void isPrime(int num){
		boolean status = true;
		if(num>0){
			for(int index = 2;index<= Math.sqrt(num);index++){ //index<=num/2 can also be used
				if(num%index==0){
					status = false;
					System.out.println(num + " is not a prime number.");
					break;
				}
			}
			if(status == true){
				System.out.println(num + " is a prime number.");
			}
		}
		else {
			System.out.println(num + " is not a valid number");
		}
	}
	
	public static void main(String[] args){
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrime(25);
		primeNumber.isPrime(29);
		primeNumber.isPrime(-13);
	}
}