package anujaD;

class PrimeNumberEx{
	
	 void prime(int num){
		 if(num>0){
		 boolean flag = true;
		 for( int index=2;index<=num/2;index++){
			 if(num%index == 0){
					System.out.println(num+ " It is not a prime number");
					flag = false;
					break;
				}
			}
			if(flag == true){
					System.out.println(num+ " It is prime number");
				}
			}
			else{
			    System.out.println(num+ " is an Invalid number");
			}
	    }
		
			public static void main(String[] args){
			 PrimeNumberEx primenumberEx1 =new PrimeNumberEx();
			  primenumberEx1.prime(15);
			   primenumberEx1.prime(-108);
			  primenumberEx1.prime(17);
			  primenumberEx1.prime(-90);
		}
	 
}