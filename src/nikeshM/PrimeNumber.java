package nikeshM;

class PrimeNumber {
			
	void prime(int num){
				boolean status = true;
			if (num>0){
				for (int index = 2 ; index<num/2 ; index++){
						if (num%index ==0){
							System.out.println(num + " is  not Prime Number");
							status = false;
							break;
						}
					}
			
						 if (status == true) { 
							System.out.println(num + "is  Prime Number");
						}
			}				else 
								System.out.println(num + "Number is Invalid ");
	
	}	
				
			
	public static void main (String[] args){
		PrimeNumber primeNumber = new PrimeNumber();
			primeNumber.prime(15);
			primeNumber.prime(17);
			primeNumber.prime(-20);
			
	}
}