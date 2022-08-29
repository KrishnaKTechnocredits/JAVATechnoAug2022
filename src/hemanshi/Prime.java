package hemanshi;
class Prime{
	
	void PrimeNumber(int num){
		boolean flag = true;
		
		if(num<1){
			System.out.println(num+" is invalid input");
		}else{
		
		for(int index=2; index<=num/2; index++){
			if(num%2==0){
		
				flag=false;
			System.out.println(num+"is not prime number");
			break;
			}
		}	
	    if(flag==true)
			System.out.println(num+"is a prime number");
		}
	}
	
	public static void main(String[] args){
		Prime prime = new Prime();
		prime.PrimeNumber(15);
		prime.PrimeNumber(17);
		prime.PrimeNumber(-19);
	}

}
