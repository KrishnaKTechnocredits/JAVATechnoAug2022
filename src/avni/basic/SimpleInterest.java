package avni.basic;

public class SimpleInterest {
	void interest(int p, double r, int n) {
		System.out.println("SimpleInterest is " + (p * r * n / 100));
	}

	void celsius(double c) {
		System.out.println("celsius " + ((c - 32) * 5 / 9));
	}

	public static void main(String[] args) {
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.interest(1000, 2.5, 5);
		simpleInterest.celsius(100);
	}
}
