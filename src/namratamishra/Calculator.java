package namratamishra;

class Calculator {
	int sum = 0, sub = 0, mul = 0, div = 0;

	void add() {
		int num1 = 100, num2 = 10;
		sum = num1 + num2;
		System.out.println("The sum of two numbers " + num1 + " and " + num2 + " is: " + sum);
	}

	void sub() {
		int num1 = 100, num2 = 10;
		sub = num1 - num2;
		System.out.println("The difference of two numbers " + num1 + " and " + num2 + " is: " + sub);
	}

	void mul() {
		int num1 = 100, num2 = 10;
		mul = num1 * num2;
		System.out.println("The multiplication of two numbers " + num1 + " and " + num2 + " is: " + mul);
	}

	void div() {
		int num1 = 100, num2 = 10;
		div = num1 / num2;
		System.out.println("The division of two numbers " + num1 + " and " + num2 + " is: " + div);
	}

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.add();
		c.sub();
		c.mul();
		c.div();

	}
}