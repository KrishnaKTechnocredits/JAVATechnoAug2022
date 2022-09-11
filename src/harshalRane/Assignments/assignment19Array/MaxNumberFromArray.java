package harshalRane.Assignments.assignment19Array;

public class MaxNumberFromArray {
	int getMaxNumFromArray(int[] num) {
		int max = 0;
		for (int index = 0; index < num.length; index++) {
			if (max < num[index]) {
				max = num[index];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		MaxNumberFromArray maxNumberFromArray = new MaxNumberFromArray();
		int num[] = { 11, 4, 55, 23, 43 };
		System.out.println("Maximum Number from Given array is: " + maxNumberFromArray.getMaxNumFromArray(num));
	}
}
