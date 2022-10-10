
//Write only one program having the following methods. [7 methods in same program]

package namratamishra.Basic_Operations;

public class ManyOperationsWithinSingleClass {
	void getEvenNumber(int startIndex, int endIndex) {
		System.out.println("Even Numbers are: ");
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}

	void getNumberdivby5(int startIndex, int endIndex) {
		System.out.println("Divisible by 5, Numbers are: ");
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 5 == 0)
				System.out.println(i);
		}
	}

	void getNumberdivby5and3(int startIndex, int endIndex) {
		System.out.println("Divisible by 5 & 3,  Numbers are: ");
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 5 == 0 && i % 3 == 0)
				System.out.println(i);
		}
	}

	void getNumberdivby7and13(int startIndex, int endIndex) {
		System.out.println("Divisible by 7 or 13,  Numbers are: ");
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 7 == 0)
				System.out.println(i + " is divisible by 7");
			else if (i % 13 == 0)
				System.out.println(i + " is divisible by 13");
		}
	}

	void getSumofAllNumbers(int startIndex, int endIndex) {
		int sum = 0;
		for (int i = startIndex; i <= endIndex; i++) {

			sum = sum + i;

		}
		System.out.println("sum of all numbers from the given range is: " + sum);
	}

	void getDiffofSumofOddandevenNumbers(int startIndex, int endIndex) {

		int sumOdd = 0, sumEven = 0;
		for (int i = startIndex; i <= endIndex; i++) {

			if (i % 2 == 0)
				sumEven = sumEven + i;
			else
				sumOdd = sumOdd + i;
		}
		System.out.println(
				"Difference between sum of Even and Odd Numbers from the given range are: " + (sumOdd - sumEven));
	}

	void getOddNumReverseOrder(int startIndex, int endIndex) {
		System.out.println("Odd Numbers in the reverse order from the given range are: ");
		for (int i = endIndex; i >= startIndex; i--)
			if (i % 2 != 0)
				System.out.println(i);

	}

	public static void main(String[] args) {
		ManyOperationsWithinSingleClass mowsc = new ManyOperationsWithinSingleClass();
		mowsc.getEvenNumber(10, 15);
		mowsc.getNumberdivby5(10, 30);
		mowsc.getNumberdivby5and3(5, 18);
		mowsc.getNumberdivby7and13(5, 40);
		mowsc.getSumofAllNumbers(1, 5);
		mowsc.getDiffofSumofOddandevenNumbers(3, 9);
		mowsc.getOddNumReverseOrder(10, 20);
	}

}
