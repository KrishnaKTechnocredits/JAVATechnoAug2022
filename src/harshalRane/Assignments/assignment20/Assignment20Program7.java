package harshalRane.Assignments.assignment20;

import java.util.Arrays;

public class Assignment20Program7 {
	String getMaxLength(String[] name) {
		int maxLength = name[0].length();
		String maxString = name[0];

		for (int index = 1; index < name.length; index++) {
			if (name[index].length() > maxLength) {
				maxString = name[index];
			}
		}
		return maxString;
	}

	public static void main(String[] args) {
		Assignment20Program7 a = new Assignment20Program7();
		String[] input = { "Ashish", "Aditty", "Manjiri", "Ankita", "Credits" };
		System.out.println(Arrays.toString(input) + "\n" + a.getMaxLength(input));
	}
}
