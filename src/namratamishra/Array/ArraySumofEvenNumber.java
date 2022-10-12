/*Write a method to return sum of all even numbers in given array.
input : {10,11,15,6}
output : 16
*/

package namratamishra.Array;

class ArraySumofEvenNumber {

	int a[] = { 10, 11, 15, 6 };

	int m1() {

		int sum = 0;

		for (int i = 0; i < a.length; i++)
		{
          if(a[i]%2==0)
			sum = sum + a[i];

		}
		return sum;
	}

	public static void main(String[] args) {
		ArraySumofEvenNumber asen = new ArraySumofEvenNumber();
		System.out.println("Sum of Even number from the given set of array is: " + asen.m1());
	}
}