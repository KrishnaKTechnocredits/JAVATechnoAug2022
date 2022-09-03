package technocredits.loopexamples;

public class PrimeNumberWhile {
	
	void printNPrimeNumbers(int n) {
		int count = 0;
		int num = 2;
		
		while(count != n) {
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
			num++;
		}
	}
	
	public static void main(String[] args) {
		new PrimeNumberWhile().printNPrimeNumbers(5);
		int count = 0;
		for(int num=2;num<=100 && count !=5;num++) {
				if(num %13 == 0) {
					System.out.println(num);
					count++;
				}	
		}
	}
}












