package mohiniA.Parameter;

public class SimpleIntrest {

	void intrestCalc(int principle, int period) {

		double rate = 4.3;
		double Sint;

		Sint = ((principle * period * rate) / 100);
		System.out.println("Simple intrest for Principle amount " + principle + " for period " + period + "yrs is "
				+ Sint + " with rate of intrest " + rate);
	}

	public static void main(String[] args) {
		SimpleIntrest user = new SimpleIntrest();
		SimpleIntrest user2 = new SimpleIntrest();
		user.intrestCalc(2000, 2);
		user2.intrestCalc(150000, 15);
		user.intrestCalc(200000, 20);

	}

}
