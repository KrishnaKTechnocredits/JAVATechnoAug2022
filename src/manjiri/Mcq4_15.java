package manjiri;

public class Mcq4_15 {

	public static void main(String[] args) {
		System.out.println(Mcq4_15.m1());
	}

	static int m1() {
		int n = 1;
		int m = 0;
		while (true) {
			m = m2(n);
			if (m % 3 == 1)
				break;
			n++;
		}
		return m;
	}

	static int m2(int n) {
		return ((2 * n) - 1);
	}
}
