/*program 3 : print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8*/
package asthaSrivastava.array.assignments;

public class MissingNumber {

	// method to find missing numbers
	void getAllMissingNumber(int[] arr) {
		System.out.println("Missing number from given array are : ");
		for (int num = 1; num <= 10; num++) {
			boolean flag = true;
			for (int i = 0; i < arr.length; i++) {
				if (num == arr[i]) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println(num);
		}
	}

	public static void main(String[] args) {
		MissingNumber test = new MissingNumber();
		int[] input = { 1, 3, 9, 5, 6, 10 };
		test.getAllMissingNumber(input);
	}
}
