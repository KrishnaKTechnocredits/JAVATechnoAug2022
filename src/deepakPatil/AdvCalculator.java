package deepakPatil;

class AdvCalculator {

	void add(int num1, int num2) {
		System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
	}

	void sub(int num1, int num2) {
		System.out.println("Substraction of " + num2 + " from " + num1 + " is " + (num1 - num2));
	}

	void multi(int num1, int num2) {
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
	}

	void div(int num1, int num2) {
		System.out.println("Division of " + num1 + " by " + num2 + " is " + (num1 / num2));
	}

	public static void main(String[] args) {
		AdvCalculator advCalculator = new AdvCalculator();
		advCalculator.add(20, 10);
		advCalculator.sub(20, 10);
		advCalculator.multi(20, 10);
		advCalculator.div(20, 10);
	}
}