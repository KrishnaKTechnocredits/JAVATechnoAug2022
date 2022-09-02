package swatiM.assignments;
class PrimeNumber{
	
	void isPrime(int number){
	  boolean status=true;
	  
	  if(number<1){
		  System.out.println(number+ " Number is Invlid");
	  }
	  else {
			for(int index=2;index<number;index++){
				if(number%index == 0){
					status=false;
					System.out.println(number+ " Number is not prime number");
					break;
				}
			}
			if(status==true)
				System.out.println(number+ " Number is prime number");
		}
			
	}
	public static void main(String[] a){
		PrimeNumber primeNum = new PrimeNumber();
		primeNum.isPrime(15);
		primeNum.isPrime(17);
		primeNum.isPrime(-90);
		
	}
}