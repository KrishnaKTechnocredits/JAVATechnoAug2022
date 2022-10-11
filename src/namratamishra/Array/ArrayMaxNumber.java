package namratamishra.Array;
/*
 Write a method to return max number from array. 
input : {11,4,55,23,43}
output : 55
*/

class ArrayMaxNumber {

	int a[] = { 11, 4, 55, 23, 43 };

	int m1() {

		int max = a[0];

		for (int i = 1; i < a.length; i++) {

			if (max < a[i])
				max = a[i];

		}
		return max;
	}

	public static void main(String[] args) {
		ArrayMaxNumber amn = new ArrayMaxNumber();
		System.out.println("Maximum number from the given set of array is: " + amn.m1());
	}
}