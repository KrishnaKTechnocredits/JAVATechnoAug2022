package technocredits;

public class PrimeNumber {

	void checkPrimeNum() {
		for(int num=17;num<=100;num++) {
			boolean primeFlag = true;
			for(int index=2;index<=num/2;index++) {
				if(num%index==0) {
					primeFlag = false;
					//System.out.println(num + " is not a prime number");
					break;
				}
			}
			if(primeFlag == true)
				System.out.println(num + " is a prime number");
		}
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.checkPrimeNum();
	}
}
