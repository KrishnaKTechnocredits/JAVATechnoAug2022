//5) Write a method to print middle character of all array elements.
//input : {"Ashish","Aditty","Manjiri","Ankita"}
//output : Ashish -> h
//         Aditty -> i
//		 Manjiri -> j
//		 Ankita -> k

package sohail.array;

public class ArrayString {
	char getMiddleCharacter(String name) {
		int charIndex = name.length() / 2;
		if (name.length() % 2 == 0) {
			charIndex = charIndex - 1;
		}
		return name.toCharArray()[charIndex];
	}

	void PrintMiddleCharFromArray(String[] name) {
		for (int index = 0; index < name.length; index++) {
			char ch = getMiddleCharacter(name[index]);
			System.out.println(name[index] + " -> " + ch);
		}
	}

	public static void main(String[] args) {
		ArrayString arraystring = new ArrayString();
		String[] input = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		arraystring.PrintMiddleCharFromArray(input);

	}

}
