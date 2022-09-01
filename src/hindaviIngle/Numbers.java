package hindaviIngle;
class Numbers {
	void evenNumber(int startIndex, int endIndex) {
		System.out.println("Even numbers are:");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
		}
		System.out.println("--------------------------------");
	}

	void numberDivisibleBy5(int startIndex, int endIndex) {
		System.out.println("Divisible by 5, numbers are:");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0) {
				System.out.println(index);
			}
		}
		System.out.println("--------------------------------");
	}

	void numberDivisibleBy5and3(int startIndex, int endIndex) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0 && index % 3 == 0) {
				System.out.println(index);
			}
		}
		System.out.println("--------------------------------");
	}

	void numberDivisibleBy7or13(int startIndex, int endIndex) {
		System.out.println("Divisible by 7 or 13, numbers are:");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0) {
				System.out.println(index + " is divisible by 7");
			} else if (index % 13 == 0) {
				System.out.println(index + " is divisible by 13");
			}
		}
		System.out.println("--------------------------------");
	}

	void sum(int startIndex, int endIndex) {
		int ans = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			ans = ans + index;
		}
		System.out.println("sum is " + ans);
		System.out.println("--------------------------------");
	}

	void diffOfSumOddAndEven(int startIndex, int endIndex) {
		int even = 0;
		int odd = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				even = even + index;
			} else {
				odd = odd + index;
			}
			
		}

		System.out.println("diff is " + (odd - even));
		System.out.println("--------------------------------");
	}

	void reverseOddNumber(int startIndex, int endIndex) {
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 2 == 1) {
				System.out.println(index);

			}
		}
		
	}

	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		numbers.evenNumber(10, 15);
		numbers.numberDivisibleBy5(10, 30);
		numbers.numberDivisibleBy5and3(5, 18);
		numbers.numberDivisibleBy7or13(5, 40);
		numbers.sum(1, 5);
		numbers.diffOfSumOddAndEven(3, 9);
		numbers.reverseOddNumber(10, 20);
	}
}