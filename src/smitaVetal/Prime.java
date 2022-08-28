package smitaVetal;

class Prime{
		
	void primeYesNo(int num){
		
			boolean flag= true;
			if(num<1){
				System.out.println(num+ " is invalid number");
			}
			else{
			for(int index=2;index<=(Math.sqrt(num));index++){
				if(num%index==0){
					
					System.out.println(num +" Is not prime number");
					flag=false;
					break;
				}
			}
				if(flag==true){
					System.out.println(num + " is prime number");
				}
			}
	}		
	public static void main(String[] args){
		Prime prime=new Prime();
		prime.primeYesNo(2);
		prime.primeYesNo(100);
		prime.primeYesNo(121);
	}
}