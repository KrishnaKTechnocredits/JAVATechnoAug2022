//number divided by 1 and itself
//math.sqrt(119);
package anujaD;

class PrimeNumber{
	
		void prime(int num){
			boolean flag = true;
			for(int index=2;index<=num/2;index++){   //optimization 
				if(num%index == 0){
					System.out.println(num+ " is not a prime number");
					flag = false;  //temp veriable
					break;
				}
			}if(flag == true){
			  System.out.println(num+ " is prime number");
			}else{
				 System.out.println(num+ " Invalid number");
				}
		}
			public static void main(String[] args){
				PrimeNumber primeNumber1 = new PrimeNumber();
				primeNumber1.prime(15);
				primeNumber1.prime(17);
				primeNumber1.prime(19);
				primeNumber1.prime(-90);
			}
}