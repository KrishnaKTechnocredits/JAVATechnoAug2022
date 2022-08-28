/*
Write a program to find given number is prime or not.

input : 15
output : 15 number is not a prime number

input : 17
output : 17 is a prime number

input : -90
output : not a valid number
*/

package akankshaVyas;
class PrimeNum{

	void isPrimeNum(int num){
		if(num < 0)
			System.out.println(num + " not a valid number");
		else{
			boolean status = true;	
			for (int index = 2; index <= num/2; index++){
				if (num%index == 0){
				System.out.println(num + " number is not a prime number");
				status=false;
				break;
				}
			}if (status == true)
			System.out.println(num + " is a prime number");
		}
	}
	
	public static void main(String[] args){
		PrimeNum primeNum = new PrimeNum();
		primeNum.isPrimeNum(15);
		primeNum.isPrimeNum(17);
		primeNum.isPrimeNum(-90);
	}
}