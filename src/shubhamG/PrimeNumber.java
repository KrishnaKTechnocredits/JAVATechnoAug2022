package shubhamG;
class PrimeNumber{

	void checkPrimeNumber(int num){
		boolean prime = true;
	
		if(num<=0){
			System.out.println(num+" Not a valid number");
		}
		else if(num==1){
			System.out.println(num+" is valid number but not a prime number");
		}
		else{
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
					prime = false;
					System.out.println(num+"  is not a prime number");
					break;
				}
				else{
					prime =true;
				}
			}
			if(prime==true){
				System.out.println(num+"  is a prime number");
			}
		}
	}
	
	public static void main(String args[]){
		PrimeNumber primeNumber =new PrimeNumber();
		
		primeNumber.checkPrimeNumber(15);
		primeNumber.checkPrimeNumber(17);
		primeNumber.checkPrimeNumber(-90);
		primeNumber.checkPrimeNumber(1);
	}
}








