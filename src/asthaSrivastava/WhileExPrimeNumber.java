package asthaSrivastava;

public class WhileExPrimeNumber {
	int count;
	
	void printPrimeNum(int num){
		
		boolean resultStatus = true;
		
		for(int input= 2;input<=num/2;input++){
				if(num%input == 0){
					resultStatus = false;
					break;
				}
			}
			if(resultStatus == true){
				count++;
				System.out.println(num +" is a Prime Number");
			}
		}		
	void printFirstFivePrime(int iteration) {
		int num =2;
		System.out.println("First five Prime Number are:");
		
		while(num>=2 && count!=iteration) {
			printPrimeNum(num);
			num++;
		}
	}
	
	public static void main(String[] args){
		WhileExPrimeNumber primeNo =new WhileExPrimeNumber();
		primeNo.printFirstFivePrime(5);
		
	}
}			
