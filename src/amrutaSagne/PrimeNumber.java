package amrutaSagne;
class PrimeNumber{

	void checkPrimeNumber(int number){
		boolean status= true;
		if (number>0){
			for(int i=2;i<=number/2; i++){
				if(number%i==0){
					status= false;
					System.out.println (number+" is not prime number");
					break;
				}
			}
				if(status== true){
					System.out.println(number +" is prime number ");
			}
		}	
		else{
			System.out.println(number +" is not valid number ");
		}
}
	public static void main (String[] args){
		PrimeNumber primenumber = new PrimeNumber();	
		primenumber.checkPrimeNumber(96);
		primenumber.checkPrimeNumber(191);
		primenumber.checkPrimeNumber(111);
		primenumber.checkPrimeNumber(-111);	
	}	
}