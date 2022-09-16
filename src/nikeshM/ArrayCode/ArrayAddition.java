package nikeshM.ArrayCode;

public class ArrayAddition {
	int add(int[] num) {
			int ans = 0;
		for (int index = 0; index <= num.length-1; index++) {
			ans = ans + num[index];
		}
		System.out.print("Total Sum  " + ans);
		return ans;
	}

	public static void main(String[] args) {
		ArrayAddition sumAdd = new ArrayAddition();
		int[] num = { 10, 11, 15 };
		sumAdd.add(num);
	}
}
