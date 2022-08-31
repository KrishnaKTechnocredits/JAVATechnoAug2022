package saroj;

public class Last3NumbersDivisibleBy3And7 {

	void processData(int startRange, int endRange) {
		int count = 0;
		if (startRange >= 0 && endRange > 0) {
			if (endRange > startRange) {
				System.out.println("Last 3 numbers divisible by 3 and 7 are");
				for (int index = endRange; index >= startRange; index--) {
					if (index % 3 == 0 && index % 7 == 0) {
						System.out.println(index);
						count++;
						if (count == 3) {
							break;
						}
					}
				}
			} else {
				System.out.println("Start range is greater than End range : " + startRange + " and " + endRange);
			}
		} else {
			System.out.println("Invalid Range: " + startRange + " and " + endRange);
		}

	}

	public static void main(String[] args) {
		Last3NumbersDivisibleBy3And7 last3NumbersDivisibleBy3And7 = new Last3NumbersDivisibleBy3And7();
		last3NumbersDivisibleBy3And7.processData(13, 190);
		last3NumbersDivisibleBy3And7.processData(143, 90);
		last3NumbersDivisibleBy3And7.processData(-53, 90);
		last3NumbersDivisibleBy3And7.processData(-3, -212);
		last3NumbersDivisibleBy3And7.processData(12, -85);
	}
}
