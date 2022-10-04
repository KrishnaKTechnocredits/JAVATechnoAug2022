package shivaniLikhia;
class PrimeNumbers{
	
	void processData(int num){
		boolean n = true;
		if(num<1){
			System.out.println("\n" + num +" : Given number is Invalid Number");
		}
		else{
			for(int index=2;index<=num/2;index++){
				if(num%index==0){
					System.out.println("\n" + num + " is not a Prime Number.");
					n=false;
					break;
				}
			}
			if(n==true){
				System.out.println("\n" + num + " is a prime Number");
			}
		}
	}
	
	public static void main(String[] args){
		PrimeNumbers primeNumbers = new PrimeNumbers();
		primeNumbers.processData(15);
		primeNumbers.processData(19);
		primeNumbers.processData(20);
		primeNumbers.processData(31);
		primeNumbers.processData(17);
		primeNumbers.processData(23);
		primeNumbers.processData(-90);
		
	}
}
