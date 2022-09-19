package rohanNaik;

public class TestModification {

	void m1(int start, int end) {
		int count = 0;

		for (int index = end; index >= start; index--) {
			if (index % 3 == 0 && index % 7 == 0) {
				System.out.println(index);
				count++;
				if (count >= 3)
					break;
			}
		}
	}

	void m2(int start, int end) {
		int count = 0;

		for (int index = end; index >= start; index--) {
			if (index % 3 == 0 && index % 7 == 0) {
				count++;
				if (count > 1 && count < 3)
					System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		TestModification test = new TestModification();
		test.m1(20, 100);
		System.out.println("----------------");
		test.m2(20, 100);

	}

}
