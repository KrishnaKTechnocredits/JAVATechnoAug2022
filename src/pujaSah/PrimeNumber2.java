package pujaSah;

class PrimeNumber2{
	
	void isPrime(int num){
		if(num>0){
			boolean flag=true;
			for(int index=2;index<=Math.sqrt(num);index++){
				if(num%index==0){
					System.out.println(num+" is a Prime Number.");
					flag=false;
					break;
				}
			}
			if (flag==true){
				System.out.println(num+" is a Prime Number.");
			}
		}
		else{
			System.out.println(num+" is an invalid number.");
		}
	}
	
	public static void main(String[] args){
		PrimeNumber2 primeNumber2=new PrimeNumber2();
		primeNumber2.isPrime(121);
		primeNumber2.isPrime(37);
		primeNumber2.isPrime(-10);
	}
}	