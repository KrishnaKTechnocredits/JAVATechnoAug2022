package akankshaVyas;

public class Last3NumDivisibleBy3n7 {

	void last3NumDivisibleBy3n7(int startIndex, int endIndex) {
		int count = 0;
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 3 == 0 && index % 7 == 0) {
				count++;
				System.out.println(index);
			}
			if (count == 3)
				break;
		}
	}

	public static void main(String[] args) {
		new Last3NumDivisibleBy3n7().last3NumDivisibleBy3n7(20, 100);
	}
}
