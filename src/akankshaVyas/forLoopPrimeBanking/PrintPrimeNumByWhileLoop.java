package akankshaVyas.forLoopPrimeBanking;

public class PrintPrimeNumByWhileLoop {
	
int count=0;
	
	
	void checkPrimeNumByFor(int num){
		boolean status = true;	
		for (int index = 2; index <= num/2; index++){
			if (num%index == 0){
			status=false;
			break;
			}
		}if (status == true){
			System.out.println(num + " is a prime number ");
			count++;
		}
	}
	
	void checkPrimeNumByWhile(int number){
		int index = 2;
		boolean status = true;
		while(index <= number/2){
			if( number % index == 0){
				System.out.println(number + " is not a prime number \n");
				status = false;
				break;
			}
		index++;
		} if(status==true){
			System.out.println(number + " is a prime number \n");
		}
	}
	
	void countPrime(int n){
		int num =2;
		while(count != n){
			checkPrimeNumByFor(num);
			num++;
		}
	}
	
	public static void main(String[] args){
		new PrintPrimeNumByWhileLoop().checkPrimeNumByWhile(15);
		new PrintPrimeNumByWhileLoop().countPrime(5);	
	}

}
