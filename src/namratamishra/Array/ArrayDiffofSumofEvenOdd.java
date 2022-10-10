/*write a method to return difference of sum of all even numbers and odd numbers in given array.
input : {10,11,15,6}
output : 10
Hint : 16 - 26 = 10
*/
package namratamishra.Array;

class ArrayDiffofSumofEvenOdd {

	int a[] = { 10, 11, 15, 6 };

	int m1() {

		int sumOdd = 0, sumEven = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0)
				sumEven += a[i];
			else
				sumOdd += a[i];
		}
		return sumOdd - sumEven;
	}

	public static void main(String[] args) {
		ArrayDiffofSumofEvenOdd asen = new ArrayDiffofSumofEvenOdd();
		System.out.println("Difference of sum of even number & odd number from given array is: " + asen.m1());
	}
}