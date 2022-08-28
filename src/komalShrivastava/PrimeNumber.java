// Komal Shrivastava
// Assignment - 8 : 26th Aug 2022

package komalShrivastava;

class PrimeNumber {

	void verifyPrimeNumber(int number){
		boolean flag = true;
		if(number < 0)
			System.out.println(number + " is an invalid number.");
		else{
			for(int index = 2; index <= Math.sqrt(number); index++){
				if(number%index == 0){
					flag = false;
					System.out.println(number + " is not a Prime number.");
					break;
				}
			}
			if(flag == true)
				System.out.println(number + " is a Prime number.");
		}
	}	
	
	public static void main(String[] args){
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.verifyPrimeNumber(15);
		primeNumber.verifyPrimeNumber(17);
		primeNumber.verifyPrimeNumber(-90);
	}
}	