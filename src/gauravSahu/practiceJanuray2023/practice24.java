package gauravSahu.practiceJanuray2023;

public class practice24 {

	public static void main(String[] args) {

		String input = "apdz";

		String output = " ";

		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);

			if (ch == 'Z') {
				output = output + 'A';
			} else if (ch == 'z') {
				output = output + 'a';
			} else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
				ch++;
			}
			output = output + ch;
		}
		System.out.println(output);
	}

}
