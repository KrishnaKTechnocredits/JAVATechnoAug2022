package pujaSah.assignments1_10;

public class NumberDivisibility {

	void processData() {
		System.out.println("Numbers starting from 1 to 20 that are divisible by 3 are:");
		for (int index = 1; index <= 20; index++) {
			if (index % 3 == 0) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		NumberDivisibility numberDivisibility =
				new NumberDivisibility();
		numberDivisibility.processData();
	}
}
