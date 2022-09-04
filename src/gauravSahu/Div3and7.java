package gauravSahu;

public class Div3and7 {

	int a;
	int count;

	void check(int x, int y) {
		for (int index = y; index >= x; index--) {
			if (index % 3 == 0 && index % 7 == 0) {
				System.out.println("Number is divisible by 3 & 7 " + index);
				count++;
				if (count == 3)
					break;
			}
		}
	}

	public static void main(String[] args) {
		Div3and7 div3and7 = new Div3and7();
		div3and7.check(10, 200);
	}
}