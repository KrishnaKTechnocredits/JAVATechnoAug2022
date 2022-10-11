package shubhamG.Assignment21to30;

public class Assignment27StringMethods {

	void getUniqueCharacterFromString(String[] arr) {
		System.out.println("List of unique character in given string\n");
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			System.out.println("Name is " + str);
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (str.indexOf(ch) == str.lastIndexOf(ch)) {
					System.out.println(ch);
				}
			}
			System.out.println("------------------------------");
		}
	}

	void getFirstUniqueCharacterFromString(String[] arr) {
		System.out.println("\n\nFirst unique character\n");
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (str.indexOf(ch) == str.lastIndexOf(ch)) {
					System.out.println("Name is " + str + " : " + ch);
					;
					break;
				}

			}
			System.out.println("------------------------------");
		}
	}

	public static void main(String[] args) {
		Assignment27StringMethods test1 = new Assignment27StringMethods();

		String[] input1 = { "Maulik", "Kanani", "Mahesh", "Kanani" };
		test1.getUniqueCharacterFromString(input1);

		String[] input2 = { "Maulik", "KananiK", "akanksha" };
		test1.getFirstUniqueCharacterFromString(input2);
	}
}
