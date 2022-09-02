package smitaVetal;

public class PrintPrime {
	int count=0;
	
	void primeNumber(int num) {
		boolean flag = true;
		int index=2;
		while(index<=num/2) {
			if(num % index == 0) {
				flag = false;
				break;
			}
			index++;
		}
		if(flag ==true) {
			count++;
			System.out.println(num);
		}
	}	
	void printfirst(int N) {
		int num = 2;
		System.out.println("first prime numbers are");
		while(num>=2 && count<N) {
			primeNumber(num);
			num++;
		}
		
	}
	
	public static void main(String[] args) {
		new PrintPrime().printfirst(7);
	}
}