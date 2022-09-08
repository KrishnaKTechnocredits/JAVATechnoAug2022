package pujaSah.assignments11_20;

public class EvenPositionCharacter {

	String getEvenPositionChars(String name) {
		int length = name.length();
		String evenChars = "";
		for (int i = 1; i < length - 1; i += 2) {
			evenChars += name.charAt(i);
		}
		return evenChars;
	}

	public static void main(String[] args) {
		String str = "technocredits";
		String evnChars = new EvenPositionCharacter().getEvenPositionChars(str);
		System.out.println("The even position characters in string " + str + " are " + evnChars);
	}
}
