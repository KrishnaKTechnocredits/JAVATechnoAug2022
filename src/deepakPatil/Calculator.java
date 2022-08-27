package deepakPatil;

class Calculator {

	int num1 = 10;
	int num2 = 5;
	int ans;

	void add() {
		ans = num1 + num2;
		System.out.println("Addition is " + ans);
	}

	void sub() {
		ans = num1 - num2;
		System.out.println("Substraction is " + ans);
	}

	void multi() {
		ans = num1 * num2;
		System.out.println("Multiplication is " + ans);
	}

	void div() {
		ans = num1 / num2;
		System.out.println("Division is " + ans);
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		cal.add();
		cal.sub();
		cal.multi();
		cal.div();
	}
}