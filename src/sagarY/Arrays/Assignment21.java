/*Assignment-21

Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89 */

package sagarY.Arrays;
import java.util.Arrays;

public class Assignment21 {

	int return2ndHighestNum(int[] num) {
		int highestNum = 0;
		int secondHighNum = 0;

		for (int i = 0; i < num.length; i++) {
			if (highestNum < num[i]) {
				highestNum = num[i];
			} else if (secondHighNum < num[i]) {
				secondHighNum = num[i];
			}
		}
		return secondHighNum;
	}

	public static void main(String[] args) {
		int[] num = { 10, 99, 33, 44, 89, 76 };
		System.out.println("Given Array is: \n" + Arrays.toString(num));
		int i = new Assignment21().return2ndHighestNum(num);
		System.out.println("Second highest number in gven array is: \n" + i);
	}

}
