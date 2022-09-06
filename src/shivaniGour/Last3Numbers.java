package shivaniGour;

public class Last3Numbers {

	void processData(int startrange, int endrange) {
		int count = 0;
		System.out.println("Last 3 Nos. divisible by 3 and 7: ");
		for (int i = endrange; i >= startrange; i--) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println(i);
				count++;
				if (count == 3)
					break;
			}
		}
	}

	public static void main(String[] args) {
		new Last3Numbers().processData(10, 200);
	}
}
