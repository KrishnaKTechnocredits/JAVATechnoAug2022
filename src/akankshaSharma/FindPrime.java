package akankshaSharma;
class FindPrime{
	void isPrime(int num){
		boolean temp=true;
		if(num>0){
		for(int i=2;i<num;i++){
			if(num%i==0){
				temp=false;
				System.out.println(num + " is not a prime number");
				break;
			}
		}
			if(temp==true){
				System.out.println(num + " is a prime number");
			}
		}
			else{
				System.out.println(num + " is an invalid input");
			}
	}
	
	public static void main(String[] args){
		FindPrime findPrime = new FindPrime();
		findPrime.isPrime(15);
		findPrime.isPrime(17);
		findPrime.isPrime(-90);
	}
}