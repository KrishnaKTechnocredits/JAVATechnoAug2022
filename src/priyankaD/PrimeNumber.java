package priyankaD;

class PrimeNumber{

    void isPrime(int num)
	{   
	    boolean status=true;
		if(num>0){
	    for(int index=2;index<Math.sqrt(num);index++){
			 if(num%index==0){
				status=false;
			    System.out.println(num + " is not a prime number");
				break;
			}
		}
			if(status==true){
		      System.out.println(num + " is a prime number.");
			}
		}
		    else {
			  System.out.println(num+ " is an invalid number.");
			}
	}
	   public static void main(String[]args){
	   PrimeNumber primeNumber= new PrimeNumber();
	   primeNumber.isPrime(17);
	   primeNumber.isPrime(15);
	   primeNumber.isPrime(-90);
	   }
}