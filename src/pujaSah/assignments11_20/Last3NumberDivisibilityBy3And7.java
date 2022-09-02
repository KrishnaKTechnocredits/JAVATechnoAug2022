package pujaSah.assignments11_20;

public class Last3NumberDivisibilityBy3And7 {

	void numberDivisibility(int x, int y) {
		int count = 1;
		System.out.println(
				"The last three numbers divisible by 3 and 7 starting from range " + x + " to " + y + "  are ");
		for (int index = y; index >= x; index--) {
			if (index % 3 == 0 && index % 7 == 0) {
				if (count <= 3) {
					System.out.println(index);
					count++;
				}
				if (count > 3) {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		new Last3NumberDivisibilityBy3And7().numberDivisibility(20, 100);
	}
}
