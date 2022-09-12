package harshalRane.Assignments.assignment19Array;

public class PrintMiddleCharArray {
	char getMiddleChar(String name) {
		int index = 0;
		int length = name.length();
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		char ch = name.charAt(index);
		return ch;
	}

	public static void main(String[] args) {
		String[] arr = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		PrintMiddleCharArray printMiddleCharArray = new PrintMiddleCharArray();
		System.out.println("Middle name of " + arr[0] + " is: " + printMiddleCharArray.getMiddleChar(arr[0]));
		System.out.println("Middle name of " + arr[1] + " is: " + printMiddleCharArray.getMiddleChar(arr[1]));
		System.out.println("Middle name of " + arr[2] + " is: " + printMiddleCharArray.getMiddleChar(arr[2]));
		System.out.println("Middle name of " + arr[3] + " is: " + printMiddleCharArray.getMiddleChar(arr[3]));
	}
}
