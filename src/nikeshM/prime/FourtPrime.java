package nikeshM.prime;

public class FourtPrime {

	void m1(int number) {
		int num = 1;

		while (num <= 11) {
			number = 2;
			int count = 0;
			while (number <= num / 2) {
				if (num % number == 0) {
					count++;
					break;
				}
				number++;
			}
			if (count == 0 && num != 1) {
				System.out.println("First Five Prime Number Are " + num);
			}
			num++;
		}
	}

	public static void main(String[] args) {
		new FourtPrime().m1(11);
	}
}
