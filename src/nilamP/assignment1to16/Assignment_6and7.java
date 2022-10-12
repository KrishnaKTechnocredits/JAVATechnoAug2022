/*Assignment - 6 & 7 : 25th Aug'2022
Write only one program having the following methods. [7 methods in same program] 

1. On user defined range (parameterized method) print all even numbers. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	

2. On user defined range print all numbers which are divisible by 5. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	

3. On user defined range print all numbers which are divisible by 5 and divisible by 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15

4. On user defined range print all numbers which are divisible by 7 or 13. 
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
		 
5. Find sum of all the numbers in user defined range.
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
package nilamP.assignment1to16;

public class Assignment_6and7 {
	void printEvenNumbers(int startIndex, int endIndex) {

		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				System.out.println("Even number is:  " + index);
			}
		}
	}

	void divisibilityby5(int startIndex, int endIndex) {

		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0) {
				System.out.println("divisibility by 5 is:  " + index);
			}
		}
	}

	void divisibilityby5and13(int startIndex, int endIndex) {

		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0 && index % 3 == 0) {
				System.out.println("divisibility by 5 and 3 is:  " + index);
			}
		}
	}

	void divisibleby7and13(int startIndex, int endIndex) {

		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0) {
				System.out.println(index + "  " + "is divisible by 7");
			} else if (index % 13 == 0) {
				System.out.println(index + "  " + "is divisible by 13");
			}
		}
	}

	void sumOfNumbers(int startIndex, int endIndex) {

		int sum = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			sum = sum + index;
		}
		System.out.println("Sum is:  " + sum);
	}

	void differenceInSumOfOddAndEvenNumbers(int startIndex, int endIndex) {
		int sumEven = 0;
		int sumOdd = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0)
				sumEven += index;
			else
				sumOdd = sumOdd + index;
		}
		System.out.println("Difference in sum of od and even numbers is:  " + (sumOdd - sumEven) );
	}

	void oddNumbersInReverseOrder(int startIndex, int endIndex) {

		for (int index = startIndex; index >= endIndex; index--) {
			if (index % 2 != 0) {
				System.out.println("Odd numbers in reverse order is:  " + index);
			}
		}
	}

	public static void main(String[] args) {
		Assignment_6and7 a = new Assignment_6and7();
		System.out.println("Assignment 6 & 7 output");
		System.out.println(" *** Program 1 output ***");
		a.printEvenNumbers(10, 15);
		System.out.println(" *** Program 2 output ***");
		a.divisibilityby5(10, 30);
		System.out.println(" *** Program 3 output ***");
		a.divisibilityby5and13(5, 18);
		System.out.println(" *** Program 4 output ***");
		a.divisibleby7and13(5, 40);
		System.out.println(" *** Program 5 output ***");
		a.sumOfNumbers(1, 5);
		System.out.println(" *** Program 6 output ***");
		a.differenceInSumOfOddAndEvenNumbers(3, 9);
		System.out.println(" *** Program 7 output ***");
		a.oddNumbersInReverseOrder(20, 10);
	}

}
