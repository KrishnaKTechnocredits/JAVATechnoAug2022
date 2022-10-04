//Program of Calculator by Parameterized Method

package namratamishra.Basic_Operations;

class Calculator_parameterized {

	void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum of two numbers " + num1 + " and " + num2 + " is:" + sum);
	}

	void sub(int num1, int num2) {
		int diff = num1 - num2;
		System.out.println("Difference of two numbers " + num1 + " and " + num2 + " is:" + diff);
	}

	void mul(int num1, int num2) {
		int mul = num1 * num2;
		System.out.println("Multiplication of two numbers " + num1 + " and " + num2 + " is:" + mul);
	}

	void div(int num1, int num2) {
		int div = num1 / num2;
		System.out.println("Division of two numbers " + num1 + " and " + num2 + " is:" + div);
	}

	public static void main(String[] args) {
		Calculator_parameterized c = new Calculator_parameterized();
		c.add(20, 10);
		c.sub(20, 10);
		c.mul(20, 10);
		c.div(20, 10);
	}
}