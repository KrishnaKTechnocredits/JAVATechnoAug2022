package pujaSah.assignments11_20;

public class FindVisibleTress {

	int getCountOfVisibleTrees(int[] height) {
		int maxHeight = height[0];
		int count = 1;
		for (int i = 1; i <= height.length - 1; i++) {
			if (height[i] > maxHeight) {
				maxHeight = height[i];
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		int[] inArr1 = { 3, 7, 5 };
		int[] inArr2 = { 3, 5, 11, 9, 10, 13 };
		System.out.println("No. of visible tress where height are in order: 3,7,5 are "
				+ new FindVisibleTress().getCountOfVisibleTrees(inArr1));
		System.out.println("No. of visible tress where height are in order: 3,5,11,9,10,13 are "
				+ new FindVisibleTress().getCountOfVisibleTrees(inArr2));
	}
}
