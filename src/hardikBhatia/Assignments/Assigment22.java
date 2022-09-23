package hardikBhatia.Assignments;

import java.util.Arrays;

public class Assigment22 {

	void currentIndexreplace0(int[] numbers) {
		int[] newNumberArray = numbers;
		for (int index = 0; index < numbers.length - 1; index++) {
			if (numbers[index] > numbers[index + 1]) {
				newNumberArray[index] = 0;
			}
		}
		System.out.println("Output : " + Arrays.toString(newNumberArray));
	}
	
	
	public static void main(String[] args) {
		Assigment22 assigment22 = new Assigment22();
		int[] numbers = {10,20,30,22,44,21,92,89};
		System.out.println("Input : {10,20,30,22,44,21,92,89}");
		assigment22.currentIndexreplace0(numbers);
	}
}
