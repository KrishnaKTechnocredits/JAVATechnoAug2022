package swapnilMaheshwari.DivisibleProgramms;

public class TotalCountDivisibleBy3and7 {
	void processData(int startRange, int endRange) {
		int count = 0;
		for (; startRange < endRange; startRange++) {

			if (startRange % 3 == 0 && startRange % 7 == 0) {
				System.out.println(startRange);
				count++;
			}
		}
		System.out.println("Total count of the number which are divisible by 3 and 7 are :" + count);
	}

	public static void main(String[] args) {
		TotalCountDivisibleBy3and7 totalCountDivisibleBy3and7 = new TotalCountDivisibleBy3and7();
		totalCountDivisibleBy3and7.processData(10, 200);
	}
}