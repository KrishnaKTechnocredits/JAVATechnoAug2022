
/*Assignment - 1: 20th Aug 2021 : 
Calculator program.
*/

package nilamP.assignment1to16;

public class Assignment1 {
	int number1 = 10;
	int number2 = 5;
	int ans = 0;

	void add() {
		ans = number1 + number2;
		System.out.println("Addition is: " + ans);
	}

	void sub() {
		ans = number1 - number2;
		System.out.println("Subtration is " + ans);
	}

	void multi() {
		ans = number1 * number2;
		System.out.println("multiplication is " + ans);
	}

	void div() {
		ans = number1 / number2;
		System.out.println("division is " + ans);
	}

	public static void main(String[] arg) {
		Assignment1 a1 = new Assignment1();
System.out.println("Assignemnt 1 output : ");
		a1.add();
		a1.sub();
		a1.multi();
		a1.div();
	}
}
