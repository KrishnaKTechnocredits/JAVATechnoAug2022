package nehaniG;

	public class Assignment26 {
		void getFrequencyOfCharacters(String input) {
			int originalLength = 0;
			int newLength = 0;
			int frequency = 0;

			while (input.length() > 0) {
				originalLength = input.length();

				char ch = input.charAt(0);
				String str = Character.toString(ch);
				input = input.replace(str, "");
				newLength = input.length();
				frequency = originalLength - newLength;

				System.out.println("\"" + ch + "\"" + " -> " + frequency);
			}
		}

		public static void main(String[] args) {
			String input = "technocreditst";
			System.out.println("Given String is: " + input);
			System.out.println("Frequency of following characters in given string is: \n");
			Assignment26 assignment26 = new Assignment26();
			assignment26.getFrequencyOfCharacters(input);
		}
	}


