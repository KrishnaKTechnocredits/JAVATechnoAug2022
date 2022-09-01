package akankshaSharma;

public class DivisibilityBy3And7 {
	void test(int startIndex, int endIndex) {
		System.out.println("Last three numbers divisible by 3 and 7 in the range of  " + startIndex + " and " + endIndex
				+ " are: \n");
		int count = 0;
		for (int i = endIndex; i >= startIndex; i--) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println(i);

				count++;
			}
			if (count == 3) {

				break;
			}

		}

	}

	public static void main(String[] args) {
		new DivisibilityBy3And7().test(20, 200);
	}

}
