package sanket;

class PrimeNumber{
	
	void findPrimeNumber (int num){
		if (num>0){
			boolean status = true;
			for (int index=2; index<=num/2; index++){		
				if (num%index==0){
					System.out.println("\n" + ""+num+" is not a prime number.");
					status = false;
					break;
				}
			}
		
			if (status==true){
				System.out.println("\n" + ""+num+" is a prime number.");
			}
		}
		else 
			System.out.println("\n" + ""+num+" is not a valid number.");
	}
		
		public static void main(String [] args) {
			PrimeNumber primeNumber1 = new PrimeNumber();
			primeNumber1.findPrimeNumber(15);
			primeNumber1.findPrimeNumber(17);
			primeNumber1.findPrimeNumber(-90);
		}
}