package nehaniG;

public class Test4_1 {
	int treeCount(int[] num) {
		int maxNumber = num[0]; // 3
		int count = 1;
		for (int index = 0; index < num.length; index++) {
			if (maxNumber < num[index]) {
				maxNumber = num[index];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Test4_1 test4_1 = new Test4_1();
		int[] input = { 3, 7, 5 };
		System.out.println("Tree count from given input is " + test4_1.treeCount(input));

		int[] input1 = { 3, 5, 11, 9, 10, 13 };
		System.out.println("Tree count from given input is " + test4_1.treeCount(input1));

	}

}
