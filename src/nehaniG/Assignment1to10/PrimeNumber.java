package nehaniG;

class PrimeNumber{

    void isPrimeNumber(int number){
		 boolean flag = true;
		 
		 if(number<1){
			 System.out.println(number+ "is invalid input");
		 }
        else{		 
		 for(int index=2;index<=number/2;index++){
			 if(number%index == 0){
				 flag = false;
				 System.out.println(number + " is not a prime number");
				 break;
			 }
		 }
         if (flag==true)
			 System.out.println(number + " is a prime number");
		}
	}

    public static void main(String[] args){
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.isPrimeNumber(15);
		primeNumber.isPrimeNumber(17);
		primeNumber.isPrimeNumber(-90);
		
    }
}	