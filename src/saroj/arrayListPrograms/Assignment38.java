package saroj.arrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment38 {

	void replaceNameWithOtherName(String[] name, String oldName, String newName) {
		List<String> list = Arrays.asList(name);
		// ArrayList<String> arrayList = new ArrayList<String>(list);
		while (list.contains(oldName)) {
			int index = list.indexOf(oldName);
			list.set(index, newName);
		}
		System.out.println("New name list: " + list);
	}

	void increaseMarks(Integer[] marks) {
		List<Integer> list = Arrays.asList(marks);
		System.out.println("Old List is: " + list);
		for (int index = 0; index < list.size(); index++) {
			int value = list.get(index);
			if (value < 35) {
				list.set(index, value + 10);
			}
		}
		System.out.println("New list of marks after addition: " + list);
	}

	void getMiddleCharacter(String[] nameList) {
		List<Character> list = new ArrayList<>();
		int midlenght;
		for (int index = 0; index < nameList.length; index++) {
			if (nameList[index].length() > 6) {
				midlenght = (nameList[index].length() - 1) / 2;
				char ch = nameList[index].charAt(midlenght);
				list.add(ch);
			}
		}
		System.out.println("Middle characters are: " + list);
	}

	void listOfName(String[] nameList) {
		List<String> list = new ArrayList<String>();
		for (int index = 0; index < nameList.length; index++) {
			String word = nameList[index];
			boolean flag1 = false;
			boolean flag2 = false;
			char ch = word.charAt(0);
			if (ch == 'a' || ch == 'A' || ch == 'I' || ch == 'i' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'
					|| ch == 'e' || ch == 'E') {
				for (int innerIndex = 0; innerIndex < word.length(); innerIndex++) {
					char ch1 = word.charAt(innerIndex);
					if (Character.isDigit(ch1)) {
						flag1 = true;
					}
					if (Character.isUpperCase(ch1)) {
						flag2 = true;
					}
				}
				if (flag1 && flag2) {
					list.add(word);
				}
			}
		}
		System.out.println("Names are: " + list);
	}

	public static void main(String[] args) {
		Assignment38 assignment38 = new Assignment38();
		String[] arrayName = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		String name1 = "Deepak";
		String name2 = "Shivani";
		assignment38.replaceNameWithOtherName(arrayName, name1, name2);
		System.out.println("==================================================================");

		Integer[] marksArray = { 23, 55, 34, 88, 58, 81 };
		assignment38.increaseMarks(marksArray);
		System.out.println("==================================================================");

		String[] str = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		assignment38.getMiddleCharacter(str);
		System.out.println("==================================================================");

		String[] str1 = { "Aa3shvi", "is4h4a", "i5Sha4n", "nUpur3" };
		assignment38.listOfName(str1);
	}
}
