package amrutaSagne;

public class FindReverseNumbers {

	void divisibleBy3And7(int a, int b) {
		int count = 0;
		System.out.println("last three numbers are: ");
		for (int num = 200; num >= 1; num--) {
			if (num % 3 == 0 && num % 7 == 0) {
				count++;
				System.out.println(+num);
				if (count == 3)
					break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindReverseNumbers findNumbers = new FindReverseNumbers();
		findNumbers.divisibleBy3And7(200, 10);
	}

}
