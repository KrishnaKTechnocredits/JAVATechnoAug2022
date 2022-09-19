package pujaSah.assignments11_20;

public class PrimeNumberUsingWhileLoop {

	void printPrimeNumbers(int range) {
		int num = 2;
		while (range > 0) {
			boolean flag = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = false;
					num++;
					break;
				}
			}
			if (flag == true) {
				System.out.println(num);
				num++;
				range--;
			}
		}
	}

	public static void main(String[] args) {
		new PrimeNumberUsingWhileLoop().printPrimeNumbers(9);
	}
}
