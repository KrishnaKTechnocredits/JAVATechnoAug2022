package harshadaJagtap.LoopExapmples;
class PrimeNumber{
	
	void isPrime(int num){
		boolean b=true;
		if (num>1){
			for(int index=2;index<=Math.sqrt(num);index++){
				if(num%index==0){
					System.out.println(num+" is not a prime number");
					b=false;
					break;
				}
			}
		
			if(b==true){
				System.out.println(num+" is a prime number");
			}
		}
		else{
			System.out.println("not a valid number");
		}	
	}
	
	public static void main(String[]args){
		PrimeNumber primeNum=new PrimeNumber();
		primeNum.isPrime(15);
		primeNum.isPrime(17);
		primeNum.isPrime(-90);
		primeNum.isPrime(-15);
		primeNum.isPrime(-17);
	} 
	
}

