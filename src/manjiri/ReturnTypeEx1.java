package manjiri;

public class ReturnTypeEx1 {
	
	boolean isPrime(int num) {
		int index = 2;
		boolean flag = true;
		while(index <= Math.sqrt(num)) {
			if (num % index == 0) {
				flag = false;
				break;
			}
			index++;
		}
		if(flag) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void sumOfPrimeNum(int n) {
		int count = 0;
		int sum = 0;
		int num = 1;
		boolean result = false;
		while(count != n) {
			result = isPrime(num);
			if (result) {
				count++;
				sum = sum + num;
			}
			num++;
		}
		System.out.println("Sum of first "+ n +" prime numbers is " + sum);
	}
	
	public static void main(String[] args) {
		new ReturnTypeEx1().sumOfPrimeNum(5);
	}
}
