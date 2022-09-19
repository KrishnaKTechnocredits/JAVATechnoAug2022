package shraddhaRekhate;

class PrimeNumber{
	void isPrime(int num){
		boolean status=true;
		if(num>1){
		   for(int i=2;i<num;i++){
			   if(num%i==0){
				   System.out.println(num+"Number is not a prime number");
				   status=false;
				   break;//this will break for loop
			    }
		    }
		        if(status==true){
			         System.out.println(num+"Number is a prime number");
		        }
		}
		else{
			System.out.println("not a valid number");
		}
	}
	
	 public static void main(String[] args){
		PrimeNumber primeNumber=new PrimeNumber();
		primeNumber.isPrime(15);
		primeNumber.isPrime(17);
		primeNumber.isPrime(-90);
	}
}