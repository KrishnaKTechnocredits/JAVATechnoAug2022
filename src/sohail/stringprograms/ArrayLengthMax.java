//Program 1 : (20 mins)
//Return middle character of max length String from given array.
//input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
//output : c

package sohail.stringprograms;

public class ArrayLengthMax {

	char getMiddleCharacter(String name) {
		int charIndex = name.length() / 2;
		if (name.length() % 2 == 0) {
			charIndex = charIndex - 1;
		}
		return name.toCharArray()[charIndex];
	}

	String getMaximum(String[] names) {
		if (names.length == 0) {
			return "";
		}
		String maxLengthName = names[0];
		for (int index = 1; index < names.length; index++) {
			if (maxLengthName.length() < names[index].length()) {
				maxLengthName = names[index];
			}
		}
		return maxLengthName;
	}

	public static void main(String[] args) {
		ArrayLengthMax arraylengthmax = new ArrayLengthMax();
		String[] str = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		String printMax = arraylengthmax.getMaximum(str);
		char printch = arraylengthmax.getMiddleCharacter(printMax);
		System.out.println(printMax + "  ->  " + printch);

	}

}
