package deepakBorse;

public class ProgrammingTest1 {

	void processData(int startR, int endR) {
		int count1 = 0, index;
		System.out.println("First 3 numbers Divisible by 3 & 7 from " + startR + " to " + endR);
		for (index = startR; index <= endR; index++) {
			if (index % 3 == 0 && index % 7 == 0) {
				System.out.println(index);
				count1++;
			}
			if (count1 == 3)
				break;
		}

	}

	public static void main(String[] args) {
		ProgrammingTest1 ProgrammingTest1 = new ProgrammingTest1();

		ProgrammingTest1.processData(20, 100);
	}

}
