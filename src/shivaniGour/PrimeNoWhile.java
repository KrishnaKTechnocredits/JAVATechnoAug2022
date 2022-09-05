package shivaniGour;

public class PrimeNoWhile {

	void prime(int num) {
		int n = 2, count = 1;
		System.out.println("--First " + num + " Prime Numbers--");
		while (count <= num) {
			boolean flag = false;
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.println(n);
				count++;
			}
			n++;
		}
	}

	public static void main(String[] args) {
		new PrimeNoWhile().prime(8);
	}
}
