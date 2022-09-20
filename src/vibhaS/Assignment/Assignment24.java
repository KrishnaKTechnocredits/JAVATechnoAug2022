package vibhaS.Assignment;

public class Assignment24 {

	int[] m1(int[] arr) {
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					sum = sum + arr[j];
				}
			}
			output[i] = sum;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		int[] arr = { 12, 2, 11, 17 };
		int[] ans = assignment24.m1(arr);

		for (int index = 0; index < ans.length; index++) {
			System.out.println(arr[index] + " replace with => " + ans[index]);
		}
	}
}
