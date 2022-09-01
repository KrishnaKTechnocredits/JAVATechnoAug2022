package mohiniA;

public class Assignment10 {

	void Div3and7(int num1, int num2) {
		if (num1 >= 0 && num2 >= 0) {
			int count = 0;
			for (; num2 >= num1; num2--) {

				if (num2 % 3 == 0 && num2 % 7 == 0) {
					System.out.println("Number " + num2 + " is divisible by 3 and 7");
					count++;
				}
				if (count == 3)
					break;
			}
		} else
			System.out.println("Invalid input");

	}

	public static void main(String[] args) {

		Assignment10 num = new Assignment10();
		num.Div3and7(10, 200);

	}

}
