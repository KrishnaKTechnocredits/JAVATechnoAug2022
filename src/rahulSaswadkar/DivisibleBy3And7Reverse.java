package rahulSaswadkar;

public class DivisibleBy3And7Reverse{
	public static void main(String[] args) {
		DivisibleBy3And7Reverse divisibleBy3And7Reverse = new DivisibleBy3And7Reverse();
		divisibleBy3And7Reverse.findDivisibleNumbers(200, 10, 3, 7);
		divisibleBy3And7Reverse.findSecondLastDivisibleNumber(200, 10, 3, 7);
	}

	void findDivisibleNumbers(int startIndex, int endIndex, int divisor1, int divisor2) {
		int count = 0;
		for (int index = startIndex; index >= endIndex; index--) {
			if (index % divisor1 == 0 && index % divisor2 == 0) {
				System.out.println(index);
				count += 1;
				if (count == 3) {
					break;
				}
			}
		}
	}

	void findSecondLastDivisibleNumber(int startIndex, int endIndex, int divisor1, int divisor2) {
		int count = 0;
		for (int index = startIndex; index >= endIndex; index--) {
			if (index % divisor1 == 0 && index % divisor2 == 0) {
				count += 1;
				if(count == 2) {
					System.out.println("\nSecond last number is : " + index);
					break;
				}
			}
		}
	}
}
