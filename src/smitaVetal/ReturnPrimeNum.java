package smitaVetal;

public class ReturnPrimeNum {
	int count = 0;
	static int sum = 0;

	boolean getPrimeNum(int num) {
		boolean flag = true;
		for (int index = 2; index <= (num / 2); index++) {
			if (num % index == 0)
				flag = false;
		}
			
		
		if (flag) {
			count++;
			sum = sum + num;
		}
		return true;
	}

	int firstPrimeNum(int N) {
		int num = 2;
		System.out.println("Sum of first " + N + " prime numbers are");
		while (num >= 2 && count < N) {
			getPrimeNum(num);
			num++;
		}
		return sum;
	}

	public static void main(String[] args) {
		new ReturnPrimeNum().firstPrimeNum(5);
		System.out.println(sum);
	}
}
