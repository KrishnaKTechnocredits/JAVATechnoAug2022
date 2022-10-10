/*
Assignment - 22 : 15th Sep'2022

Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}
*/
package namratamishra.Array;

class ArrayRepalcingElements {

	void replaceArrayElements(int[] a) {

		for (int i = 0; i < a.length; i++) {

			if (i < a.length - 1)

			{
				if (a[i] < a[i + 1])
					System.out.print(a[i] + ",");
				else {
					a[i] = 0;
					System.out.print(a[i] + ",");
				}
			} else
				System.out.print(a[i]);
		}

	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 22, 44, 21, 92, 89 };
		ArrayRepalcingElements are = new ArrayRepalcingElements();
		are.replaceArrayElements(a);
	}
}