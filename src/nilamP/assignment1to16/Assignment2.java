
/*Assignment - 2 : 21st Aug 2021 : 
Calculator program using Parameterized method.
*/
package nilamP.assignment1to16;

public class Assignment2 {
	void add(int x, int y) {
		int ans = x + y;
		System.out.println("addition is " + ans);
	}

	void subtract(int x, int y) {
		int ans = x - y;
		System.out.println("substract is " + ans);
	}

	void multiplication(int x, int y) {
		int ans = x * y;
		System.out.println("multiplication is " + ans);
	}

	void division(int x, int y) {
		int ans = x / y;
		System.out.println("division is " + ans);
	}

	public static void main(String[] args) {
		Assignment2 a = new Assignment2();
		System.out.println("Assignment 2 output : ");
		a.add(10, 40);
		a.subtract(70, 20);
		a.multiplication(30, 15);
		a.division(60, 20);
	}
}


