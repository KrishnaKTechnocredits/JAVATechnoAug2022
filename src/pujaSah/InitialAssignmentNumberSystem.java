package pujaSah;

public class InitialAssignmentNumberSystem {

	// Print all even numbers in a user defined range
	void processEvenNumber(int x, int y) {
		System.out.println("1. Even numbers from " + x + " to " + y + " are:");
		for (int index = x; index <= y; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
		}
	}

	// Print all numbers which is divisible by 5 in a user defined range
	void divisibilityBy5(int x, int y) {
		System.out.println("2. The numbers from " + x + " to " + y + " that are divisible by 5 are: ");
		for (int index = x; index <= 30; index++) {
			if (index % 5 == 0) {
				System.out.println(index);
			}
		}
	}

	// Print all numbers which is divisible by 5 and 3 in a user defined range
	void divisibilityBy3And5(int x, int y) {
		System.out.println("3. The nos from " + x + " to " + y + " that are divisible by both 3 and 5 are: ");
		for (int index = x; index <= y; index++) {
			if (index % 3 == 0 && index % 5 == 0) {
				System.out.println(index);
			}
		}
	}

	// Print all numbers which is divisible by 7 or 13 in a user defined range
	void divisibilityBy7Or13(int x, int y) {
		System.out.println("4. The nos from " + x + " to " + y + " that are divisible by 7 or 13 are: ");
		for (int index = x; index <= y; index++) {
			if (index % 7 == 0) {
				System.out.println(index + " is divisible by 7");
			}
			if (index % 13 == 0) {
				System.out.println(index + " is divisible by 13");
			}
		}
	}

	// Print the sum of all the numbers in a user defined range
	void numberAddition(int x, int y) {
		int count = 0;
		for (int index = x; index <= y; index++) {
			count = count + index;
		}
		System.out.println("5. Sum of numbers from " + x + " to " + y + " is: " + count);
	}

	// Print the difference between sum of odd numbers and even numbers in a user
	// defined range
	void processData(int x, int y) {
		int tmp1 = 0;
		int tmp2 = 0;
		int tmp3 = 0;
		for (int index = x; index <= y; index++) {
			if (index % 2 == 0) {
				tmp1 = tmp1 + index;
			} else if (index % 2 != 0) {
				tmp2 = tmp2 + index;
			}
		}
		if (tmp1 > tmp2) {
			tmp3 = tmp1 - tmp2;
			System.out.println("6. Difference between sum of odd numbers and even numbers in range of " + x + " and "
					+ y + " is: " + tmp3);
		} else {
			tmp3 = tmp2 - tmp1;
			System.out.println();
			System.out.println("6. Difference between sum of odd numbers and even numbers in range of " + x + " and "
					+ y + " is: " + tmp3);
		}
	}

	// Print only odd numbers in reverse order in a user defined range
	void DisplayOddNumbers(int x, int y) {
		System.out.println("Odd numbers from " + x + " to " + y + " in reverse order are ");
		for (int index = y; index >= x; index--) {
			if (index % 2 != 0) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		InitialAssignmentNumberSystem initialAssignmentNumberSystem = new InitialAssignmentNumberSystem();
		initialAssignmentNumberSystem.processEvenNumber(10, 15);
		initialAssignmentNumberSystem.divisibilityBy5(10, 30);
		initialAssignmentNumberSystem.divisibilityBy3And5(5, 18);
		initialAssignmentNumberSystem.divisibilityBy7Or13(5, 40);
		initialAssignmentNumberSystem.numberAddition(1, 5);
		initialAssignmentNumberSystem.processData(3, 9);
		initialAssignmentNumberSystem.DisplayOddNumbers(10, 20);
	}
}
