package amolMule;

public class DivbySecondlastNumber {
	public void processData(int start, int end) {
		int count = 0;
		int i;
		for (i = end; i >= start; i--) {
			if (i % 3 == 0 && i % 7 == 0) {
				count++;
				if (count == 2)
					break;
			}
		}
		System.out.println(i);
	}

	public static void main(String args[]) {
		DivbySecondlastNumber div = new DivbySecondlastNumber();
		div.processData(10, 200);
	}
}
