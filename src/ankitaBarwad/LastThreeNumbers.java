package ankitaBarwad;

//Assignment No.10
public class LastThreeNumbers {

	void divisibleBy3_7(int startNumber, int endNumber) {
		int count = 0;

		System.out.println("Last three numbers divisible by 3 and 7 are :");

		for (int number = endNumber; number >= startNumber; number--) {
			if (number % 3 == 0 && number % 7 == 0) {
				System.out.println(number);
				count++;
			}
			if (count == 3)
				break;
		}
	}

	public static void main(String[] args) {
		LastThreeNumbers lastThreeNumbers = new LastThreeNumbers();
		lastThreeNumbers.divisibleBy3_7(10, 200);
	}

}
