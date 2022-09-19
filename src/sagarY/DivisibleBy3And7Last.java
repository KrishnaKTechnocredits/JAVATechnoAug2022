package sagarY;

public class DivisibleBy3And7Last {

	void divisibleBy3And7(int num1, int num2) {
		System.out.print("Numbers divisible by 3 and 7 between " +num1+ " to " +num2+ " from last are: ");
		int count = 0;
		for (int i = num2; i >= num1; i--) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.print(i + ", ");
				count++;
			}
			if (count == 4)
				break;
		}
	}

	public static void main(String[] args) {
		new DivisibleBy3And7Last().divisibleBy3And7(1, 200);
	}

}
