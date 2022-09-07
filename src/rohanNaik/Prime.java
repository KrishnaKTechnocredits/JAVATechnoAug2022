package rohanNaik;

class Prime{
	
	void isPrime(int num){
		boolean flag= true;
		
		if(num>0){
			for(int index=2;index<=num/2;index++){
				if(num%index==0){
					System.out.println(num + " is Not Prime!");
					flag = false;
					break;
				}
			}
		
			if(flag== true)
				System.out.println(num + " is Prime!");
		}
		else 
			System.out.println("invalid");
	}
	
	public static void main(String[] args){
		Prime prime = new Prime();
		prime.isPrime(17);
		prime.isPrime(91);
		prime.isPrime(22);
		prime.isPrime(13);
		prime.isPrime(1);
		prime.isPrime(-12);
	}
}