package shubhamG;

public class Divisiblity {
	
	void divisibleBy3and7(int startRange, int endRange) {
		System.out.println("Last 3 numbers divisible by 3 and 7 in range:" + startRange + " and " + endRange);
		int count = 0;
		for (int i = endRange; i >= startRange; i--) {
			if (i % 3 == 0 && i % 7 == 0) {
				count++;
				System.out.println("Numbers are :" + i);
				if (count == 3) {
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		Divisiblity divisiblity = new Divisiblity();
		divisiblity.divisibleBy3and7(10,200);
	}

}
