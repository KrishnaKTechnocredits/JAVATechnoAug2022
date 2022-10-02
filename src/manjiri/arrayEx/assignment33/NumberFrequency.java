/*program 7 : print each number with its frequency. 
input : {10,11,11,10,5,6,5,6,5,5,4}
output : 10 -> 2
         11 -> 2
          5 -> 4
         6 -> 2
         4 -> 1*/

package manjiri.arrayEx.assignment33;

public class NumberFrequency {

	void printFrequencyOfNumbersInArray(int[] input) {
		for (int index = 0; index < input.length; index++) {
			int count = 0;
			for (int innerIndex = index+1; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex]) {
					input[innerIndex] = 0;
					count++;
				}
			}
			if (input[index] != 0) {
				System.out.println(input[index] + "-->" + (count+1));
			}
		}
	}

	public static void main(String[] args) {

		int[] inputArr = { 10, 11, 11, 10, 5, 6, 5, 6, 5, 5, 4 };
		new NumberFrequency().printFrequencyOfNumbersInArray(inputArr);
	}
}
