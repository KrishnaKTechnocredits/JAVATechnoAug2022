package sohail.prime_number;

class Prime{
	
	void calculatePrime(int num){
		boolean flag = true;
		if(num<1){
			System.out.println("Invalid");
		}
		for(int index=2; index<=num/2; index++){
			if(num%index==0){
				flag=false;
				System.out.println(num+" is not Prime");
				break;
			}
		}
		if(flag==true){
			System.out.println(num+ " is Prime Number");
		}
		
	}

public static void main (String [] args){
	Prime prime=new Prime();
	prime.calculatePrime(17);	
}
}