package nehaniG;

import java.util.Arrays;

public class Assignment30 {
	void findDuplicateNum(int[] num) {
		int[] index = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					index[i] = num[i];
					num[j] = 0;
				}
			}
		}
		System.out.println("Duplicate members are:");
		for (int i = 0; i < index.length; i++) {
			if (index[i] > 0)
				System.out.println(index[i]);
		}
	}

	public static void main(String[] args) {
		Assignment30 findDuplicateNum = new Assignment30();
		int[] num = { 10, 12, 44, 12, 77, 67, 12, 44 };
		System.out.println("Given Array is: " + Arrays.toString(num));
		findDuplicateNum.findDuplicateNum(num);
	}

}