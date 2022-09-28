package saroj.arrayPrograms;

public class Assignment27 {

	void getUniqCharacterInName(String name) {
		while (name.length() > 0) {
			String ch = Character.toString(name.charAt(0));
			int originalLength = name.length();
			name = name.replace(ch, "");
			int presentNameLength = originalLength - name.length();
			if (presentNameLength == 1)
				System.out.println(ch);
		}
	}

	void getUniqCharInStringArray(String[] name) {
		for (int index = 0; index < name.length; index++) {
			System.out.println("Name is: " + name[index] + " \nUnique characters are: ");
			getUniqCharacterInName(name[index]);
			System.out.println("====================");
		}
	}

	void getFirstUniqChar(String name) {
		// name= name.toLowerCase();
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			int firstOccurance = name.indexOf(ch);
			int lastOccurance = name.lastIndexOf(ch);
			if (firstOccurance == lastOccurance) {
				System.out.println(ch);
				break;
			}
		}
		System.out.println("====================");
	}

	void getFirstUniqCharInString(String[] name) {
		for (int index = 0; index < name.length; index++) {
			System.out.print("Name is " + name[index] + " :");
			getFirstUniqChar(name[index]);
		}
	}

	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		String[] str = { "Maulik", "Kanani", "Mahesh" };
		String[] str1 = { "Maulik", "KananiK", "Mahesh" };
		assignment27.getUniqCharInStringArray(str);
		assignment27.getFirstUniqCharInString(str1);
	}
}
