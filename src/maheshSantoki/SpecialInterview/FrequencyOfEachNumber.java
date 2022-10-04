//program 7 : print each number with its frequency. 
//input : {10,11,11,10,5,6,5,6,5,5,4}
//output : 10 -> 2
//         11 -> 2
//          5 -> 4
//         6 -> 2
//         4 -> 1

package maheshSantoki.SpecialInterview;

import java.util.Arrays;

public class FrequencyOfEachNumber {
	int getFrequencyOfNumbers(int num, int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
				arr[i] = 0;
			}
		}
		return count;
	}

	void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println(arr[i] + " : " + getFrequencyOfNumbers(arr[i], arr));
			}
		}
	}

	public static void main(String[] args) {
		FrequencyOfEachNumber freq = new FrequencyOfEachNumber();
		int input[] = { 10, 11, 11, 10, 5, 6, 5, 6, 5, 5, 4 };
		System.out.println("Input Array : " + Arrays.toString(input) + "\n" + "Frequency Of each elemnts :");
		freq.display(input);
	}
}
