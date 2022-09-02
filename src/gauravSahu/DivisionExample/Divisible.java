package gauravSahu.DivisionExample;

public class Divisible {

	int a;
	int count = 0;

	void check(int x, int y) {

		for (int index = x; index <= y; index++) {
			if (index % 3 == 0 && index % 7 == 0) {
				System.out.println("Number is divisible by 3 & 7  " + index);
				count++;
			}
			if (count >= 3)
				break;
		}
	}

	public static void main(String[] args) {
		Divisible divisible = new Divisible();
		divisible.check(20, 100);
	}

}
