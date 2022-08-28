package hindaviIngle;
class PrimeExample1{

	void isPrime(int num){
		for(int index=2;index<num;index++){
			if(num%index==0){
				System.out.println("Number is not prime "+ num);
			}
			}
	}	
	public static void main(String [] args)	{
		PrimeExample1 primeExample1 = new PrimeExample1();
		//primeExample1.isPrime(17);//it wont print anything
		primeExample1.isPrime(32);//it will print 32 4 times
		
	}
	
}