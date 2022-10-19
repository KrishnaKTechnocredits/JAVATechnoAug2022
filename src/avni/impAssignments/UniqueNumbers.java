package avni.impAssignments;

import java.util.Arrays;

public class UniqueNumbers {
	void printUniqueNum(int[] input) {
		System.out.println("Unique numbers from given array : ");

		for (int i = 0; i < input.length; i++) {
			int count = 0;
			for (int j = 0; j < input.length; j++) {
				if (input[i] == input[j] && i != j) {
					count++;
				}
			}
			if (count == 0 && i != 0)
				System.out.println( input[i]);
		}
	}
	public static void main(String[] args) {
		UniqueNumbers uniq=new UniqueNumbers();
		int[] input={10,20,10,44,33,55,33};
		System.out.println("Given Array : "+Arrays.toString(input));
		uniq.printUniqueNum(input);
	}
}

