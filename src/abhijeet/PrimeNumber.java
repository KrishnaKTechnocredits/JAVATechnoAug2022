package abhijeet;

class PrimeNumber{
	
	void findPrimeNumber(int number){
		boolean firstStepExecution = true;
		
		if (number>0){
			for(int n=2 ; n<=Math.sqrt(number) ; n++){
				if(number%n==0){
					firstStepExecution = false;
					System.out.println("The number "+number+" is not a prime number");
					break;
				}
			}
			if (firstStepExecution == true){
				System.out.println("The number "+number+" is a prime number");
			}
		}
		else
			System.out.println("The number "+number+" is a invalid number");
	}	
	
	public static void main (String[]args){
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.findPrimeNumber(21);
		System.out.println();
		primeNumber.findPrimeNumber(97);
		System.out.println();
		primeNumber.findPrimeNumber(-45);
	}
}