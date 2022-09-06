package aishwaryaPawar;

class PrimeNumber{

	void isPrime(int num){
		int value=0;
		for(int index=2;index<=num/2;index++){
			if(num%index==0){
				System.out.println(num+" is not a Prime Number");
				value=1;
				break;
			}
			
		}
		if (value==0){
			System.out.println(num+" is a Prime Number");
		
		}
	}
		
		public static void main(String[] arg){
			PrimeNumber primenumber = new PrimeNumber();
			primenumber.isPrime(121);
			primenumber.isPrime(17);
		}
}
			