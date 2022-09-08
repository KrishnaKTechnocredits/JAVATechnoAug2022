package harshalRane.Assignments.assignment18_rearrangeFrequency;

public class Assignment18RearrangeAndFindFrequency {
		static String isDigit(String name) {
			String letter = "";
			String digit = "";
			for (int index = 0; index < name.length(); index++) {
				char ch = name.charAt(index);
				if (Character.isDigit(ch)) {
					digit = digit + ch;
				} else if (Character.isLetter(ch)) {
					letter = letter + ch;
				}
			}
			return digit + letter;
		}

		static String RearrangeLetterDigit(String name) {
			String upper = "";
			String lower = "";
			String digit = "";
			for (int index = 0; index < name.length(); index++) {
				char ch = name.charAt(index);
				if (Character.isUpperCase(ch)) {
					upper = upper + ch;
				} else if (Character.isDigit(ch)) {
					digit = digit + ch;
				} else if (Character.isLowerCase(ch)) {
					lower = lower + ch;
				}
			}
			return upper + digit + lower;
		}

		static int FindFrequencyOfLetter(String input, char targetChar) {
			int count = 0;
			input = input.toLowerCase();
			targetChar = Character.toLowerCase(targetChar);

			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (ch == targetChar) {
					count++;
				}
			}
			return count;
		}

		public static void main(String[] args) {
			System.out.println(Assignment18RearrangeAndFindFrequency.isDigit("te2ch4no"));
			System.out.println(Assignment18RearrangeAndFindFrequency.RearrangeLetterDigit("t8EcHNo5Cred3iTs"));
			System.out.println(Assignment18RearrangeAndFindFrequency.FindFrequencyOfLetter("TechnoTtcredits", 't'));
		}

	}
