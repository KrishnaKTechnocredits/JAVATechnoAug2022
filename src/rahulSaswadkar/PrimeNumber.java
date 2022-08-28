/*
Assignment - 9 : 26th Aug'2022
Write a program to find given number is prime or not.

input : 15
output : 15 number is not a prime number

input : 17
output : 17 is a prime number

input : -90
output : not a valid number
*/

package rahulSaswadkar;

class PrimeNumber{
	public static void main(String[] args){
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrimeNumber(15);
		primeNumber.isPrimeNumber(17);
		primeNumber.isPrimeNumber(-90);
		primeNumber.isPrimeNumber(73);
		primeNumber.isPrimeNumber(0);
		primeNumber.isPrimeNumber(1);
		primeNumber.isPrimeNumber(2);
		primeNumber.isPrimeNumber(3);
		
	}
	
	void isPrimeNumber(int num){
		boolean status = true;
		if (num > 0){
			for(int index = 2; index <= num/2;index++){
				if(num % index == 0){
					status = false;
					System.out.println(num + " is not a Prime Number");
					break;
				}
			}
			//System.out.println(status);
			if(status == true){
			System.out.println(num + " is a Prime Number");
			}
		}else{
			System.out.println(num + " is not a valid number");
		}
	}
}