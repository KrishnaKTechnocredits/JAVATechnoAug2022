package technocredits.loopexamples;

public class PrimeNumberWhileSeperateMethods {
	int count = 0;
	
	void checkPrimeNum(int num) {
		boolean flag = true;
		int index=2;
		while(index<=num/2) {
			if(num % index == 0) {
				flag = false;
				break;
			}
			index++;
		}
		
		if(flag == true) {
			System.out.println(num);
			count++;
		}
	}
	
	void printNPrimeNumbers(int n) {
		int num = 2;
		while(count != n) {
			checkPrimeNum(num);
			num++;
		}
	}
	
	public static void main(String[] args) {
		new PrimeNumberWhileSeperateMethods().printNPrimeNumbers(5);
		int count = 0;
		for(int num=2;num<=100 && count !=5;num++) {
				if(num %13 == 0) {
					System.out.println(num);
					count++;
				}	
		}
	}
}












