package avni;

class Prime {

	void isPrime(int num) {
		boolean flag = true;
		if (num > 0) {
			int n = (num / 2);
			for (int i = 2; i <= n; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println(" prime");
			else
				System.out.println(" not prime");
		}

	}

	public static void main(String[] args) {
		Prime prime = new Prime();
		prime.isPrime(17);
		prime.isPrime(18);
	}
}