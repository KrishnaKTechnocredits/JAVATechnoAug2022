package shivaniGour;

public class Test3MiddleChar {

	char getMiddleChar(String[] arr) {
		int midIndex;
		char midChar = ' ';
		int max = arr[0].length();

		for (int i = 0; i <= arr.length - 1; i++) {
			if (max < arr[i].length()) {
				max = arr[i].length();
				if (max % 2 == 0) {
					midIndex = max / 2 - 1;
				} else {
					midIndex = max / 2;
				}
				midChar = arr[i].charAt(midIndex);
			}
		}

		return midChar;
	}

	char[] getMiddleCharFromName(String[] arr) {
		char[] ch = new char[arr.length];
		int midIndex;

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr.length % 2 == 0) {
				midIndex = arr.length / 2 - 1;
			} else {
				midIndex = arr.length / 2;
			}
			ch[i] = arr[i].charAt(midIndex);
			System.out.println(arr[i] + " -> " + ch[i]);
		}

		return ch;
	}

	public static void main(String[] args) {
		Test3MiddleChar midChar = new Test3MiddleChar();
		String[] arr = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		System.out.println("Max length string middle character is: " + midChar.getMiddleChar(arr));
		System.out.println("\n---Middle character of each element in array---");
		midChar.getMiddleCharFromName(arr);
	}

}
