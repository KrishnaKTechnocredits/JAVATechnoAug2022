/*
Write a method to return name having maximum length.
input : {"Ashish","Aditty","Manjiri","Ankita","Credits"}
output : Credits
*/

package akankshaVyas.ArrayWork;

public class MaxLengthName {

	String getStringCount(String[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[0].length() <= arr[index].length()) {
				arr[0] = arr[index];
			}
		}
		return arr[0];

	}

	public static void main(String[] args) {
		String[] arr = { "Ashish", "Aditty", "Manjiri", "Ankita", "Credits" };
		System.out.println(new MaxLengthName().getStringCount(arr));

	}
}
