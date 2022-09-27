package vibhaS.Assignment;

public class Assignment27 {

	void printAllUniqueChar(String str) {
		System.out.println(str);
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (str.indexOf(ch) == str.lastIndexOf(ch))
				System.out.println(ch);
		}
	}

	void printUniqueCharacter(String[] arr) {
		for (String str : arr) {
			printAllUniqueChar(str);
			System.out.println(".....................");
		}
	}

	void printAllFirstUnique(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println("Name is " + str + " : " + ch);
				break;
			}
		}
	}

	void printFirstUnique(String[] arr) {
		for (String str : arr) {
			printAllFirstUnique(str);
			System.out.println(".....................");
		}
	}

	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		String[] arr = { "Maulik", "Kanani", "Mahesh", "Kanani" };
		assignment27.printUniqueCharacter(arr);
		System.out.println("");
		System.out.println("");
		String[] arr1 = { "Maulik", "KananiK", "akanksha" };
		assignment27.printFirstUnique(arr1);
	}
}
