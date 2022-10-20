package vibhaS.Assignment;

import java.util.Arrays;
import java.util.ArrayList;

public class Assignment38_1 {

	// Remove Deepak With Shivani in given Array
	void RemoveNameFromArrayList(ArrayList<String> listOfName, String name) {
		System.out.println("Remove given name from ArrayList");
		System.out.println("Old arrayList => " + listOfName);
		System.out.println("Replace Deepak with => " + name);
		while (listOfName.contains("Deepak")) {
			int index = listOfName.indexOf("Deepak");
			listOfName.set(index, name);
		}
		System.out.println(listOfName);
	}

	// return middle character whose length is move than 6 words
	String MiddleCharacterMoreThanSixLength(String str) {
		int index;
		String str1 = "";
		if (str.length() > 6) {
			if (str.length() % 2 == 0) {
				index = str.length() / 2 - 1;
			} else {
				index = str.length() / 2;
			}
			str1 = str1 + Character.toString(str.charAt(index));
		}
		return str1;
	}

	void middleCharacter(String[] arr) {
		System.out.println("return Middle Character more than 6 length ");
		System.out.println(Arrays.toString(arr));
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < arr.length; i++) {
			String str = MiddleCharacterMoreThanSixLength(arr[i]);
			char[] ch1 = str.toCharArray();
			for (int index = 0; index < ch1.length; index++) {
				list.add(ch1[index]);
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		Assignment38_1 assignment38_1 = new Assignment38_1();
		ArrayList<String> listOfName1 = new ArrayList<String>();
		listOfName1.add("Manjiri");
		listOfName1.add("Anuja");
		listOfName1.add("Deepak");
		listOfName1.add("Sagar");
		listOfName1.add("Akansha");
		listOfName1.add("Amol");
		listOfName1.add("Deepak");
		listOfName1.add("Deepak");
		String name = "Shivani";
		assignment38_1.RemoveNameFromArrayList(listOfName1, name);
		System.out.println("");
		String[] arr = { "Manjiri", "Anuja", "Deepak", "Sagar", "Akansha", "Amol", "Deepak", "" };
		assignment38_1.middleCharacter(arr);

	}
}
