package swapnilMaheshwari.Test4;

public class TreeVisibility {
	int getCountOfVisibleTree(int[] arr) {
		int count = 0;
		int tempMaxHeight = 0;
		for (int i = 0; i < arr.length; i++) {
			if (tempMaxHeight < arr[i]) {
				tempMaxHeight = arr[i];
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		int[] input = { 3, 7, 5 };
		System.out.println("The visible tree are: " + new TreeVisibility().getCountOfVisibleTree(input));
		int[] input1 = { 3, 5, 11, 9, 10, 13 };
		System.out.println("The visible tree are: " + new TreeVisibility().getCountOfVisibleTree(input1));
	}

}
