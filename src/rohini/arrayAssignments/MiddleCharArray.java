package rohini.arrayAssignments;
/*Assignment 19
Program 5: Print middle character of all array elements*/
public class MiddleCharArray {
	void getMiddleChar(String[] input) {
		int midIndex = 0;
		System.out.println("Middle character of below array elements are-");
		for (int index = 0; index < input.length; index++) {
			int length = input[index].length();
			if (length % 2 == 0) {
				midIndex = length / 2 - 1;
				System.out.println(input[index] + ": " + input[index].charAt(midIndex));
			} else {
				midIndex = length / 2;
				System.out.println(input[index] + ": " + input[index].charAt(midIndex));
			}
		}
	}
	public static void main(String[] args) {
		String[] input = { "Rohini", "Techno", "Credits", "Harsh", "Maulik" };
		MiddleCharArray mid = new MiddleCharArray();
		mid.getMiddleChar(input);
	}
}
