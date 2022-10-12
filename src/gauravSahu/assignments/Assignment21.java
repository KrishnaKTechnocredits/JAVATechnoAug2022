package gauravSahu.assignments;

import java.util.Arrays;

public class Assignment21 {

	int getsecondhigh(int[] name) {
		int maxnum = 0;
		int secmaxnum = 0;

		for (int index = maxnum; index < name.length; index++) {
			if (maxnum < name[index]) {
				maxnum = name[index];
			} else if (secmaxnum < name[index]) {
				secmaxnum = name[index];
			}
		}
		return secmaxnum;
	}

	public static void main(String[] args) {
		Assignment21 a1 = new Assignment21();
		int[] name = { 10, 99, 33, 44, 89, 76 };
		int num2 = a1.getsecondhigh(name);
		System.out.println(Arrays.toString(name));
		System.out.println("Second max number in array is " + num2);
	}

}
