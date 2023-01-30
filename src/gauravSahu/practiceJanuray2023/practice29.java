package gauravSahu.practiceJanuray2023;

import java.util.ArrayList;

public class practice29 {

	void getNames(ArrayList<String> al) {
		ArrayList<String> outputAl = new ArrayList<String>();
		for (int index = 0; index < al.size(); index++) {
			int digitCount = 0;
			int upperCount = 0;
			String name = al.get(index);
			String lCase = name.toLowerCase();
			char ch = lCase.charAt(0);

			

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				for (int i = 0; i < name.length() - 1; i++) {
					char ch1 = name.charAt(i);
					if (Character.isDigit(ch1)) {
						digitCount++;
					}
					if (Character.isUpperCase(ch1)) {
						upperCount++;
					}
				}
				if (digitCount > 0 && upperCount == 1) {
					outputAl.add(name);
				}
			}
		}
		System.out.println(outputAl);
	}

	public static void main(String[] args) {
		String[] input = { "Aa3shvi", "is4h4a", "i5Sha4n", "nUpur3" };

		ArrayList<String> al = new ArrayList<String>();

		for (String name : input) {
			al.add(name);
		}

		System.out.println(al);

		new practice29().getNames(al);
	}

}
