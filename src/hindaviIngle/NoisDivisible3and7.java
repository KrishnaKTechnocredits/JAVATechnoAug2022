package hindaviIngle;

public class NoisDivisible3and7 {

	int count;

	void noDivisibility(int startindex, int endindex) {
		for (int index = startindex; index <= endindex; index++) {
			if (index % 3 == 0 && index % 7 == 0) {
				System.out.println(index + " is divisible by 3 & 7");
				count++;
			}
			if (count == 3) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		NoisDivisible3and7 noisDivisible3and7 = new NoisDivisible3and7();
		noisDivisible3and7.noDivisibility(20, 100);
	}
}
