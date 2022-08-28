package sagaryadav;

class Prime{

	void showPrime(int num){
		boolean status=true;
		for (int index=2; index<=Math.sqrt(num); index++){
			if(num%index==0){
				System.out.println("The given number " +num+ " is not a prime number");
				status=false;
				break;
			}
			
		}
			if(status==true){
				System.out.println("The given number " +num+ " is a prime number");
			}
		}
	public static void main(String[] args){
		Prime prime = new Prime();
		System.out.println();
		prime.showPrime(97);
		prime.showPrime(121);
	}
}