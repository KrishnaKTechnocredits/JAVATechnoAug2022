package technocredits.loopexamples;

public class PrimeNumber {
	
	void printNPrimeNumbers(int n) {
		int count = 0;
		int num = 2;
		
		while(count != n) {
			boolean flag = true;
			for(int index=2;index<=num/2;index++) {
				if(num % index == 0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}
	
	public static void main(String[] args) {
		new PrimeNumber().printNPrimeNumbers(5);
	}
}
