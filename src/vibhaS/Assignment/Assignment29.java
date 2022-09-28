package vibhaS.Assignment;

public class Assignment29 {

	// Shift all Zero at the beggining of an array
	int[] getZeroAtEnd(int[] arr) {
		int output[] = new int[arr.length];
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0) {
				count++;
			}
		}
		for (int indexx = 0; indexx < arr.length; indexx++) {
			if (arr[indexx] != 0) {
				output[count] = arr[indexx];
				count++;
			}
		}
		return output;
	}

	// Shift all Zero at the end of an array
	int[] getZeroInBegining(int[] arr) {
		int indexx = 0;
		int[] output = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				output[indexx] = arr[index];
				indexx++;
			}
		}
		return output;
	}

	public static void main(String[] str) {
		Assignment29 assignment29 = new Assignment29();
		int[] arr = { 10, 0, 2, 0, 0, 3, 4, 5 };
		int[] ans = assignment29.getZeroAtEnd(arr);
		for (int j = 0; j < ans.length; j++) {
			System.out.println("All Zero At the begining " + ans[j]);
		}
		System.out.println("");
		int[] ans1 = assignment29.getZeroInBegining(arr);
		for (int i = 0; i < ans1.length; i++) {
			System.out.println("All Zero At the begining " + ans1[i]);
		}
	}
}
