
package nikeshM.ArrayProgram;

public class DifferenceOfSum {
	int getSum(int[] num) {
		int evenNoSum = 0;
		int oddNoSum = 0;
		int range = 2;
		int ans = 0;
		int sum = 0;
		int output = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % range == 0) {
				oddNoSum = num[index];
				ans = ans + oddNoSum;
			}

			else {
				evenNoSum = num[index];
				sum = sum + evenNoSum;
			}
		
		output = sum - ans;
		}
		System.out.println(output);
		return ans;
	}

	public static void main(String[] args) {
		int[] input = { 10, 11, 15, 6 };
		new DifferenceOfSum().getSum(input);
	}

}
