package amolMule;

public class DivisiblebyReverse {

	public void processData(int start, int end) {
		int count = 0;
		for (int i = end; i >= start; i--) {

			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println(i);
				count++;

				if (count == 3)
					break;
			}
		}
	}

	public static void main(String args[]) {
		DivisiblebyReverse div = new DivisiblebyReverse();
		div.processData(10,200);
	}
}
