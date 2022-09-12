package saroj.stringPrograms;

public class RearrangeString {

	String rearrangeInput1(String name) {
		String rearrangeName = "";
		String rearrangedName1 = "";
		for (int index = 0; index <= name.length() - 1; index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				rearrangeName = rearrangeName + Character.getNumericValue(ch);
			} else {
				rearrangedName1 = rearrangedName1 + ch;
			}
		}

		return rearrangeName + rearrangedName1;
	}

	String rearrangeInput2(String name) {
		String digiName = "";
		String lowerName = "";
		String upperName = "";
		for (int index = 0; index <= name.length() - 1; index++) {
			char ch = name.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperName = upperName + ch;
			} else if (Character.isDigit(ch)) {
				digiName = digiName + Character.getNumericValue(ch);
			} else {
				lowerName = lowerName + ch;
			}
		}
		return upperName + digiName + lowerName;
	}

	int frequencyOfCharacter(String name, char ch) {
		name = name.toLowerCase();
		int count = 0;
		for (int index = 0; index <= name.length() - 1; index++) {
			char ch1 = name.charAt(index);
			if (ch1 == ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		RearrangeString rearrangeString = new RearrangeString();
		String name = "S1ro2j";
		System.out.println(name + " in rearranged format: " + rearrangeString.rearrangeInput1(name));
		String name1 = "te12C4HNo3";
		System.out.println(name1 + " in rearranged form is: " + rearrangeString.rearrangeInput2(name1));
		String name2 = "TechnoTtcredits";
		char ch = 't';
		System.out.println("In " + name2 + "character '" + ch + "' frequency is: "
				+ rearrangeString.frequencyOfCharacter(name2, ch));
	}
}
