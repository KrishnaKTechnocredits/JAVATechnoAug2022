package akankshaVyas.Frequency;

public class Unique {
	void getUniqueCharfromStrin(String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
	}

	void getFirstUniqueCharfromStrin(String str) {
		char ch = ' ';
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}
	}

	void printString(String[] arr) {
		String str = "";
		for (int index = 0; index < arr.length; index++) {
			str = arr[index];
			System.out.print("\n Name is -  " + str + "  : \n");
			getUniqueCharfromStrin(str);
		}
	}

	void printFirstChar(String[] arr) {
		String str = "";
		for (int index = 0; index < arr.length; index++) {
			str = arr[index];
			System.out.println("Name is - " + str + " and first unique charater is :");
			getFirstUniqueCharfromStrin(str);

		}
	}

	public static void main(String[] args) {
		String[] arr = { "maulik", "akanksha", "mikku" };
		new Unique().printString(arr);
		new Unique().printFirstChar(arr);

	}
}
