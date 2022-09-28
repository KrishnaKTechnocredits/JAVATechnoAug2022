package sanket;

public class ArrayOperationsEx8 {

	// method gives you the unique character in String name
	void uniqueCharacterInString(String arr) {

		for (int index = 0; index < arr.length(); index++) {
			char ch = arr.charAt(index);
			if (arr.indexOf(ch) == arr.lastIndexOf(ch)) {
				ch = arr.charAt(index);
				System.out.println(ch);
			}
		}
	}

	// method gives you first unique character in String name
	void firstUniqueCharacterInString(String arr) {

		for (int index = 0; index < arr.length(); index++) {
			char ch = arr.charAt(index);
			if (arr.indexOf(ch) == arr.lastIndexOf(ch)) {
				ch = arr.charAt(index);
				System.out.println(ch);
				break;
			}
		}
	}

	// method gives you the unique character in String array
	void uniqueCharacterInStringArray(String[] arr) {

		for (int index = 0; index < arr.length; index++) {
			System.out.println("The unique character is for String " + arr[index]);
			uniqueCharacterInString(arr[index]);
			System.out.println("------------------------------------------------------");
		}

	}

	// method gives you first unique character of name in String array
	void firstUniqueCharacterInStringArray(String[] arr) {

		for (int index = 0; index < arr.length; index++) {
			System.out.println("The first unique character is for String " + arr[index]);
			firstUniqueCharacterInString(arr[index]);
			System.out.println("------------------------------------------------------");
		}

	}

	public static void main(String[] args) {

		String[] input = { "Maulik", "Kanani", "Mahesh", "KananiK" };
		String[] input2 = { "Maulik", "KananiK", "akanksha" };
		ArrayOperationsEx8 arrayMethod = new ArrayOperationsEx8();
		System.out.println("*****Program 1 Solution****");
		arrayMethod.uniqueCharacterInStringArray(input);
		System.out.println("*****Program 2 Solution****");
		arrayMethod.firstUniqueCharacterInStringArray(input2);
	}
}
