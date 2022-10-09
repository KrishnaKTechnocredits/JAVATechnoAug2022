package namratamishra.Array;
/*
Write a method to return min number from array.
input : {11,4,55,23,43}
output : 4
*/

class ArrayMinNumber {

	int a[] = { 11, 4, 55, 23, 43 };

	int m1() {

		int min = a[0];

		for (int i = 1; i < a.length; i++) {

			if (min > a[i])
				min = a[i];

		}
		return min;
	}

	public static void main(String[] args) {
		ArrayMinNumber amn = new ArrayMinNumber();
		System.out.println("Minimum number from the given set of array is: " + amn.m1());
	}
}