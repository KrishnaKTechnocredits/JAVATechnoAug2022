package hindaviIngle;

public class NumDivBy3N7 {

	int count = 0;

	void NumDivisibility(int startIndex, int endIndex) {
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 3 == 0 && index % 7 == 0) {
				System.out.println("Number is " + index);
				count++;
			}
			if (count == 3) {
				break;
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumDivBy3N7 numDivBy3N7 = new NumDivBy3N7();
		numDivBy3N7.NumDivisibility(10, 200);
	}
}
