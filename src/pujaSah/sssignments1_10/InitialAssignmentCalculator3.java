package pujaSah.sssignments1_10;

public class InitialAssignmentCalculator3 {

	void add(int x, int y) {
		int ans = x + y;
		System.out.println("Addition is " + ans);
	}

	void subtract(int x, int y) {
		int ans = x - y;
		System.out.println("Subtraction is " + ans);
	}

	void multiply(int x, int y) {
		int ans = x * y;
		System.out.println("Multiplication is " + ans);
	}

	void divide(int x, int y) {
		int ans = x / y;
		System.out.println("Division is " + ans);
	}

	public static void main(String[] args) {
		InitialAssignmentCalculator3 initialAssignmentCalculator3 = new InitialAssignmentCalculator3();
		initialAssignmentCalculator3.add(5, 10);
		initialAssignmentCalculator3.subtract(30, 10);
		initialAssignmentCalculator3.multiply(10, 10);
		initialAssignmentCalculator3.divide(20, 2);
	}
}
