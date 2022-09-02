/*Write a program to find given number is prime or not.

input : 15
output : 15 number is not a prime number

input : 17
output : 17 is a prime number

input : -90
output : not a valid number
*/
package deepakBorse.Assignments;

class PrimeNumber{

	void isPrime(int num){
		boolean flag=true;
		
		if(num<=0){
			System.out.println("Provided number is not valid");
		}
		else{
			for(int index=2;index<=Math.sqrt(num);index++){
				if(num%index==0){
					flag=false;
					System.out.println(num+" is not prime number");
					break;
				}
			}
			if(flag==true)
				System.out.println(num+" is prime number");
		}
	}
	
	public static void main(String[] args){
		PrimeNumber PrimeNumber=new PrimeNumber();
		PrimeNumber.isPrime(15);
		PrimeNumber.isPrime(17);
		PrimeNumber.isPrime(-50);
	}
}