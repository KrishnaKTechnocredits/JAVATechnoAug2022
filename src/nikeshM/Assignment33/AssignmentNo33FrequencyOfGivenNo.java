package nikeshM.Assignment33;

import java.util.Arrays;

////program 7 : print each number with its frequency. 
//input : {10,11,11,10,5,6,5,6,5,5,4}
//output : 10 -> 2
//         11 -> 2
//          5 -> 4
//         6 -> 2
//         4 -> 1

public class AssignmentNo33FrequencyOfGivenNo {

	void getFrequencyOfNo(int[] input) {
		for (int index = 0; index < input.length; index++) {
			System.out.println("Frequency of Each no is : ");
			int count = 1;
			for (int innerindex = index + 1; innerindex < input.length; innerindex++) {
				if (input[index] == input[innerindex] && input[index] != 0) {
					count++;
					input[innerindex] = 0;
				}
			}
			if (input[index] != 0) {
				System.out.println(input[index] + ".........>" + count);
			}

		}

	}

	public static void main(String[] args) {
		AssignmentNo33FrequencyOfGivenNo p1 = new AssignmentNo33FrequencyOfGivenNo();
		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		p1.getFrequencyOfNo(input);
		System.out.println("input no are" + Arrays.toString(input));
	}
}
