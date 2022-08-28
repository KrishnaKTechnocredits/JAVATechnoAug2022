package shivaniGour;
class PrimeNumber{
	 void prime(int num){
		 boolean flag = false;
		 for(int i=2;i<=num/2;i++){
			 if(num%i==0){
				 flag= true;
				 break;
			 } 	 
		 }
		 if(flag)
			 System.out.println(num+" is not a Prime Number");
		 else if(num==0 || num==1)
			 System.out.println(num+" is not a Prime Number");
		 else if(num<0)
			 System.out.println(num+" is an Invalid Number");
		 else
			 System.out.println(num+" is a Prime Number");
	 }
	
	 public static void main (String[] args){
		 PrimeNumber primeNum = new PrimeNumber();
			 primeNum.prime(0);
			 primeNum.prime(1);
			 primeNum.prime(17);
			 primeNum.prime(24);
			 primeNum.prime(-8);
}

}


