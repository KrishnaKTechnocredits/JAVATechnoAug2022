package saroj.testPrograms;

public class MiddleCharacterArray {

	char getMiddleChar(String[] name) {
		int max = 0;
		char ch = ' ';
		String namLength = "";
		for (int index = 0; index < name.length; index++) {
			if (name[index].length() > max) {
				max = name[index].length();
				namLength = name[index];
			}
		}
		if (max % 2 == 0) {
			max = max / 2 - 1;
		} else {
			max = max / 2;
		}
		ch = namLength.charAt(max);
		System.out.print("Middle character of given name: " + namLength + " :is-> ");
		return ch;
	}

	char[] getMiddleCharFromName(String[] input) {
		char[] ch = new char[input.length];
		int namLength = 0;
		for (int index = 0; index < input.length; index++) {
			namLength = input[index].length();
			if (namLength % 2 == 0) {
				namLength = namLength / 2 - 1;
			} else {
				namLength = namLength / 2;
			}
			ch[index] = input[index].charAt(namLength);
		}
		return ch;
	}

	public static void main(String[] args) {
		MiddleCharacterArray middleCharacterArray = new MiddleCharacterArray();
		String[] name1 = { "Pallavi", "saroj", "Abhishek","Trishla" };
		System.out.println(middleCharacterArray.getMiddleChar(name1));
		char[] ch = middleCharacterArray.getMiddleCharFromName(name1);
		for (int index = 0; index < ch.length; index++) {
			System.out.println("Middle character of " + name1[index] + " is: " + ch[index]);
		}
	}
}
