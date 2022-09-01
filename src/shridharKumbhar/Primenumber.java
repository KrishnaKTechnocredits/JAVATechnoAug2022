//Primenumber
package shridharKumbhar;

class Primenumber{
	void isPrime(int num){		
		if ( num == 1){
			System.out.print("Its one");
		}else {
			int status = 0;
			for(int i = 2 ; i<= num/2; i++ ){
				if (num % i == 0){
					System.out.println(" "+ num + " is divisible by " + i);
					status = 1;
					break;
				}
			}
			if (status == 0)
				System.out.println(" "+ num + " is prime num ");
		}
	}
	static public void main(String [] a){
		Primenumber primenumber = new Primenumber();
		primenumber.isPrime(4);
		primenumber.isPrime(1);
		primenumber.isPrime(17);
		primenumber.isPrime(493);
		primenumber.isPrime(24);
		primenumber.isPrime(19);
	}
}