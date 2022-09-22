/*Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89
—----------------------------------------
*/

package rohanNaik.Assignments;

public class Assignment21Array {

	int getSecondMax(int[] inputArray) {

		int max = 0;
		int smax = 0;
		for (int index = 0; index < inputArray.length; index++) {

			if (inputArray[index] > max) {
				max = inputArray[index];
			} else if (smax < inputArray[index]) {
				smax = inputArray[index];
			}
		}

		return smax;

	}

	public static void main(String[] args) {
		Assignment21Array obj = new Assignment21Array();
		int[] inputArray = { 10, 99, 33, 44, 89, 76, 91 };
		int smax = obj.getSecondMax(inputArray);
		System.out.println(smax);

	}

}
