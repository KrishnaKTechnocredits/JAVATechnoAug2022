package vibhaS.Assignment;

import java.util.Arrays;
import java.util.ArrayList;

public class Assignment38_3 {

	void m1(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int index = 0; index < arr.length; index++) {
			boolean flag = m2(arr[index]);
			if (flag == true) {
				list.add(arr[index] + 10);
			} else {
				list.add(arr[index]);
			}
		}
		System.out.println(list);
	}

	boolean m2(int num) {
		if (num < 35) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Assignment38_3 assignment38_3 = new Assignment38_3();
		int[] arr2 = { 23, 55, 34, 88, 58, 81 };
		assignment38_3.m1(arr2);
	}
}
