package deepakPatil;

/*Assignment - 7 : 25th Aug'2022
Write only one program having the following methods. [7 methods in same program] 

1. On user define range (parameterized method) print all even numbers. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14

2. On user define range print all numbers which is divisible by 5. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	
		 
3. On user define range print all numbers which is divisible by 5 and divisible by 3. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15
		 
4. On user define range print all numbers which is divisible by 7 or 13. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 7 is divisible by 7
		 13 is divisible by 13
		 14 is divisible by 7
		 21 is divisible by 7
		 26 is divisible by 13
		 28 is divisible by 7
		 35 is divisible by 7
		 39 is divisible by 13
		 
5. Find sum of all the numbers in user define range.
Input : Range -> 1 to 5
output : sum is 15

6. Find difference between sum of odd numbers and even numbers in a given range
Input : Range -> 3 to 9
output : 6
hint : (3+5+7+9) - (4+6+8) = 6

7. Print only odd numbers in reverse order.
Input : Range -> 10 to 20
output : 19
         17
         15
         13
         11
*/
class LoopDemo {

	void findEvenNumbers(int startIndex, int endIndex) {
		System.out.println("\nEven numbers are:");
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 2 == 0)
				System.out.println(num);
		}
	}

	void findDivisibleNumbersBy5(int startIndex, int endIndex) {
		System.out.println("\nDivisble by 5, numbers are:");
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 5 == 0)
				System.out.println(num);
		}
	}

	void findDivisibleNumbersBy5and3(int startIndex, int endIndex) {
		System.out.println("\nDivisible by 5 & 3, numbers are:");
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 5 == 0 && num % 3 == 0)
				System.out.println(num);
		}
	}

	void findDivisibleNumbersBy7or13(int startIndex, int endIndex) {
		System.out.println("\nDivisible by 7 or 13, numbers are:");
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 7 == 0)
				System.out.println(num + " is divisible by 7");
			else if (num % 13 == 0)
				System.out.println(num + " is divisible by 13");
		}
	}

	void findSum(int startIndex, int endIndex) {
		int sum = 0;
		for (int num = startIndex; num <= endIndex; num++) {
			sum = sum + num;
		}
		System.out.println("\nSum is " + sum);
	}

	void findDifferenceBetweenSumOfEvenAndOdd(int startIndex, int endIndex) {
		int sumEven = 0;
		int sumOdd = 0;

		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 2 == 0)
				sumEven = sumEven + num;
			else
				sumOdd = sumOdd + num;
		}
		System.out.println("\n" + (sumOdd - sumEven));
	}

	void printOddNumbersInReverse(int startIndex, int endIndex) {
		System.out.println("");
		for (int num = endIndex; num >= startIndex; num--) {
			if (num % 2 != 0)
				System.out.println(num);
		}
	}

	public static void main(String[] args) {
		LoopDemo loopDemo = new LoopDemo();
		loopDemo.findEvenNumbers(10, 15);
		loopDemo.findDivisibleNumbersBy5(10, 30);
		loopDemo.findDivisibleNumbersBy5and3(5, 18);
		loopDemo.findDivisibleNumbersBy7or13(5, 40);
		loopDemo.findSum(1, 5);
		loopDemo.findDifferenceBetweenSumOfEvenAndOdd(3, 9);
		loopDemo.printOddNumbersInReverse(10, 20);
	}
}