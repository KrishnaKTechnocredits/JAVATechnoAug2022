package aishwaryaBirajdar;

class Prime{

	void isPrime(int num){
		boolean status = true;
		for(int i =2; i<num/2; i++){
			if(num%i==0){
				status = false;
				System.out.println(num+" is not a prime number ");	
				break;
			}
		}
		if(status == true){
			System.out.println(num+" is a prime number");
		}
	}

	public static void main(String[] args){
		Prime prime = new Prime();
		prime.isPrime(11);
		
		
	}
}